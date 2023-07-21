package help_from_Sam;

import java.util.Scanner;

/*
	 Alex and Sam are good friends. Alex is doing a lot of programming these days. He has set a target score of A for himself.
	Initially, Alex's score was zero. Alex can double his score by doing a question, or Alex can seek help from Sam for doing questions that will contribute 1 to Alex's score.
	 Alex wants his score to be precisely A. Also, he does not want to take much help from Sam.
	
	Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A..
	

	Input 1:
	
	A = 5
	
	Input 2:
	
	A = 3
	
	
	Output 1:
	
	2
	
	Output 2:
	
	2
	
 */
public class Help_from_Sam {
	
	private static void help(int n) {			// Not sure whether it is correct , please refer
		System.out.println(Integer.bitCount(n));
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		help(n);

	}
}
/*
  	According to my logic, lets go with the number given
  	1  (01) => one count => Because, his scores doubles every time but initially it is zero, so first he needs to ask for help
  	2  (10) => one count => 1,2
  	3  (11) => two count => 1,2,1
  	4  (100) => one count => 1,2,4
  	5  (101) => two count => 1,2,4,1
  	6  (110) => two count => 1,2,3,6
  	7  (111) => three count => 1,2,3,6,7  
  	8  (1000) => one count  => 1,2,4,8
  	9  (1001) => two count  => 1,2,4,8,1
  	10 (1010) => two count  => 1,2,4,5,10
  	...
  	
  	So, if we count the set bits, we get the answer
*/
