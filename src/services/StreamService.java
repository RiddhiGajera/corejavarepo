package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// This class is to use stream feature of Java 8
public class StreamService {

	public static void main(String[] args) {
		
		System.out.println("Convert int array to Integer so it can work with collection");
		int[] array = {7,9,1,2,3,5,6};
		Integer[] a = Arrays.stream(array).sorted().boxed().toArray(Integer[]::new);
	
//		Integer[] integerArray = convertintToIntegerArray(array);
		
		System.out.println("Printing Integer Array");
		for (Integer integer : a) {
			System.out.println(integer);
		}
		System.out.println("####################################################################");
		
	}

	private static Integer[] convertintToIntegerArray(int[] array) {
		
		Integer[] arrayObj = Arrays.stream(array).boxed().toArray(Integer[] :: new);
		return arrayObj;
	}

}
