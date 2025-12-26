package com.oops.inheritance;

//Inheritance 
public class PersonalLoan extends Loan {

//	Method Overriding Rules
//	Rule 1: Method signature must be same. 
//	Note : Method signature = method name + arguments but not return type.

//	Rule 2: Method return type must be same up to 1.5 version 
//	but after 1.5 onwards Java introduced co-varient return type.
//	Note 1: Method return types must be same even after 1.5 if the return type is primitive.
//	Note 2: Method return types no need to be same after 1.5 if the return type is Object Data types.
//	Co-varient return types applicable for only Object Data types.

//	Co-varient return type means : If the Parent class method return any Object data types 
//	the child can return same Object data type or it's children typesn are consider as Co-varient return types.

//	Rule 3: 
//	Method scope should not be reduced.
//	if the Parent method --> public -- Child --> public.
//	if the Parent method --> protected -- Child --> protected or public.
//	if the Parent method --> default -- Child --> default or protected or public
//	if the Parent method --> private -----> we cannot override the private methods.
//	CE : Cannot reduce the visibility of the inherited method from Loan.

//Rule 4: 
//	private methods we cannot override, Because private scope is within the class only.
//	Note : If we have private method in parent class, 
//	we can write same method in child class with private will not be a error without @Override.
//	If we use @Override annotation for private method then only it will be Error.
//	CE : The method hello() of type PersonalLoan must override or implement a supertype method.

//Rule 5 : 
//	static methods we cannot override but we can consider as method hiding 
//	because static methods we must need to call by using class name.
//	Even though we can call with Object reference variable 
//	which will be not recommended and static methods are storing in method area.

//	NOte : If we have public static method in Parent class, 
//	We can write same public static in child class will not be a Error without @Override.

//	If we use @Override annotation for static methods in child class then it will be an Error.
//	CE :The method welcome() of type PersonalLoan must override or implement a supertype method.

//	Rule 6 : final methods we cannot override.

	void getPersonalLoanDocInfo() {
		System.out.println("Personal Loan Documents have been submitted successfully !");
	}

	public static void welcome() {
		System.out.println("Welcome to Vcube Personal Loan Banking !");
	}

	@Override
	public Double getLoanROI() {
		return 8.5;
	}

	private String hello() {
		return "Good Afternoon";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Personal Loan Banking !!");

//		Q) Can we store Parent Object into Child reference ..?NO
//		Scenario 4 : By Using Parent Object Child reference 
		// CE: Type mismatch: cannot convert from Loan to PersonalLoan
		// DownCasting is not possible directly, but it is possible with Explicit
		// Type-casting, even though we use downCasting compiler can satisfy but in this
		// above scenario,
		// we can call the methods but whenever we are calling we will get
		// RuntimeException Saying
//		RE :ClassCastException
//		PersonalLoan p2 = (PersonalLoan) new Loan();
		Object obj = new Loan();
//		System.out.println("*******************" + p2.getEmpAge());
//		p2.getPersonalLoanDocInfo();
		System.out.println(obj.hashCode());

//		Q) Can we store child Object into parent reference ..? Yes
//		parent reference  can be a class or interface.
//		Scenario 3 : By using Child Object Parent reference
//		we can only call  Parent class functionalities and 
//		override methods from Parent to child 
		Loan l2 = new PersonalLoan(); // Up-casting or Abstraction or Dynamic Dispatching
		System.out.println("********************" + l2.getLoanROI());
//		System.out.println(l2.hello());

//		Scenario 2 : By using Parent Object Parent reference 
//		we can call only Parent class functionalities.
		Loan l1 = new Loan();

//		Scenario 1 : By using child object child reference
//		we can call both Parent class & child class functionalities.

		LoanIn pl = new PersonalLoan();
		double empSalary = pl.getEmpSal();
		double empCibil = pl.getEmpCibilScore();
		double empAge = pl.getEmpAge();

		if (empSalary >= 800000.00 && empCibil >= 750 && empAge >= 22) {
			System.out.println("Congrtulations !! Your Personal loan got approved !!");
			System.out.println("Your Loan ROI is : " + pl.getLoanROI());
			System.out.println("Enter your address details  ");
			String address = pl.getEmpAddressDetails();
			System.out.println("Verify Your Address details as mentioned by you. ");
			System.out.println("Address info : ");
			System.out.println(address);
//			pl.getPersonalLoanDocInfo();

		} else {
			System.out.println("Sorry !! your Personal loan application got rejected !");
		}

	}

}
