package javaCollections;

import java.util.HashSet;
/*
 * For a given set of values, identify the number of
 * unique values
 */
public class JavaCollections {

	String[] coln;
	HashSet<String> Hs;
	public JavaCollections(String[] io) {
		
		Hs = new HashSet<>();
		coln  = io;
	}
	public int getUniqueValuesCount()
	{
		int count = 0;
		for(int i = 0; i<coln.length; i++)
		{
		    if(Hs.add(coln[i]))
		    {
		            count +=1;
		    }
		}
		return count;
	}
}
