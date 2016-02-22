import java.util.Scanner;

class candy {
	String brand;
	String letter;
	int number;
	double price;
}
public class VendingMachine {
	public static void main ( String[] args ) {
	Candy MilkyWay, Hersheys, ReesesCup, Take5;
	String choiceChar;
	int choiceNum;
	double cash = 0.00, change = 0.00;
	
	Scanner kb = new Scanner(System.in);
	
	MilkyWay = new candy();
	MilkyWay.brand = "MilkyWay";
	MilkyWay.letter = "A";
	MilkyWay.number = 1;
	MilkyWay.price = 1.00;
	
	Hersheys = new candy();
	Hersheys.brand = "Hersheys";
	Hersheys.letter = "M";
	Hersheys.number = 4;
	Hersheys.price = .75;
	
	ReesesCup = new candy();
	ReesesCup.brand = "ReesesCup";
	ReesesCup.letter = "R";
	ReesesCup.number = 8;
	ReesesCup.price = 1.25;
	
	Take5 = new candy();
	Take5.brand = "TakeFive";
	Take5.letter = "B";
	Take5.number = 9;
	Take5.price = 1.25;
   
	Candy[] list = { MilkyWay, Hersheys, ReesesCup, Take5 };
   
	for ( candy c: list ) {
		System.out.println("Brand: " + c.brand + "\nLocation: " + c.letter + c.number +"\n" + "Cost" + c.price + "\n");
	}
	
   System.out.println("This Vending Machine dispences the Candy listed above:");
	System.out.print("Please Enter your Money: ");
	cash = kb.nextDouble();
	
	System.out.print("Please Enter the letter of your selection ");
	choiceChar = kb.next();
	
	System.out.print("Please Enter the number of your selection ");
	choiceNum = kb.nextInt();
	System.out.println();
	
	for ( candy c : list )
		if ( c.letter.equalsIgnoreCase(choiceChar) && c.number == choiceNum ) {
			if ( c.price <= cash ) {
				change = cash - c.price;
				System.out.println("Here is your " + c.brand );
				System.out.println("Your change is : " + Change);
				
			}
			else
				System.out.println("Insufficient Funds");
		}
		else {
		}	
	}
}
