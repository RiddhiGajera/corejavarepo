package services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindMutily {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Elements: ");
		int len = sc.nextInt();
		int a [] = new int[len];
		for(int j=0;j<len;j++){
			
			a[j] = sc.nextInt();
		}
		
		System.out.println("Enter No: ");
		int temp = sc.nextInt();
		
		
		Integer[] intArray = Arrays.stream(a).boxed().toArray(Integer[] :: new);
		intArray = Arrays.stream(intArray).sorted().toArray(Integer[]::new);
		List<Integer> list =  Arrays.stream(intArray).filter(x -> x<=temp).collect(Collectors.toList());
		System.out.println(list.toString());
		HashMap<Integer, Integer> map = new HashMap<>();
		
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()){
			Integer s = i.next();
			if(s<=temp && temp%s == 0 ){
				int t = temp/s;
				if(list.contains(t)){
					map.put(s, t);
					i.remove();
					
				}
			}
		}
		System.out.println(map.toString());
	}
}
