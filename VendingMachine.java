import java.util.Scanner;

class Candy {
	String Brand;
	String Letter;
	int Number;
	double Price;
}
public class VendingMachine {
	public static void main ( String[] args ) {
	Candy MilkyWay, Hersheys, ReesesCup, Take5;
	String ChoiceChar;
	int ChoiceNum;
	double Cash = 0.00, Change = 0.00;
	
	Scanner kb = new Scanner(System.in);
	
	MilkyWay = new Candy();
	MilkyWay.Brand = "MilkyWay";
	MilkyWay.Letter = "A";
	MilkyWay.Number = 1;
	MilkyWay.Price = 1.00;
	
	Hersheys = new Candy();
	Hersheys.Brand = "Hersheys";
	Hersheys.Letter = "M";
	Hersheys.Number = 4;
	Hersheys.Price = .75;
	
	ReesesCup = new Candy();
	ReesesCup.Brand = "ReesesCup";
	ReesesCup.Letter = "R";
	ReesesCup.Number = 8;
	ReesesCup.Price = 1.25;
	
	Take5 = new Candy();
	Take5.Brand = "TakeFive";
	Take5.Letter = "B";
	Take5.Number = 9;
	Take5.Price = 1.25;
   
	Candy[] list = { MilkyWay, Hersheys, ReesesCup, Take5 };
   
	for ( Candy c: list ) {
		System.out.println("Brand: " + c.Brand + "\nLocation: " + c.Letter + c.Number +"\n" + "Cost" + c.Price + "\n");
	}
	
   System.out.println("This Vending Machine dispences the Candy listed above:");
	System.out.print("Please Enter your Money: ");
	Cash = kb.nextDouble();
	
	System.out.print("Please Enter the letter of your selection ");
	ChoiceChar = kb.next();
	
	System.out.print("Please Enter the number of your selection ");
	ChoiceNum = kb.nextInt();
	System.out.println();
	
	for ( Candy c : list )
		if ( c.Letter.equals(ChoiceChar) && c.Number == ChoiceNum ) {
			if ( c.Price <= Cash ) {
				Change = Cash - c.Price;
				System.out.println("Here is your " + c.Brand );
				System.out.println("Your change is : " + Change);
			}
			else
				System.out.println("Insufficient Funds");
		}
		else {
		}	
	}
}
