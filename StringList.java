/*	Luis Luna
	Comp182 MW 9:30am-12:15pm
	Project #3
	September 13, 2010
	*/
	
import java.util.*;

public class StringList
	{
		//Data Fields
		private String[] data;
		private int capacity;
		private int size;
		
		//Methods
		public StringList(int n) 
		{
			data = new String[n];
			capacity = data.length -1;
			size = 0;
			
			
			}//END StringList
			
	
			
		public boolean isEmpty()
		{
			boolean empty =false;
			if(size==0)
				empty = true;
			
			return empty;
			
		}//END isEmpty
			
		
		
		public int size()
		{
			int size = 0;
			for(int i=1; i<data.length;i++){
			
				if((data[i]!= null))
						size++;
			}
			return size;
			
			}//END size
			
		public void removeAll()
		{
			
			
			for(int i=1; i<=size+1;i++)
				{
					data[i] = null;
				}
			size = 0;
			
			}//END removeAll

		
			
		public void add(String item)
		{	
			//If the size is less than capacity
			//Then there is room to add more items.
			if(size<capacity)
				{
					data[size+1] = item;
					size++;
					}
			else{
			//Else, if the capacity is full & there's no more
			//room then, create anoter array with double the 
			//capacity of the first.
				doubleCapacity();
				data[size+1]= item;
				size++;
				}
				
			//System.out.println("Size: " + size);
			
			
			}//END add
			
		
		public void add(int index, String item)throws ListIndexOutOfBoundsException
		{
				
			if(index>size+1||index<1)
				throw new ListIndexOutOfBoundsException("index: " +index);
				
			else if(size==capacity){
					doubleCapacity();
					for(int i=size;i>=index;i--)
						{
							data[i+1] = data[i];
							
						} 
		
					data[index] = item;
					size++;
					}
			else{
					for(int i=size;i>=index;i--)
						{
							data[i+1] = data[i];
						} 
		
					data[index] = item;
					size++;
					}
			
			
					}//END add
			
		public String get(int index)throws ListIndexOutOfBoundsException
		{
			if(index>size+1 || index<1 )
			
				throw new ListIndexOutOfBoundsException("index :" + index);
			
			else 
				return data[index];
			}//END get
			
			
		
		public String remove(int index)throws ListIndexOutOfBoundsException
		{

			String temp = "";
			if(index>size|| index<1 )
				throw new ListIndexOutOfBoundsException("index: " +index);
				
			else 
				{
					
					temp = data[index];
					
					for(int i =index; i<size;i++)
						data[i] = data[i+1];
						
						data[size] = null;
						
						
				}
				size--;
				return temp;
				
				
			
			}//END remove
			
			
		public String toString()
		{	
			String s= "" ;
			for(int i=1; i<data.length;i++)
			if(data[i]!=null)
				s+= i+ ": " +data[i]+"\n";
				
							
			return s;
				
			}//END toString
			
			
		public int getCapacity()
			{
				return capacity;
			}
			
		public void doubleCapacity()
		{
			String[] newData = new String[2*data.length-1];
			for(int i=1;i<=size;i++)
				{
					newData[i] = data[i];
				}
			capacity = 2*capacity;
			data = newData;
			
			
			}//END doubleCapacity
			
}//END main
	
