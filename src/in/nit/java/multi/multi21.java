package in.nit.java.multi;

import java.util.concurrent.locks.ReentrantLock;

public class multi21 {

	public static void main(String[] args) {
		
		ReentrantLock l=new ReentrantLock();
		l.lock();
		l.lock();
		System.out.println(l.isLocked());//true
		System.out.println(l.isHeldByCurrentThread());//true 
		System.out.println(l.getQueueLength());//0
		l.unlock();
		
		System.out.println(l.getHoldCount());//o
		System.out.println(l.isLocked());//true
		l.unlock();
		System.out.println(l.isLocked());//false
		System.out.println(l.isFair());//false
		
		
		
		
		
		
		
		
		
		
		
	}

}
//traditionbal sysnchronized have some problem
		//we are not any flexibility to try for lock without waiting
		//there is no to specify max time,untill get thev lock will wait,
  //it may crete deadlock situation
		//if thread release lock,which thread will get lock,we dont have who will get lock
		//there is no api for lock
		//the sync keyword we will use at method,in side method (block),we cant apply for multiple method]
		
		//to overcome
		//java people provide java.util.concuurent.locks pkg
		//this pkg also provide some enhancement to the programer to provide more controoll on lock
		
		//lock(I) it is(obj) similar to implicit lock aquired by thread to exe sync block/method
		
		//it provides more extensive than traditonal lock
		
		//methods of lock(I)
		//1==void lock()**    / /we canuse method to aquired a lock .if lock available immidaitely that thread will get lock
		//other wise wait(same as sync keyword)]
		
		//3==boolean trylock()**=to aquire lock wu=ithout waiting
		//if lock is not available and i will exe other task never wait
		/*
		 * if(l.trylock) { continue } else { do other oprn }
		 */
		//bolean trylock(longtime,time unit)**
		//if lock is available then thread will get the and exe
		//if not lock available,it will wait for a particular time
		//and exe other oprn
		//time unit is enum it is avilable in java.concurent pkg
		//time unit  may (hour,min ,sec ms,ns)
		
		//4==void interruptibly**//if lock available and returns immidiately
		//if not available then thread it will wait,while waiting thread got interrupt,then thread wont get lock
		
	//5==void unlock//to release the lock
		//compulsory current thread should lock thread otherwise excpn  
		//renetrant means a thread can  aquire multi time lock same obj,when count reaches zero it will release the lock
		//Reentrant is the direct child class of lock(I)
		//constructor
		
		//ReentrantLock l=new ReentrantLock();
		//ReentrantLock l=new ReentrantLock(boolean fairness);
		//cereats rentrant lock given fairness policy,if true longest possibilety
		//if false which thread will get chance we cant predict
		//the default value fairness is false
		
		//reentrant class methods(ALL LOCK METHODS ARE AVAILABLE)
		//getholdcount() ==return no of locks hold by current thread
		//is heldbycurrenttHREAD()//return s true iff lock is hold by current thread 
		//queuelength()==returns wait for lock threads
		//getqueuedThread()==returns a collections thread whucj=h are waiting for lock
		//queuedthread()==return true to get the lock
				//locked()==return true auqired by some thread
				//		fair()==return true if fair policy set with true value]
								//owner()//who is owner of the thread
		
		