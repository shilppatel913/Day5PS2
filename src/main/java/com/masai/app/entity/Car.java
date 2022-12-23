package com.masai.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "car")
@NamedQuery(name="Car.allCars",query = "from Car")
public class Car {
	@Id
	private int id;
	private String modelName;
	private String makeYear;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(String makeYear) {
		this.makeYear = makeYear;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car(int id,String modelName, String makeYear, String color) {
		super();
		this.id=id;
		this.modelName = modelName;
		this.makeYear = makeYear;
		this.color = color;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + id;
		result = prime * result + ((makeYear == null) ? 0 : makeYear.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
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
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (id != other.id)
			return false;
		if (makeYear == null) {
			if (other.makeYear != null)
				return false;
		} else if (!makeYear.equals(other.makeYear))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", modelName=" + modelName + ", makeYear=" + makeYear + ", color=" + color + "]";
	}
	
	
}
