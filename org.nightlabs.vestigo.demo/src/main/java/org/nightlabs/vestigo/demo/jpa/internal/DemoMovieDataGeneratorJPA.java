package org.nightlabs.vestigo.demo.jpa.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.nightlabs.vestigo.demo.jpa.Language;
import org.nightlabs.vestigo.demo.jpa.Movie;
import org.nightlabs.vestigo.demo.jpa.Person;
import org.nightlabs.vestigo.demo.jpa.Rating;

public class DemoMovieDataGeneratorJPA {

	protected String getPersistenceUnitName() {
		return "vestigoDemoMovieJPA";
	}

	protected Map<String, Object> getPersistenceProperties() {
		final Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("datanucleus.autoCreateTables", "true");
		return properties;
	}

	private EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory(getPersistenceUnitName(), getPersistenceProperties());
	}

	private EntityManager createEntityManager() {
		return getEntityManagerFactory().createEntityManager();
	}

	public static void main(final String[] args) throws Throwable {
		new DemoMovieDataGeneratorJPA().run();
	}

	protected void run() throws Throwable {

		EntityManager em = createEntityManager();
		EntityTransaction tx = em.getTransaction();
		boolean commit = false;
		try {
			tx.begin();

			System.out.println("importDataCsv: entered");

			Query queryMovieByName = em.createQuery("SELECT m FROM " + Movie.class.getName() + " m WHERE m.name = :name");

			Query queryPersonByName = em.createQuery("SELECT p FROM " + Person.class.getName() + " p WHERE p.name = :name");

			Query queryLanguageByName = em.createQuery("SELECT l FROM " + Language.class.getName() + " l WHERE l.name = :name");

			Query queryRatingByName = em.createQuery("SELECT r FROM " + Rating.class.getName() + " r WHERE r.name = :name");

			BufferedReader r = new BufferedReader(new InputStreamReader(
					DemoMovieDataGeneratorJPA.class.getResourceAsStream("/org/nightlabs/vestigo/demo/data.csv"), "UTF-8"));
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

				queryMovieByName.setParameter("name", movieName);
				Movie movie = (Movie) getSingleResultOrNull(queryMovieByName);
				if (movie == null) {
					movie = new Movie();
					movie.setName(movieName);
					em.persist(movie);
				}

				if (starringName != null) {
					queryPersonByName.setParameter("name", starringName);
					Person person = (Person) getSingleResultOrNull(queryPersonByName);
					if (person == null) {
						person = new Person();
						person.setName(starringName);
						em.persist(person);
					}
					if (!movie.getStarring().contains(person)) {
						movie.getStarring().add(person);
					}
				}

				if (languageNames != null) {
					for (String languageName : languageNames) {
						queryLanguageByName.setParameter("name", languageName);
						Language language = (Language) getSingleResultOrNull(queryLanguageByName);
						if (language == null) {
							language = new Language();
							language.setName(languageName);
							em.persist(language);
						}
						if (!movie.getLanguages().contains(language)) {
							movie.getLanguages().add(language);
						}
					}
				}

				if (writtenByNames != null) {
					for (String writtenByName : writtenByNames) {
						queryPersonByName.setParameter("name", writtenByName);
						Person person = (Person) getSingleResultOrNull(queryPersonByName);
						if (person == null) {
							person = new Person();
							person.setName(writtenByName);
							em.persist(person);
						}
						if (!movie.getWrittenBy().contains(person)) {
							movie.getWrittenBy().add(person);
						}
					}
				}

				if (directedByNames != null) {
					for (String directedByName : directedByNames) {
						queryPersonByName.setParameter("name", directedByName);
						Person person = (Person) getSingleResultOrNull(queryPersonByName);
						if (person == null) {
							person = new Person();
							person.setName(directedByName);
							em.persist(person);
						}
						if (!movie.getDirectedBy().contains(person)) {
							movie.getDirectedBy().add(person);
						}
					}
				}

				if (producedByNames != null) {
					for (String producedByName : producedByNames) {
						queryPersonByName.setParameter("name", producedByName);
						Person person = (Person) getSingleResultOrNull(queryPersonByName);
						if (person == null) {
							person = new Person();
							person.setName(producedByName);
							em.persist(person);
						}
						if (!movie.getProducedBy().contains(person)) {
							movie.getProducedBy().add(person);
						}
					}
				}

				movie.setTagLine(tagline);

				if (ratingName != null) {
					queryRatingByName.setParameter("name", ratingName);
					Rating rating = (Rating) getSingleResultOrNull(queryRatingByName);
					if (rating == null) {
						rating = new Rating();
						rating.setName(ratingName);
						em.persist(rating);
					}
					movie.setRating(rating);
				}
				else {
					movie.setRating(null);
				}

			}
			r.close();

			em.flush(); // flush to get a correct time measurement.

			commit = true;
		} finally {
			if (commit) {
				tx.commit();
			}
			else {
				tx.rollback();
			}
		}
	}

	private static Object getSingleResultOrNull(final Query queryMovieByName) {
		try {
			return queryMovieByName.getSingleResult();
		} catch (NoResultException ex) {
			return null;
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
