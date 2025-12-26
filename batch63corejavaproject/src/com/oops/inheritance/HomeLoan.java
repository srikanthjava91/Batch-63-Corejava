package com.oops.inheritance;

public class HomeLoan extends Loan {

	void getHomeLoanDocInfo() {
		System.out.println("Home Loan Documents have been submitted successfully !");
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Vcube Home Loan Banking !!");

		HomeLoan hl = new HomeLoan();

		double empSalary = hl.getEmpSal();
		double empCibil = hl.getEmpCibilScore();
		double empAge = hl.getEmpAge();

		if (empSalary >= 600000.00 && empCibil >= 700 && empAge >= 21) {
			System.out.println("Congrtulations !! Your Home loan got approved !!");
			System.out.println("Your Loan ROI is : " + hl.getLoanROI());
			System.out.println("Enter your address details  ");
			String address = hl.getEmpAddressDetails();
			System.out.println("Verify Your Address details as mentioned by you. ");
			System.out.println("Address info : ");
			System.out.println(address);
			hl.getHomeLoanDocInfo();

		} else {
			System.out.println("Sorry !! your Personal loan application got rejected !");
		}

	}

}
