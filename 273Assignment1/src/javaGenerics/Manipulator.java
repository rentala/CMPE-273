package javaGenerics;

public class Manipulator<T>{

	T[] col;
	public Manipulator(T[] col) {
		this.col = col;
	}
	public T[] getReverse(){
		int len = col.length;
		T temp;
		for(int i = 0; i< col.length/2; i++)
		{
			temp = col[i];
			col[i] = col[len-1];
			col[len-1] = temp;
			len--;
		}
		return col;
	}
}
