package com.epam.LamdasandStreams;

public class Average {
	public double averageOfList(int[] l)
	   {
		   double s=0;
		   for(int i=0;i<l.length;i++)
			   s+=l[i];
		   return (double)(s/l.length);
	   }

}
