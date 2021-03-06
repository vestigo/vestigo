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
		// We override the JDBC URL here, instead of writing it into the persistence.xml, because we want the persistence.xml
		// to be as fail-safe for the user as possible. With the ";create=true", the user won't know that he uses a wrong path
		// (if he does): He simply sees an empty database, if the path points to a wrong location. Therefore, we do *not* write
		// this into the persistence.xml, but provide it only here. Marco :-)
		properties.put("javax.persistence.jdbc.url", "jdbc:derby:target/derby/vestigoDemoMovieJPA;create=true");
		return properties;
	}

	private EntityManagerFactory entityManagerFactory;

	protected EntityManagerFactory createEntityManagerFactory() {
		String persistenceUnitName = getPersistenceUnitName();
		System.out.println("persistenceUnitName = " + persistenceUnitName);
		return Persistence.createEntityManagerFactory(persistenceUnitName, getPersistenceProperties());
	}

	protected EntityManagerFactory getEntityManagerFactory() {
		if (entityManagerFactory == null || !entityManagerFactory.isOpen()) {
			entityManagerFactory = createEntityManagerFactory();
		}
		return entityManagerFactory;
	}

	protected void closeEntityManagerFactory() {
		if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
			System.out.println("Closing EntityManagerFactory...");
			try {
				entityManagerFactory.close();
				System.out.println("EntityManagerFactory closed successfully.");
			} catch (Throwable x) {
				System.out.println("EntityManagerFactory closed with error (ignoring).");
				x.printStackTrace();
			}
		}
		entityManagerFactory = null;
	}

	protected EntityManager createEntityManager() {
		return getEntityManagerFactory().createEntityManager();
	}

	public static void main(final String[] args) throws Throwable {
		new DemoMovieDataGeneratorJPA().run();
	}

	protected void run() throws Throwable
	{
		try {
			System.out.println("Creating EntityManager...");
			EntityManager em = createEntityManager();
			System.out.println("Created EntityManager.");
			EntityTransaction tx = em.getTransaction();
			boolean commit = false;
			try {
				System.out.println("Beginning transaction...");

				tx.begin();

				System.out.println("Creating queries...");

				Query queryMovieByName = em.createQuery("SELECT m FROM " + Movie.class.getName() + " m WHERE m.name = :name");

				Query queryPersonByName = em.createQuery("SELECT p FROM " + Person.class.getName() + " p WHERE p.name = :name");

				Query queryLanguageByName = em.createQuery("SELECT l FROM " + Language.class.getName() + " l WHERE l.name = :name");

				Query queryRatingByName = em.createQuery("SELECT r FROM " + Rating.class.getName() + " r WHERE r.name = :name");

				System.out.println("Starting actual import...");

				BufferedReader r = new BufferedReader(new InputStreamReader(
						DemoMovieDataGeneratorJPA.class.getResourceAsStream("/org/nightlabs/vestigo/demo/data.csv"), "UTF-8"));
				int lineNumber = 0; // 1-based (as line-numbers usually are in all apps I know)
				String line;
				while ((line = r.readLine()) != null) {
					++lineNumber;
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

					if (lineNumber % 10 == 0)
						System.out.println(String.format("Processed %s lines.", lineNumber));
				}
				r.close();

				System.out.println("Flushing...");
				em.flush();
				System.out.println("Flushed.");

				commit = true;
			} finally {
				if (commit) {
					System.out.println("Committing...");
					tx.commit();
					System.out.println("Committed.");
				}
				else {
					System.out.println("Rolling back...");
					tx.rollback();
					System.out.println("Rolled back...");
				}
			}
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		} finally {
			closeEntityManagerFactory();
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
