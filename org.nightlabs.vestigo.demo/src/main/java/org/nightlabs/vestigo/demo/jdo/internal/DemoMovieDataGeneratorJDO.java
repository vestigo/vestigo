package org.nightlabs.vestigo.demo.jdo.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import javax.jdo.Extent;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;

import org.nightlabs.vestigo.demo.jdo.Language;
import org.nightlabs.vestigo.demo.jdo.Movie;
import org.nightlabs.vestigo.demo.jdo.Person;
import org.nightlabs.vestigo.demo.jdo.Rating;

public class DemoMovieDataGeneratorJDO {

	protected String getPersistenceUnitName() {
		return "vestigoDemoMovieJDO";
	}

	protected Map<String, Object> getPersistenceProperties() {
		final Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("datanucleus.autoCreateTables", "true");
		return properties;
	}

	private PersistenceManagerFactory getEntityManagerFactory() {
		return JDOHelper.getPersistenceManagerFactory(getPersistenceProperties(), getPersistenceUnitName());
	}

	private PersistenceManager createEntityManager() {
		return getEntityManagerFactory().getPersistenceManager();
	}

	public static void main(final String[] args) throws Throwable {
		new DemoMovieDataGeneratorJDO().run();
	}

	protected void run() throws Throwable {
		PersistenceManager pm = createEntityManager();

		pm.currentTransaction().begin();

		boolean commit = false;

		try {
			Extent<Movie> movieExtent = pm.getExtent(Movie.class);
			assert (movieExtent != null);
			if (movieExtent.iterator().hasNext()) {
				System.out.println("importDataCsv: already imported before => skipping.");
				return;
			}

			System.out.println("importDataCsv: nothing imported before => importing now.");

			Query queryMovieByName = pm.newQuery(Movie.class);
			queryMovieByName.setFilter("this.name == :name");
			queryMovieByName.setUnique(true);

			Query queryPersonByName = pm.newQuery(Person.class);
			queryPersonByName.setFilter("this.name == :name");
			queryPersonByName.setUnique(true);

			Query queryLanguageByName = pm.newQuery(Language.class);
			queryLanguageByName.setFilter("this.name == :name");
			queryLanguageByName.setUnique(true);

			Query queryRatingByName = pm.newQuery(Rating.class);
			queryRatingByName.setFilter("this.name == :name");
			queryRatingByName.setUnique(true);

			BufferedReader r = new BufferedReader(new InputStreamReader(
					DemoMovieDataGeneratorJDO.class.getResourceAsStream("/org/nightlabs/vestigo/demo/data.csv"), "UTF-8"));
			String line;
			while ((line = r.readLine()) != null) {
				String[] fields = line.split("\t");
				int fieldNo = -1;
				String movieName = safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo]);
				String starringName = safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo]);
				String[] writtenByNames = safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo].split(","));
				String[] languageNames = safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo].split(","));
				String[] directedByNames = safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo].split(","));
				String[] producedByNames = safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo].split(","));
				String tagline = safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo]);
				/* String initialReleaseDate = */safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo]);
				String ratingName = safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo]);
				/* String estimatedBudget = */safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo]);
				/* String sequel = */safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo]);
				/* String prequel = */safeTrim(fields.length <= ++fieldNo ? null : fields[fieldNo]);

				Movie movie = (Movie) queryMovieByName.execute(movieName);
				if (movie == null) {
					movie = new Movie();
					movie.setName(movieName);
					movie = pm.makePersistent(movie);
				}

				if (starringName != null) {
					Person person = (Person) queryPersonByName.execute(starringName);
					if (person == null) {
						person = new Person();
						person.setName(starringName);
						person = pm.makePersistent(person);
					}
					if (!movie.getStarring().contains(person)) {
						movie.getStarring().add(person);
					}
				}

				if (languageNames != null) {
					for (String languageName : languageNames) {
						Language language = (Language) queryLanguageByName.execute(languageName);
						if (language == null) {
							language = new Language();
							language.setName(languageName);
							language = pm.makePersistent(language);
						}
						if (!movie.getLanguages().contains(language)) {
							movie.getLanguages().add(language);
						}
					}
				}

				if (writtenByNames != null) {
					for (String writtenByName : writtenByNames) {
						Person person = (Person) queryPersonByName.execute(writtenByName);
						if (person == null) {
							person = new Person();
							person.setName(writtenByName);
							person = pm.makePersistent(person);
						}
						if (!movie.getWrittenBy().contains(person)) {
							movie.getWrittenBy().add(person);
						}
					}
				}

				if (directedByNames != null) {
					for (String directedByName : directedByNames) {
						Person person = (Person) queryPersonByName.execute(directedByName);
						if (person == null) {
							person = new Person();
							person.setName(directedByName);
							person = pm.makePersistent(person);
						}
						if (!movie.getDirectedBy().contains(person)) {
							movie.getDirectedBy().add(person);
						}
					}
				}

				if (producedByNames != null) {
					for (String producedByName : producedByNames) {
						Person person = (Person) queryPersonByName.execute(producedByName);
						if (person == null) {
							person = new Person();
							person.setName(producedByName);
							person = pm.makePersistent(person);
						}
						if (!movie.getProducedBy().contains(person)) {
							movie.getProducedBy().add(person);
						}
					}
				}

				movie.setTagLine(tagline);

				if (ratingName != null) {
					Rating rating = (Rating) queryRatingByName.execute(ratingName);
					if (rating == null) {
						rating = new Rating();
						rating.setName(ratingName);
						rating = pm.makePersistent(rating);
					}
					movie.setRating(rating);
				}
				else {
					movie.setRating(null);
				}

			}
			r.close();

			pm.flush(); // flush to get a correct time measurement.

			commit = true;

		} finally {
			if (commit) {
				pm.currentTransaction().commit();
			}
			else {
				pm.currentTransaction().rollback();
			}
		}
	}

	private static String safeTrim(final String s) {
		if (s == null) {
			return null;
		}

		return s.trim();
	}

	private static String[] safeTrim(final String[] ss) {
		if (ss == null) {
			return null;
		}

		for (int i = 0; i < ss.length; i++) {
			ss[i] = safeTrim(ss[i]);
		}

		return ss;
	}
}
