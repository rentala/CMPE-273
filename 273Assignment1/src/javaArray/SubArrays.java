package javaArray;

//For a given array size and array, 
//find the negative sub arrays
public class SubArrays {

	int noOfSubarrays = 0;
	public SubArrays(int[] arr ) {
		int arrayLength = arr.length;
		int[] intarray = arr;
		int sum = 0;
		
		for(int i =0; i< arrayLength; i++)
		{
			if(intarray[i] < 0){
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
	}
	public int noOfNegativeSubArrays()
	{
		return noOfSubarrays;
	}
	
}
