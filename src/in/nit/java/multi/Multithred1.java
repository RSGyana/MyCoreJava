package in.nit.java.multi;

class Mythread1 extends Thread{
	public void run() {
		for (int i=0;i<=10;i++) 
			System.out.println("from child thread");
		
	}

}

	public class Multithred1 {

		public  static void main(String[] args) {


			Mythread1 th=new Mythread1();
			th.start();  //strating of tthread
       //th.run();//if we will write run(); thread will execute sequentialy fst child all then parrnet

			for (int i=0;i<=10;i++) 
				System.out.println("from parent thread");
		//importance of thread class start()
			//it will register thread with thread schdeuler
			//without exceuting start(),no chance to strat()
			//it is h heart of Mutli Threading
	// invoke run()
			
			
		}
}
