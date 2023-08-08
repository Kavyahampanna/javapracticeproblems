package javapracticeproblems;

public class Main29 {
//There are total n number of Monkeys sitting on the branches of a huge Tree. As travelers offer Bananas and Peanuts,
//the Monkeys Jump down the Tree. If every Monkey can eat k Bananas and j Peanuts. If total m number of Bananas and p number of Peanuts
//are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat.
//At a time one Monkeys gets down and finishes eating and go to the other side of the road. The Monkey who climbed down does not climb
//up again after eating until the other Monkeys finish eating. Monkey can either eat k Bananas or 3 Peanuts. 
//If for last Monkey there are less than k Bananas left on the ground or less than J
//Peanuts left on the ground, only that Monkey can eat Bananas (ck) along with the Peanuts(1). Write code to take inputs as n, m, p, k, j and
//return the number of Monkeys left on the Tree. Where, ne Total no of Monkeys
//k Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas) J= Number of eatable Peanuts by 
//single Monkey (Monkey that jumped down last may get less than j Peanuts)
//m Total number of Bananas
//P Total number of Peanuts Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero
//Example 1:
//Input Values        
//20 no of monkeys
//3 eat banana
//2  eat penut
//12 12/2=4
//12  12/3=6  =>4+6=10 =>20-10=10
//Output Values
//Number of Monkeys left on the tree:10
	public static void main(String[] args) {
		int n=20,k=3,j=2,m=12,p=12;
		int atebanana=0;
		int atepenut=0;
		if(n<0 && k<0 || j<0 ||m<0 ||p<0) {
			System.out.println("Invalid input");
		}
		else {
			if(k>0) {
				atebanana=m/k;
			}
			if(j>0) {
				atepenut=p/j;
			}
			n=n-atebanana-atepenut;
			System.out.println(n);
		}
	}

}