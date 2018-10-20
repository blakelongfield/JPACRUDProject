package com.skilldistillery.gym.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.skilldistillery.gym.entities.Gym;

@Transactional
@Repository
public class GymDAOImpl implements GymDAO{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Gym findById(int id) {
		Gym gymGoer = em.find(Gym.class, id);
		return gymGoer;
	}

	@Override
	public List<Gym> findAll() {
		String queryString = "SELECT gym FROM Gym gym";
		List<Gym> allGymGoers = em.createQuery(queryString, Gym.class).getResultList();
		return allGymGoers;
	}

	@Override
	public Gym add(Gym g) {
		String queryString = "SELECT";
		return null;
	}

	@Override
	public Gym update(Gym g) {
		String queryString = "SELECT";
		return null;
	}

	@Override
	public boolean deletedById(int id) {
		Gym gymMember = em.find(Gym.class, id);
		
		em.getTransaction().begin();

		em.remove(gymMember);

		if (em.find(Gym.class, id) == null) {
			em.getTransaction().commit();
			em.close();
			return true;
		} else {
			em.close();
			return false;
		}
	}

}
