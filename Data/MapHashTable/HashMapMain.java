package Data.MapHashTable;

import java.util.Map;
import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args){
		
	    Map<String, String> objMap = new HashMap<String, String>();
	    
	    objMap.put("Name", "Suzuki");
	    objMap.put("Power", "220");
	    objMap.put("Type", "2-wheeler");
	    objMap.put("Price", "85000");
	    
	    objMap.remove("Type");
	    
	    System.out.println(objMap.containsKey("Power"));
	    
	    System.out.println(objMap.containsValue("85000"));
	    
	    System.out.println(objMap.keySet());
	    
	    System.out.println(objMap.values());
	    
	    System.out.println(objMap.isEmpty());
	    
	    System.out.println("Elements of the Map:");
	    System.out.println(objMap);
	  }
}
