package com.infotech.client;

public class ExceptionPropagation1 {

	 public static void main(String[] args) {
	  ExceptionPropagation1 obj = new ExceptionPropagation1();
	  obj.method1();
	  System.out.println("After handling exception...");
	 }
	 
	 private void method3(){
	  System.out.println("In method3");
	  // This will result in Arithmetic Exception as an attempt is made to divide by zero
	  int result = 10/0;  
	  System.out.println(result);
	 }
	 
	 //This method will forward the exception
	 private void method2(){
	  System.out.println("In method2");
	  method3();
	 }
	 
	 //Exception will be handled here
	 private void method1(){
	  try{
	   method2();
	  } catch(Exception e){
	   System.out.println("Exception caught:"+e.getMessage());
	  }
	 }
	}
