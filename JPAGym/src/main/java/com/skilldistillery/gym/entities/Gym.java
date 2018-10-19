package com.skilldistillery.gym.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gym {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="classes_attended")
	private String classesAttended;
	
	@Column(name="favorite_equipment")
	private String favoriteEquipement;
	
	private int age;
	
	private String gender;
	
	private int weight;
	
	private double height;

}
