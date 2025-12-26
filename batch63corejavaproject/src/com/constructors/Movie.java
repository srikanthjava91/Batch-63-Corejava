package com.constructors;

//Copy Constructor
public class Movie {

	String name;
	String director;
	String hero;
	String heroine;
	double budget;

	// This method has a constructor name
	public void Movie() {
		System.out.println("no arg constructor called ");
	}

	 Movie() {
		System.out.println("no arg constructor called ");
	}

	Movie(String director) {
		this.director = director;
	}

	Movie(Movie m, String hero, double budget) {
		this.director = m.director;
		this.hero = hero;
		this.budget = budget;
	}

	Movie(Movie m, String name, String heroine) {
		this.name = name;
		this.director = m.director;
		this.hero = m.hero;
		this.heroine = heroine;
		this.budget = m.budget;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Movie m1 = new Movie();
		m1.show();

		Movie m2 = new Movie("S S Rajamouli ");
		m2.show();

		Movie m3 = new Movie(m2, "Mahesh Babu", 5000000000.00);
		m3.show();
		m3.hero = "Arun";

		Movie m4 = new Movie(m3, "James Bond 007 ", "Bhagya Sree");
		m4.show();

		System.out.println("main method ended !");
	}

	void show() {
		System.out.println("**********Movie Info***********");
		System.out.println("Name of the Movie :" + name);
		System.out.println("Director of the Movie :" + director);
		System.out.println("Hero of the Movie :" + hero);
		System.out.println("heroine of the Movie :" + heroine);
		System.out.println("budget of the Movie :" + budget);
	}
}
