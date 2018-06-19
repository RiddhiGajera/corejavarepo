package com.corejava.sampleproject;

public final class ImmutableClass {
	
	final ImmutableClass ic ; 
	
	ImmutableClass(){
		this.ic = new ImmutableClass();
	}
}
