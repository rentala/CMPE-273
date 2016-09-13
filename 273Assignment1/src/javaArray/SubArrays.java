package javaArray;

import java.util.Scanner;
//For a given array size and array, 
//find the negative sub arrays
public class SubArrays {

	public static void main(String[] arr) {
		// TODO Auto-generated constructor stub
		Scanner reader = new Scanner(System.in);
		int arrayLength = Integer.parseInt(reader.nextLine());
		int[] intarray = new int[arrayLength];
		String arrayElement = reader.nextLine();
		String[] elements = arrayElement.split(" ");
		int i = 0;
		int noOfSubarrays = 0;
		for(String s : elements)
		{
			intarray[i] = Integer.parseInt(s);
			i++;
		}
		int sum = 0;
		for(i =0; i< arrayLength; i++)
		{
			if(intarray[i] < 0){
				System.out.println("i : "+ intarray[i]);
				noOfSubarrays += 1;
			}
			sum = intarray[i];
			for(int j = i+1; j < arrayLength; j++)
			{
				sum += intarray[j];
				if(sum < 0)
				{
					noOfSubarrays += 1;
				}
			}
			sum = 0;
		}
		System.out.println(noOfSubarrays);
	}
	
}
