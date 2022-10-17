package Maps;

import java.util.Map.Entry;
import java.util.TreeMap;


public class Treemap {
	public static void main(String args[])
	{
	TreeMap<Integer,String> map=new TreeMap<Integer,String>();
	//adding elements in TreeMap
	map.put(1, "amar");
	map.put(2 , "Jeni");
	map.put(3 ,"Jananai");
	map.put(4 ,"arthi");
	//key is not null value is null
	map.put(5,null);
	//key is null value is not null
	//Null key is not accepted in treemap
	//map.put(null,"jenitha");
	//key and value are null
	//map.put(null,null);
	map.put(6,"amar");

	//Displaying added element	
	System.out.println(map);
	
	//Getting element by key value
	System.out.println("Get element at 3rd key "+map.get(3));
	System.out.println("Get element at 5rd key "+map.get(5));
	System.out.println("Get element at 6rd key "+map.get(6));
	System.out.println("Get element at 7rd key "+map.get(7));
	//System.out.println("Get element at  key "+map.get(null));
	
	//To remove element by key
	map.remove(5);
	System.out.println(map);
	
	//Iterate using for loop
	for (Entry<Integer, String> m:map.entrySet()) {
		
		System.out.println(m.getKey()+ " , "+m.getValue());
	}
			
	
	

}

}