package in.nit.java.Staa;

public class TEstConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//it is used to initialize the value not creating obj
		//aplicable modifier public,private,protected,default otherthan we will get error
		//best practise to ccreate obj is instance method
		//alaways compiler will generate default constructor ,if we have not taken
		//default constructor always contain one line that is super()
		//default constructor access modifier always same as class access modifier(default,public)
		//not protected and private bcz we cant take class as private and protected 
		// in inheritance case if we declare constructor but not properly then in child class will dclare again
		// we cant use this or super at a time onle one at a time
		/*class test{             
			test(){}             //here we have wrriten explicitly this or super/so coompiler will generate agian in child class
		}                     and create default consructor in child class with super()//it will invoke parent class constructor
	}
	class child extends test{
		
	}
	//overlaoding constructor
	 * overriding concept is not applicable in constructor
	within a class we declare multiple constructor same but differnet parammeter all are overlaoded connst
	//overloading concept is used for constructor
	 * every class in java including abstarct class,but interaface cant contain constructor
	 *bcz interface cant conatin instance var thats why /..
	*/

}
}