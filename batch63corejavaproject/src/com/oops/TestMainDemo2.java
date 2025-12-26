package com.oops;

public class TestMainDemo2 {

	void main() {
		System.out.println("main method strated from TestMainDemo2!");
	}
}


class TestMainDemo3 extends TestMainDemo2{
	
	

	@Override
	void main() {
		System.out.println("main method strated from TestMainDemo2 overrdided method!");
	}
}
