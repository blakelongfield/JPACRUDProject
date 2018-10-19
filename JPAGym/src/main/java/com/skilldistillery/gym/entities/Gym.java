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
	
	private Integer age;
	
	private String gender;
	
	private Integer weight;
	
	private Double height;

	@Override
	public String toString() {
		return "Gym ID: " + id + "\nFirstName: " + firstName + "LastName: " + lastName + "ClassesAttended: "
				+ classesAttended + "FavoriteEquipement: " + favoriteEquipement + "Age: " + age + "Gender: " + gender
				+ "Weight: " + weight + "Height: " + height;
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

	public String getFavoriteEquipement() {
		return favoriteEquipement;
	}

	public void setFavoriteEquipement(String favoriteEquipement) {
		this.favoriteEquipement = favoriteEquipement;
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

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((classesAttended == null) ? 0 : classesAttended.hashCode());
		result = prime * result + ((favoriteEquipement == null) ? 0 : favoriteEquipement.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
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
		if (favoriteEquipement == null) {
			if (other.favoriteEquipement != null)
				return false;
		} else if (!favoriteEquipement.equals(other.favoriteEquipement))
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
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
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

	public Gym() {
		super();
	}

	public Gym(String firstName, String lastName, String classesAttended, String favoriteEquipement, Integer age,
			String gender, Integer weight, Double height) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.classesAttended = classesAttended;
		this.favoriteEquipement = favoriteEquipement;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}


}
