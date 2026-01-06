package PracticePgms;

import java.util.Scanner;

public class gasStation {

public static int canCompleteCircuit(int[] gas, int[] cost) {
    	
		int gasavail = 0;
		int startpoint = 0;
		int j = 0;
		Boolean exitflag = false;
		Boolean startflag = false;

		int gas_length = gas.length;
		
		// for (int j = 0; j < gas_length; j++) {

		while (exitflag == false) {

			gasavail += gas[j];

			if (gasavail >= cost[j]) {

				gasavail -= cost[j];
				
				
				if (((startpoint-1) == j) && (startflag = true)) {
					exitflag = true;
				}
				
				if (startflag == false) {
					startpoint = j;
					startflag = true;
				}

			

			} else {
				gasavail = 0;
			}

			if (j == (gas_length - 1) && (startflag = true)) {
				j = 0;
			} else if (j == (gas_length - 1) && (startflag = false)) {
				exitflag = true;
			} else {
				j++;
			}
		}

		if (startpoint > 0) {
			return startpoint;
		} else {
			return -1;
		}
	}

	public static void main(String args[]) {

		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		n = scan.nextInt();

		int[] gas = new int[n];
		int[] cost = new int[n];

		System.out.println(n);
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the elements of the gas array:");
			gas[i] = scan.nextInt();
			System.out.println("Enter the elements of the cost array:");
			cost[i] = scan.nextInt();
		}
		int get_result = canCompleteCircuit(gas, cost);
		System.out.println("Result : " + get_result);

	}
}