package com.payMoney.main;
import com.payMoney.services.MyConsole;
public class Main {

	public static void main(String[] args) {

		//Input number of Transaction
		int numOfTransactions= MyConsole.getIntegerValues("Enter number of transactions: ");
		int[] transactionValues=new int[numOfTransactions];
		
		//Get Transaction Values
		for (int i = 0; i < numOfTransactions; i++) {
			transactionValues[i]=MyConsole.getIntegerValues("Enter the value of "+(i+1)+" transaction: ");
		}
		
		//Get Target to be achieved in count
		int transactionSize=MyConsole.getIntegerValues("Enter Transaction Size to achieve target: ");
		
		//Get Target value
		int targetTransactionsValue=MyConsole.getIntegerValues("Enter Target Transaction Value: ");
		
		//If Number of Transaction is 1 and Target Transaction size is 2 to avoid exception
		if(transactionSize>numOfTransactions)
			transactionSize=numOfTransactions;
		
		int totalTransactionValue=0;
		int targetAchievedTransaction=-1;
		
		//Finding whether transaction can be achieved
		for (int i = 0; i < transactionSize; i++) {
			totalTransactionValue+=transactionValues[i];
			if(totalTransactionValue>=targetTransactionsValue) {
				targetAchievedTransaction=i+1;
				break;
			}
		}
		
		//Check if Transaction achieved
		if(targetAchievedTransaction==-1)
			MyConsole.print("Target not be achieved");
		else
			MyConsole.print("Target achieved at transaction number "+targetAchievedTransaction);
		
	}
}
