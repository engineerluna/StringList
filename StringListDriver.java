import java.util.*;

public class StringListDriver
	{
		public static void main(String[] args)
			{
			
				StringList list = new StringList(3);
				
				list.add("Luis");
				list.add("Francis");
				list.add("Luna");
				list.add("Loves");
				list.add("Going");
				list.add("for"); 
				list.add("a");
				list.add("run");
				
				System.out.println("Size is "+ list.size() + " and capacity is " + list.getCapacity());
				System.out.println(list);
				list.remove(8);
				list.remove(7);
				list.remove(6);
				
				
				list.add("to");
				list.add("the");
				list.add("gym");
				System.out.println(list);

				//Add a string in a location that does not exist
				//to output an error
				list.add(10, "error");
			}//END main

			 		
	}		
