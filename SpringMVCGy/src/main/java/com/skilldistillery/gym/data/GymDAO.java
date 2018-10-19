package com.skilldistillery.gym.data;

import java.util.List;

import com.skilldistillery.gym.entities.Gym;

public interface GymDAO {
	Gym findById(int id);
	List<Gym> findAll();
	Gym add(Gym g);
	Gym update(Gym g);
	boolean delete (Gym g);
	boolean deletedById(int gid);

}
