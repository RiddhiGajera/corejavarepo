package com.corejava.sampleproject;

public class SingletonClass {
	
	private static SingletonClass singletonClass = null ;
	
	String s ;
	
	private SingletonClass(){
		s = "Hello";
	}
	
	public static SingletonClass getInstance(){

		if(singletonClass == null){
			singletonClass = new SingletonClass();
		}
		return singletonClass;
		
	}
	
	
}
