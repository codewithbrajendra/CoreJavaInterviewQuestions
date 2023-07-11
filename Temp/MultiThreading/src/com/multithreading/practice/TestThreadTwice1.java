package com.multithreading.practice;

public class TestThreadTwice1 extends Thread{  
	 public void run(){  
	   System.out.println("running...");  
	 }  
	 public static void main(String args[]){  
	  TestThreadTwice1 t1=new TestThreadTwice1();  
	  t1.start();  
	  t1.start();  //java.lang.IllegalThreadStateException bcoz same thread already started.
	 }  
	}  