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
	private String favoriteEquipment;
	
	private Integer age;
	
	private String gender;
	
	private Double weight;
	
	@Override
	public String toString() {
		return "Gym ID: " + id + "\nFirstName: " + firstName + "\nLastName: " + lastName + "\nClasses Attended: "
				+ classesAttended + "\nFavorite Equipement: " + favoriteEquipment + "\nAge: " + age + "\nGender: " + gender
				+ "\nWeight: " + weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getClassesAttended() {
		return classesAttended;
	}

	public void setClassesAttended(String classesAttended) {
		this.classesAttended = classesAttended;
	}

	public String getFavoriteEquipment() {
		return favoriteEquipment;
	}

	public void setFavoriteEquipement(String favoriteEquipment) {
		this.favoriteEquipment = favoriteEquipment;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Gym() {
		super();
	}

	public Gym(String firstName, String lastName, String classesAttended, String favoriteEquipment, Integer age,
			String gender, Double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.classesAttended = classesAttended;
		this.favoriteEquipment = favoriteEquipment;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	public Gym(String firstName, String lastName, Integer age, String gender, Double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((classesAttended == null) ? 0 : classesAttended.hashCode());
		result = prime * result + ((favoriteEquipment == null) ? 0 : favoriteEquipment.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gym other = (Gym) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (classesAttended == null) {
			if (other.classesAttended != null)
				return false;
		} else if (!classesAttended.equals(other.classesAttended))
			return false;
		if (favoriteEquipment == null) {
			if (other.favoriteEquipment != null)
				return false;
		} else if (!favoriteEquipment.equals(other.favoriteEquipment))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void setFavoriteEquipment(String favoriteEquipment) {
		this.favoriteEquipment = favoriteEquipment;
	}


}
