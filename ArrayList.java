package arraylist;

import java.util.Arrays;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	 //arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
	
  	public boolean addItem(T item) 
  	{
  		boolean Added;
  		
  		if (currentItem < arList.length) 
  		{
  			if (arList[currentItem] != null) 
  			{
  				currentItem = currentItem +1;
  			}
  			arList[currentItem] = item;
  			Added = true;
  		}
  		else 
  		{
  			Added = false;
  		}
  		return Added;
  	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0;i < arList.length; i++) 
		{
			builder.append(arList[i] + " ");
		}
			 
		
	return builder.toString();
		
	}
  	
  
  
}//end class
