package Data.List.ArrayListSerialization;

import java.util.ArrayList;
import java.io.*;

public class ArrayListSerialization
{
   public static void main(String [] args)
   {
       ArrayList<String> al=new ArrayList<String>();
       al.add("Hello");
       al.add("Hi");
       al.add("Howdy");

       try{
         FileOutputStream fos= new FileOutputStream("D:/myfile.txt");
         ObjectOutputStream oos= new ObjectOutputStream(fos);
         oos.writeObject(al);
         oos.close();
         fos.close();
       }catch(IOException ioe){
            ioe.printStackTrace();
        }
   }
}