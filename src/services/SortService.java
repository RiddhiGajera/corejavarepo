package services;

import java.util.Arrays;
import java.util.Comparator;

public class SortService {
	public static void main(String[] args) {
		String[] s = {"abc","pqrs","jklmn","sr","srt","xyzwerw","a"};
		String[] sortedArray = sortStringByLength(s,"desc");
		String[] s1 = {"abc","aae","abd","adf","ac"};
		String[] sortedArrayByChar = sorStringByCharcter(s1);
		
		for (String string : sortedArrayByChar) {
			System.out.println(string);
		}
		
	}

	private static String[] sorStringByCharcter(String[] s) {

		Arrays.sort(s,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.substring(0,2).compareTo(o2.substring(0,2));
			}
		});
		return s;
	}

	private static String[] sortStringByLength(String[] s, String type) {
		Arrays.sort(s,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int val = 0 ;
				if("asc".equals(type)){
					val = o1.length()-o2.length();
				}else if("desc".equals(type)){
					val = o2.length()-o1.length();
				}
				return val;
			}
		});
		return s;
	}
}
