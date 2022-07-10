package com.currencyDenominations.main;
import com.currencyDenominations.services.*;
import com.currencyDenominations.sorting.*;

public class Main {

	public static void main(String[] args) {

		// Number of denominations available
		int numOfDenominations=MyConsole.getIntegerValues("Enter number of denominations: ");
		int[] denominations=new int[numOfDenominations];
		
		//Input of available denominations
		for (int i = 0; i < numOfDenominations; i++) {
			denominations[i]=MyConsole.getIntegerValues("Enter "+(i+1)+" denomination: ");
		}
		
		//Sort denominations via Merge Sort
		MergeSort sorting=new MergeSort();
		sorting.mergeSort(denominations,0, numOfDenominations-1);
		
		//Amount to be paid
		int paidAmount=MyConsole.getIntegerValues("Enter amount to be paid: ");
		
		int amountleft=paidAmount;
		int denominationCount=numOfDenominations-1;
		
		MyConsole.print("Possible Denomination:");
		//Getting possible denomination
		while (amountleft!=0) {
			if(denominationCount<0){
				MyConsole.print("Further Denomination not possible for amount:"+amountleft);
				break;
			}
			int val=amountleft/denominations[denominationCount];
			amountleft=amountleft-denominations[denominationCount]*val;
			if(val!=0) MyConsole.print(denominations[denominationCount]+ " : "+val);
			denominationCount--;
		}
		
	}

}
