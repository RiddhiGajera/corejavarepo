package services;

import java.util.Arrays;

// This class is to use stream feature of Java 8
public class StreamService {

	public static void main(String[] args) {
		
		System.out.println("Convert int array to Integer so it can work with collection");
		int[] array = {1,2,3,4,5};
		Integer[] integerArray = convertintToIntegerArray(array);
		
		System.out.println("Printing Integer Array");
		for (Integer integer : integerArray) {
			System.out.println(integer);
		}
		System.out.println("####################################################################");
		
	}

	private static Integer[] convertintToIntegerArray(int[] array) {
		
		Integer[] arrayObj = Arrays.stream(array).boxed().toArray(Integer[] :: new);
		return arrayObj;
	}

}
