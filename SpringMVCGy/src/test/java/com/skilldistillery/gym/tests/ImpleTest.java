package com.skilldistillery.gym.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.gym.entities.Gym;

class ImpleTest {

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
	}
	
	@Test
	void test_update_member_returns_updated_member_in_db() {
		gym = em.find(Gym.class, 1);
		gym.setGender("F");
		assertEquals("F", gym.getGender());
	}
	
	@Test
	void test_delete_member_returns_member_deleted_from_db() {
		Gym newMember = new Gym("Yolanda", "Yoked", null, null, 24, "F", 160.6);
		assertEquals("Yolanda", newMember.getFirstName());
		em.remove(newMember);
		assertNull(newMember.getFirstName());
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


