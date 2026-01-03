package com.multithreading;

class BookMySeat {
	int totalTickets = 10;

	synchronized void bookSeats(int seatCount) {
		if (seatCount <= totalTickets) {
			System.out.println("your Tickets have been booked successfully " + seatCount);

			totalTickets = totalTickets - seatCount;
			System.out.println("Remaining Tickets availability : " + totalTickets);
		} else {

			System.err.println("Entered Tickets were not available !! ");
			System.err.println("Remaining Tickets you can Book only : " + totalTickets);
		}

	}
}

public class BookMyMovieApp extends Thread {

	static BookMySeat bookMySeat;
	int seats;

	@Override
	public void run() {
		bookMySeat.bookSeats(seats);
	}

	public static void main(String[] args) {
		System.out.println("mian method started !");
		bookMySeat = new BookMySeat();

		BookMyMovieApp narshimha = new BookMyMovieApp();
		narshimha.seats = 7;
		narshimha.start();

		BookMyMovieApp arun = new BookMyMovieApp();
		arun.seats = 5;
		arun.start();

	}

}
