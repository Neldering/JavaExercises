/* Nicolas Eldering
Computer Science
Roman Numeral 1-10
Feb/19/2016
*/

import java.util.Scanner;

public class RomanNumeralsNCE
{
	public static void main( String[] args ) {
		int UserNum;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("In this program you can input an Integer 1-10 ");
		System.out.println("and I'll convert it into its corisponding Roman Numeral");
		
		UserNum = kb.nextInt();
		
		if ( UserNum < 1 || UserNum > 10 ) {
			System.out.println(" That number is not within the scope of this program.");
		}
		else {
			if ( UserNum == 1 )
				System.out.println(UserNum + " is the Roman Numeral I");
			else if ( UserNum == 2 )
				System.out.println(UserNum + " is the Roman Numeral II");
			else if ( UserNum == 3 )
				System.out.println(UserNum + " is the Roman Numeral III");
			else if ( UserNum == 4 )
				System.out.println(UserNum + " is the Roman Numeral IV");
			else if ( UserNum == 5 )
				System.out.println(UserNum + " is the Roman Numeral V");
			else if ( UserNum == 6 )
				System.out.println(UserNum + " is the Roman Numeral VI");
			else if ( UserNum == 7 )
				System.out.println(UserNum + " is the Roman Numeral VII");
			else if ( UserNum == 8 )
				System.out.println(UserNum + " is the Roman Numeral VIII");
			else if ( UserNum == 9 )
				System.out.println(UserNum + " is the Roman Numeral IX");
			else
				System.out.println(UserNum + " is the Roman Numeral X");
		}
	}
}
