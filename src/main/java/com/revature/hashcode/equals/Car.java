package com.revature.hashcode.equals;

import java.time.LocalDate;

public class Car {
	private int id;
	private String model;
	private LocalDate releaseDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", releaseDate=" + releaseDate + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Hashcode called for object with id: " + id);
		return (int) (Math.random()*100);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals called for object with id: " + id);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (id != other.id)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		return true;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String model, LocalDate releaseDate) {
		super();
		this.id = id;
		this.model = model;
		this.releaseDate = releaseDate;
	}

}
