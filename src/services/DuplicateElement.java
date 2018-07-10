package services;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {
	
	public static void main(String[] args) {
			
//		printFrequencyOfNo();
//		printFrequencyOfChar("JAVA");
//		printFrequencyOfWord("Test java program java");
//		sortStringByWord("test java with teata");
//		sortStringByLength("test sr with a proper");
	}

	private static void sortStringByLength(String string) {
		String[] stringArray = string.split(" ");
		Arrays.sort(stringArray,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.length()-o1.length();
			}
		});
		
		for(String s : stringArray){
			System.out.print(s + " ");
		}
	}

	private static void sortStringByWord(String string) {
		String[] stringArray = string.split(" ");
		Arrays.sort(stringArray,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.substring(1,3).compareTo(o2.substring(1,3));
			}
		});
		
		for(String s : stringArray){
			System.out.print(s + " ");
		}
	}

	private static void printFrequencyOfWord(String string) {
		String[] stringArray = string.split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String i : stringArray){
			if(map.containsKey(i)){
				map.put(i, map.get(i) + 1);
			}else{
				map.put(i, 1);
			}
		}
		System.out.println(map.toString());
	}

	private static void printFrequencyOfChar(String str) {
		char[] charArray = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char i : charArray){
			if(map.containsKey(i)){
				map.put(i, map.get(i) + 1);
			}else{
				map.put(i, 1);
			}
		}
		System.out.println(map.toString());
	}

	private static void printFrequencyOfNo() {
		int a[] = {1,3,4,5,6,3,1};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i : a){
			if(map.containsKey(i)){
				map.put(i, map.get(i) + 1);
			}else{
				map.put(i, 1);
			}
		}
		
		System.out.println(map.toString());
	}
	

}
