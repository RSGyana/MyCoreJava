package in.nit.java.multi;



public class ThreadLocal27 {

	public static void main(String[] args) {
		// thread local provides thread local variables
		//it main  values per thread=basis
		//each thread local maintain separate valle like trsn id,for each thread can acces
		//it can acces local var,manipulate,and remove also
		//it can acees local var
		//it has three methods  get,set,remove
		/*
		 * ThreadLocal t=new ThreadLocal(); 
		 * System.out.println(t.get()); //null
		 * t.set("jk");
		 * System.out.println(t.get());//jk
		 *  t.remove();
		 * 
		 * System.out.println(t.get());//null
		 */
		//overriding of initial value method
		
		ThreadLocal t=new ThreadLocal() {
			public Object initialValue(){
				return "abc";
	 		}
		};
		 	 	System.out.println(t.get());//abc innerclass value 
		 	 	t.set("jk"); 
		 	 	System.out.println(t.get());//jk
		 	 	t.remove();
		 	 
		 	 	System.out.println(t.get());//abc  (same)
		

	}

}
