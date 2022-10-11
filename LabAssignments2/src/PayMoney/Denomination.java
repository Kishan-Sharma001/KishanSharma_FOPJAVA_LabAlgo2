package PayMoney;
import java.util.Arrays;
import java.util.Scanner;

public class Denomination {
	  int i, j;
	public static void countCurrency()
    {
		 int amount;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the size of currency Denomination");
			int size = s.nextInt();
			int arr[] = new int[size];
			int[] noteCounter = new int[size];
			System.out.println("enter the currency denomination value");
			for (int i = 0; i < size; i++)
				arr[i] = s.nextInt(); 
			 Arrays.sort(arr);
			 reverse(arr);
			
			System.out.println("enter the value of target");
			amount = s.nextInt();
			for ( int i = 0; i < size; i++) {
			    if (amount >= arr[i]) {
			        noteCounter[i] = amount / arr[i];
			        amount = amount % arr[i];
			    }
			}
			// Print notes
			System.out.println("Currency Count ->");
			for (int  i = 0; i < size; i++) {
			    if (noteCounter[i] != 0) {
			        System.out.println(arr[i] + " : "
			            + noteCounter[i]);
			    		}
			}
		}
		}

static void reverse(int arr[]) {
  int t ,size=arr.length;
    for (int i = 0; i < size / 2; i++)
    {
        t = arr[i];
        arr[i] = arr[size - i - 1];
        arr[size - i - 1] = t;
    }
}
        	
	
	
	public static void main(String args[]) throws Exception {
		countCurrency();
	
		}
	}

