package com.practice;

//This is functional interface becoz it have only one abstract method.If one more abstract method inside this interface then it not called functional interface.
interface  TestFunctionalInterface {
	
	//void show();
	
	//void print(int x);
	
	int add(int x,int y);
}

/*  //First way to use show method of TestFunctionalInterface
 * class TestFunctional implements TestFunctionalInterface {
	
	@Override
	public void show() {
       System.out.println("This is test functional show method.");
	}
}*/

public class CheckLambdaExpression {

	/* //Second way to use show method of TestFunctionalInterface
	 * class TestFunctional implements TestFunctionalInterface {
		@Override
		public void show() {
	       System.out.println("This is test functional show method.");
		}
	}*/
	
	public static void main(String[] args) {
		/*CheckLambdaExpression obj = new CheckLambdaExpression();
		CheckLambdaExpression.TestFunctional functional = obj.new TestFunctional();
		functional.show();*/
		
		
        // This is third way to use show method of TestFunctionalInterface by using Anonymous inner class
 		/*TestFunctionalInterface functional = new TestFunctionalInterface() {
			@Override
			public void show() {
				System.out.println("This is test functional show method.");
			}
		};
		
		functional.show();*/
		
		//This is the fourth way to use show method of TestFunctionalInterface by using lambda 
		// expression it is just similar to above code of anonymous inner class.
		/*TestFunctionalInterface functional = () -> {
			System.out.println("This is test functional show method.");
		};*/
		
		//If method body have a single parameter then without parenthesis we can write code.
		//TestFunctionalInterface functional = () -> System.out.println("This is test functional show method.");
		
		//functional.show();
		
		//If only one parameter inside method then we can directly pass parameter without using bracket
		//TestFunctionalInterface functional = x -> System.out.println(x);
		
		//functional.print(10);
		
		//We can perform some on method and return values from lambda expression.
		TestFunctionalInterface functional = (a,b) -> {
			return (a+b);
		};
		
		System.out.println(functional.add(15, 25));
	}

}
