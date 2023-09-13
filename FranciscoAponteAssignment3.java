/*
* Name: Francisco Aponte
* Class: CS1150
* Section: 1
* Due: Sep 14, 2023
* Description: Assignment #3
*/
import java.util.Scanner;
public class FranciscoAponteAssignment3 {
    public static void main(String[] args) {
//    	Scanner input = new Scanner (System.in);
//    	System.out.print("Select a Smothie 1, 2 or 3: ");
//    	String name = input.nextLine();
//    	System.out.print("name");
//    	System.out.print(name);
    	final double BerryBanana=7.50;
    	final double Tropical=6.75;
    	final double GreenJolt=5.00;
    System.out.println("Option\tType\t\t\tPrice");
    System.out.println("---------------------------------------");	
    System.out.println("1\tBerry Banana\t\t$"+BerryBanana);
    System.out.println("2\tTropical\t\t$"+Tropical);
    System.out.println("3\tGreen Jolt\t\t$"+GreenJolt);
    System.out.println("");
    Scanner Input = new Scanner (System.in);
	System.out.print("Select a Smothie 1, 2 or 3: ");
	String SmothieType = Input.nextLine();
	System.out.println("");
	System.out.println("");
	final double NoAddIn=0;
	final double AlmondButter=1.50;
	final double LimeJuice=1.50;
	System.out.println("Option\tAdd-In\t\t\tPrice");
	System.out.println("---------------------------------------");	
	System.out.println("0\tNo add-in\t\t$"+NoAddIn);
	System.out.println("1\tAlmond Butter\t\t$"+AlmondButter);
	System.out.println("2\tGreen Jolt\t\t$"+LimeJuice);
	System.out.println("");	
	System.out.print("Select an add-in: ");
	String AddIn = Input.nextLine();
	System.out.println("");
	System.out.println("");
	System.out.println("---------------------------------------");
	System.out.println("'"+SmothieType == "1"+"'");
	if (SmothieType == "1") {
	System.out.println("Berry Banana Smothie\t$"+BerryBanana);
		}
    	
    	
    	
    	
    	
    }
}
