package com.skilldistillery.gym.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GymTests {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Gym gym;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("GymDB");
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		gym = em.find(Gym.class, 1);
	}
	
	@Test
	void test_gym_mappings() {
		assertEquals("Becky", gym.getFirstName());
		assertEquals("Biceps", gym.getLastName());
		assertEquals(32, gym.getAge().intValue());
		assertEquals("F", gym.getGender());
		assertEquals(153, gym.getWeight().intValue());		
	}
	
	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

}
