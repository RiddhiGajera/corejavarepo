package services;

public class StringService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nameOne = "Riddhi";
		String nameTwo = "Riddhi";
		String nameThree = new String("Riddhi");
		String nameFour = "Test";
		
		System.out.println("HasCode Of nameOne : "+nameOne+" : "+ nameOne.hashCode());
		System.out.println("HasCode Of nameTwo : "+nameTwo+" : "+ nameTwo.hashCode());
		System.out.println("HasCode Of nameThree : "+nameThree+" : "+ nameThree.hashCode());
		System.out.println("HasCode Of nameFour : "+nameFour+" : "+ nameFour.hashCode());
		
		System.out.print("Comparing nameOne and nameTwo using == oprator : ");
		System.out.println(nameOne == nameTwo);
		
		System.out.print("Comparing nameOne and nameThree using == oprator : ");
		System.out.println(nameOne == nameThree);
		

		System.out.print("Comparing nameOne and nameThree using equals method :");
		System.out.println(nameOne.equals(nameThree));
	}
	
	
	
	
}
