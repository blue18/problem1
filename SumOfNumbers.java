/* 
	January 4, 2018
	Write three functions that compute the sum of the numbers
	in a given list using a for-loop, a while-loop, and recursion.
*/
import java.io.*;
import java.util.*;

public class SumOfNumbers
{
	ArrayList<Integer> list = new ArrayList<Integer>();

	public SumOfNumbers(ArrayList<Integer> n) {
		list.addAll(0, n);
	}

	// for-loop function
	int forLoop() {
		int total = 0;

		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}

		return total;
	}

	// while-loop function
	int whileLoop() {
		int total = 0;
		int i = 0;

		while(list.size() > i) {
			total += list.get(i);
			i++;
		}

		return total;
	}

	// recursion function
	int recursion() {
 		return recursionHelper(list.get(list.size() - 1));	
	}

	int recursionHelper(int n) {
		
		list.remove(list.size() - 1);

		if (list.isEmpty()) {
			return n;
		} else {
			System.out.print(list.get(list.size() - 1) + "\n");
			return n + recursionHelper(list.get(list.size() - 1));
		}
	}



   public static void main(String args[]) {

	   	ArrayList<Integer> data = new ArrayList<Integer>();
	   	data.add(10);
	   	data.add(12);
	   	data.add(20);
	   	SumOfNumbers x = new SumOfNumbers(data);
	   	System.out.print(x.recursion() + "\n");

   }
}








