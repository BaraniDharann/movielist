package com.example.demo.model.Movie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class movie {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String name;
	private String description;
	private String actor;
	private String herione;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getHerione() {
		return herione;
	}
	public void setHerione(String herione) {
		this.herione = herione;
	}
}
