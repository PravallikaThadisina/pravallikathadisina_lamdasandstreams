package com.epam.LamdasandStreams;


	import java.util.ArrayList;
	import java.util.function.Predicate;

	public class filterList {

		public ArrayList<String> filterListStartingWithLengthThreeAndStartingWithA(String[] s, Predicate<String> predicate) {
			// TODO Auto-generated method stub
			ArrayList<String> finalList=new ArrayList<>();
			for(String str:s)
			{
				if(predicate.test(str))
				{
					finalList.add(str);
				}
			}
			return finalList;
		}

	}


