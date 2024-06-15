
/******************************************************************************

Round - 1
-----------------
Guess a number inbetween 1-100 attempts : 10
50
Required number is greater than 50    remaining attempts : 10
Guess a number inbetween 1-100 attempts : 9
25
Required number is greater than 25    remaining attempts : 9
Guess a number inbetween 1-100 attempts : 8
40
Required number is greater than 40    remaining attempts : 8
Guess a number inbetween 1-100 attempts : 7
70
Required number is less than 70    remaining attempts : 7
Guess a number inbetween 1-100 attempts : 6
60
Required number is less than 60    remaining attempts : 6
Guess a number inbetween 1-100 attempts : 5
55
Required number is greater than 55    remaining attempts : 5
Guess a number inbetween 1-100 attempts : 4
57
Required number is greater than 57    remaining attempts : 4
Guess a number inbetween 1-100 attempts : 3
59
Required number is less than 59    remaining attempts : 3
Guess a number inbetween 1-100 attempts : 2
58
YOUR GUESSING NUMBER IS CORRECT 
points are 2
Round ended  :
-----------------------------------
Round - 2
-----------------
Guess a number inbetween 1-100 attempts : 10
50
Required number is less than 50    remaining attempts : 10
Guess a number inbetween 1-100 attempts : 9
25
Required number is less than 25    remaining attempts : 9
Guess a number inbetween 1-100 attempts : 8
10
Required number is greater than 10    remaining attempts : 8
Guess a number inbetween 1-100 attempts : 7
15
Required number is less than 15    remaining attempts : 7
Guess a number inbetween 1-100 attempts : 6
12
Required number is greater than 12    remaining attempts : 6
Guess a number inbetween 1-100 attempts : 5
14
Required number is less than 14    remaining attempts : 5
Guess a number inbetween 1-100 attempts : 4
13
YOUR GUESSING NUMBER IS CORRECT 
points are 6
Round ended  :
-----------------------------------
Total gain points are 6 out of 20
                           
                            

*******************************************************************************/
import java.util.*;

public class JavaInternshipByCodeclause {
	static int points = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rounds = 1;
		while (rounds <= 3) {
			int p = (int) (Math.random() * 100);
			int attempts = 5;
			int flag = 0;
			System.out.println("Round - " + rounds);
			System.out.println("-----------");
			while (attempts >= 1) {
				System.out.println("Guess a number inbetween 1-100" + " attempts : " + attempts);
				int n = sc.nextInt();
				if (n == p) {
					flag = 1;
					points += attempts;
					System.out.println("YOUR GUESSING NUMBER IS CORRECT ");
					System.out.println("points are " + points);
					break;
				} else if (n > p) {
					System.out.println("Required number is less than " + n + "    remaining attempts : " + attempts);

				} else {
					System.out.println("Required number is greater than " + n + "    remaining attempts : " + attempts);
				}
				attempts--;
			}
			System.out.println("Round ended " + " :");
			if (flag == 0) {
				System.out.print("You don't gain any points");
				System.out.println("-----------------------------------");
			} else
				System.out.println("--------------");
			rounds++;

		}
		if (points >= 10)
			System.out.println("You are an excellent gamer with points of " + points + " out of 15");
		else
			System.out.println("You need to improve your game , your points are " + points + " out of 15");
	}
}
