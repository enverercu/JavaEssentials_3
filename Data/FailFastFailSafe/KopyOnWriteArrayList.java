package Data.FailFastFailSafe;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Arrays;
import java.util.Iterator; 
  
public class KopyOnWriteArrayList { 
    public static void main(String args[]) 
    { 
    	Integer[] intArray = {1,3,5,8};//must be immutable to add in an arraylist
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(Arrays.asList(intArray)); 
        Iterator itr = list.iterator(); 
        while (itr.hasNext()) { 
            Integer no = (Integer)itr.next(); 
            System.out.println(no); 
            if (no == 8) 
  
                // This will not print, 
                // hence it has created separate copy 
                list.add(14); 
        } 
    } 
} 