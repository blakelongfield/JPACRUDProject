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
	GymTests test;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("GymDB");
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
	}
	
	@Test
	void test_find_gym_member_returns_correct_member() {
		gym = em.find(Gym.class, 1);
		assertEquals("Becky", gym.getFirstName());
		assertEquals("Biceps", gym.getLastName());
		assertEquals(32, gym.getAge().intValue());
		assertEquals("F", gym.getGender());
		assertEquals(153, gym.getWeight().intValue());		
	}
	
	@Test
	void test_add_member_returns_member_in_db() {
		Gym newMember = new Gym("Yolanda", "Yoked", null, null, 24, "F", 160.6);
		assertEquals("Blake", newMember.getFirstName());
		assertEquals("Longfield", newMember.getLastName());
		assertEquals(24, newMember.getAge().intValue());
		assertEquals("F", newMember.getGender());
		assertEquals(160.6, newMember.getWeight().doubleValue());
	}
	
	@Test
	void test_update_member_returns_updated_member_in_db() {
		gym = em.find(Gym.class, 2);
		assertEquals(32, gym.getAge().intValue());
	}
	
	@Test
	void test_delete_member_returns_member_deleted_from_db() {
		
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
