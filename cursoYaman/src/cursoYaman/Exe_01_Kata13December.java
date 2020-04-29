package cursoYaman;

import java.util.List;
import java.util.*;



public class Exe_01_Kata13December {
	
	public static void main(String[] args) {
		
	        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
	        //List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
	        /**/
	        for (int i = 0; i < listOfNumbers.size(); i++)
	        {
	        	System.out.print(" "+listOfNumbers.get(i));
	        }
	        System.out.println("");
	        filterOddNumber(listOfNumbers);
	        System.out.println("");
	        /**/
	        for (int i = 0; i < listOfNumbers.size(); i++)
	        {
	        	System.out.print(" "+listOfNumbers.get(i));
	        }
	    	
	}
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = 0; i < listOfNumbers.size(); i++)
        {
        	System.out.print(" "+listOfNumbers.get(i)%2);
            if (listOfNumbers.get(i)%2 == 0)
            {
                listOfNumbers.remove(i);
                i = 0;
            }
        }
        return listOfNumbers;
    }
}