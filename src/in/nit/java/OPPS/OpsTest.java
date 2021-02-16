package in.nit.java.OPPS;
//data hiding ---hiding the data from outsiders is data  hiding
//abstraction --the hiding internal implementation and just viewing the gui like withdraw button.ministatement
//encapsulation--the process binding data and functionality into a single unit is called encapsulation
//every java class is a encapsulation
//above 4 concept/features showing one thing is security
//overloading--same methood signature but diff parameters(early binding/compiletime polymorphism it is pointing ref var in compile time)
//overriding --if same method in parent and child is overridin(late binding/runtime pollymorphism it pointing obj in runtime)
//overriding is not apllicable for private methods
//if we dont want to use parent method then declare simply that method in child class
class P{
	public void m1() {
		System.out.println("welcome to p");
	}
}
abstract 
class c extends P{
	public abstract void m1();
}
public class OpsTest {

	public static void main(String[] args) {
		
		//in overriding the follwoing keywords no restriction syncchronized,strctfp
System.out.println("welcome");
	}

}
