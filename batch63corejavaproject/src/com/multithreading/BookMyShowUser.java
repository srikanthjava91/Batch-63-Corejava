package com.multithreading;

class BookMyShowTickets {
	int totalSeats = 15;

	synchronized void bookSeat(int seats) {

		if (seats <= totalSeats) {
			System.out.println("Your Tickets have been booked : " + seats);
			totalSeats = totalSeats - seats;
			System.out.println("Remaining seats availability : " + totalSeats);
		}else {
			System.err.println("Sorry !! entered Tickets have been sold out ");
			System.err.println("Only availability is : " + totalSeats);
		}

	}
}

public class BookMyShowUser extends Thread {
	
	static BookMyShowTickets bookMyShowTickets;
	int seats;
	
	@Override
	public void run() {
		System.out.println("run method called !");
		bookMyShowTickets.bookSeat(seats);
		
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		
		bookMyShowTickets = new BookMyShowTickets();
		 
		BookMyShowUser srikanth = new BookMyShowUser();
		srikanth.seats = 10;
		srikanth.start();
		
		BookMyShowUser vishwa = new BookMyShowUser();
		vishwa.seats = 10;
		vishwa.start();


		System.out.println("main method ended !");
	}

}
