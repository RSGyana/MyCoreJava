package in.nit.java.multi;

public class ThreadGroupMulti21 {

	public static void main(String[] args) {
		// Based on fun we can group thread ,which is nothing but thread group
		//in addn to thread ,a thread froup contain sub thread group
		//the main adv of ,maintaing hread group is we can 
		//use easily
		
System.out.println(Thread.currentThread().getThreadGroup().getName());
System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
System.out.println(Thread.currentThread().getThreadGroup().getParent());
System.out.println(Thread.currentThread().getThreadGroup());
//main
//system
//java.lang.ThreadGroup[name=system,maxpri=10]
//java.lang.ThreadGroup[name=main,maxpri=10]
	
	//every thread group of java are child thread group of system(parent)
//system group contain system level thread(signal dispatcher,attach listner)
//thread group is present in java.lang.*  parent is object

//constructor*********
//ThreadGroup g=new ThreadGroup(strning name)//create thread group

//ThreadGroup g=new ThreadGroup(g,second groupname);//sec is specified group name

ThreadGroup g1=new ThreadGroup("fstgrp");
System.out.println(g1.getParent().getName());//main
ThreadGroup g2=new ThreadGroup(g1,"secgrp");
System.out.println(g2.getParent().getName());//fstgrp (specified grp)
g1.list();//to show all
g1.activeCount(); //teo see active thread
g2.activeCount();


	}

}
