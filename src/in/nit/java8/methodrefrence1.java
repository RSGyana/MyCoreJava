package in.nit.java8;

//static method ref
//classname::static method name
//test::m2;

interface inter1{
	public void m1();
}
public class methodrefrence1 {
	//method ref is alternative to lambda exprsn
//method ref main adv is code reusability
	//method signature should match and also arg type
	public static void m2() {
		System.out.println("welcome to method referencing");
	}
	public static void main(String[] args) {
		inter1 i=methodrefrence1 :: m2;
		i.m1();

	}

}
