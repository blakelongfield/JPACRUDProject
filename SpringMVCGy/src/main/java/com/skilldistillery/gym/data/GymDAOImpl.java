package com.skilldistillery.gym.data;

import java.util.ArrayList;
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
	public List<Gym> findByKeyword(String keyword) {
		List<Gym> gymMember = new ArrayList<>();
		String queryString = "SELECT g FROM Gym g WHERE g.firstName LIKE ?1 OR g.lastName LIKE ?2";
		gymMember = em.createQuery(queryString, Gym.class).setParameter(1, "%" + keyword + "%").setParameter(2, "%" + keyword + "%")
				.getResultList();
		return gymMember;
	}

	@Override
	public List<Gym> findAll() {
		String queryString = "SELECT gym FROM Gym gym";
		List<Gym> allGymGoers = em.createQuery(queryString, Gym.class).getResultList();
		return allGymGoers;
	}

	@Override
	public Gym add(Gym newMember) {
		em.persist(newMember);
		em.flush();
		em.close();
		return newMember;
	}

	@Override
	public Gym update(Gym gymMember) {
		Gym updatedGymMember = em.find(Gym.class, gymMember.getId());
		if (gymMember != null) {
			updatedGymMember.setFirstName(gymMember.getFirstName());
			updatedGymMember.setLastName(gymMember.getLastName());
			updatedGymMember.setClassesAttended(gymMember.getClassesAttended());
			updatedGymMember.setFavoriteEquipement(gymMember.getFavoriteEquipment());
			updatedGymMember.setAge(gymMember.getAge());
			updatedGymMember.setGender(gymMember.getGender());
			updatedGymMember.setLastName(gymMember.getLastName());
			updatedGymMember.setWeight(gymMember.getWeight());
		}
		em.persist(updatedGymMember);
		em.flush();
		em.close();
		return updatedGymMember;
	}

	@Override
	public boolean deletedById(int id) {
		Gym gymMember = em.find(Gym.class, id);
		
		em.remove(gymMember);

		if (em.find(Gym.class, id) == null) {
			em.close();
			return true;
		} else {
			em.close();
			return false;
		}
	}

}
