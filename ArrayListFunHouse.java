//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
   ArrayList<Integer> funHouse = new ArrayList<Integer>();
   for(int x = 2; x < number; x++)
   {
     if(number % x == 0)
     {
       funHouse.add(x);
     }
   }
   return funHouse;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   for(int y = nums.size() - 1; y >= 0; y--)
   {
     ArrayList<Integer> composite = getListOfFactors(nums.get(y));
     if(composite.size() == 0)
     {
       nums.remove(nums.get(y));
     }
   }
 }
}