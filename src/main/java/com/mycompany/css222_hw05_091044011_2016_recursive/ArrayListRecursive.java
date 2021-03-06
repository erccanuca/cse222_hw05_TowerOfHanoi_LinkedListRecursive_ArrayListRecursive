/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.css222_hw05_091044011_2016_recursive;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ercan
 * @param <E> generic type
 */
public class ArrayListRecursive<E>{
    /**
     * list1 ArrayList type.
     */
    private ArrayList<E> list1;
    /**
     * list2 ArrayList type.
     */
    private ArrayList<E> list2;
    
    /**
     * Default Constructor.
     */
    public ArrayListRecursive() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();    
    }
    /**
     * Contructor with 2 parameter of ArrayLists.
     * @param list1 The list1 of ArrayList.
     * @param list2 The list2 of ArrayList.
     */
    public ArrayListRecursive(ArrayList<E> list1, ArrayList<E> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }
    /**
     * Wrapper method that, find intersection of lists.
     * @return null if a list is empty, otherwise created list.
     */
    public List<E> IntersectionOfLists(){
        if(list1.isEmpty() || list2.isEmpty())
            return null;
        else{
            List<E> returnedList = new ArrayList<>();
            return IntersectionOfList(list1, list2,returnedList,list1.size(),list2.size());
        }
        
    }
    
    /**
     * Recursive private method return Intersection of two lists.
     * @param list1 The first list object.
     * @param list2 The second list object.
     * @param returnedList The result list.
     * @param size1 The size of list1.
     * @param size2 The size of list2.
     * @return result list that intersection of list1 and list2.
     */
    private List<E> IntersectionOfList(List<E> list1,List<E> list2,
                                       List<E> returnedList,
                                       int size1, int size2){
	   
	   // Handling for ClassCast_intersectionList,add,get methods throws
       try{ 
			   if(size1 == 0 || size2 == 0)
				   return returnedList;
			   if(size1==1 && size2 == 1){
				   if(list1.get(0).equals(list2.get(0))){
					   returnedList.add(list1.get(0));
				   }
				   return returnedList;
			   }
			   else if(size1>=size2){
				   if(list2.get(size2-1).equals(list1.get(size1-1))){
					   returnedList.add(list1.get(size1-1));
					   size1=list1.size();
					   return IntersectionOfList(list1, list2, returnedList, size1, size2-1);
				   }else
					   return IntersectionOfList(list1, list2, returnedList, size1-1, size2);
			   }
			   else{
				   
				   if(list2.get(size2-1).equals(list1.get(size1-1))){
					   returnedList.add(list2.get(size2-1));
					   return  IntersectionOfList(list1, list2, returnedList, size1-1, size2-1);
				   }else{
						size1=list1.size();
						return IntersectionOfList(list1, list2, returnedList, size1, size2-1);
				   }
				  
			   }
		   }catch(NullPointerException       |
               ClassCastException            | 
               IllegalStateException         | 
               IllegalArgumentException      |
				   IndexOutOfBoundsException exp)
			{
				exp.printStackTrace(System.err);
				return null;
			} 
					  
	}
		
	/**
    * Wrapper method that, find union of lists.
	* @return null if a list is empty, otherwise created list.
	*/
	public List<E> UnionOfLists(){
		if(list1.isEmpty() || list2.isEmpty())
			return null;
		else{
			List<E> returnedList = new ArrayList<>();
			return UnionOfLists(list1, list2,returnedList,list1.size(),list2.size());
		}	
    }
    
     /**
     * Recursive private method return Union of two lists.
     * @param list1 The first list object.
     * @param list2 The second list object.
     * @param returnedList The result list.
     * @param size1 The size of list1.
     * @param size2 The size of list2.
     * @return result list that union of list1 and list2.
     */
    private List<E> UnionOfLists(List<E> list1,List<E> list2,
                                 List<E> returnedList,
                                 int size1, int size2){
	   // Handling for ClassCast_UnionOfLists,add,get methods throws
       try{ 
			if(size1 == 0 || size2 == 0){
				return returnedList;
			}else{
            if(!list1.get(size1-1).equals(list2.get(size2-1)))
            {
                if(!returnedList.contains(list1.get(size1-1)))
                    returnedList.add(list1.get(size1-1));
                if(!returnedList.contains(list2.get(size2-1)))
                    returnedList.add(list2.get(size2-1));
                return UnionOfLists(list1, list2, returnedList, size1-1, size2-1);
            }else{
                if(!returnedList.contains(list1.get(size1-1)))
                    returnedList.add(list1.get(size1-1));
                return UnionOfLists(list1, list2, returnedList, size1-1, size2-1);
            }
        }   
       }catch(NullPointerException       |
               ClassCastException            | 
               IllegalStateException         | 
               IllegalArgumentException      |
			   IndexOutOfBoundsException exp)
		{
			exp.printStackTrace(System.err);
			return null;
		} 
    }  
    
    /**
     * Wrapper method that, find is subset lists (true/false).
     * @return true if list2 is subset of list1, otherwise false. 
     */
    public boolean isSubSet(){
        if(list1.isEmpty() || list2.isEmpty())
            return false;
        else{
            return isSubSet(list1, list2,list1.size(),list2.size());
        }
    }
    
    /**
     * Recursive private method return boolean if list2 is subset of list1
     * @param list1 The first list object.
     * @param list2 The second list object.
     * @param returnedList The result list.
     * @param size1 The size of list1.
     * @param size2 The size of list2.
     * @return true if list2 is subset of list1,otherwise false. 
     */
    private boolean isSubSet(List<E> list1,List<E> list2,
								 int size1, int size2){
	// Handling for ClassCast_isSubSet,add,get methods throws
    try{
		   if(size1==1){
			   if(list1.get(0).equals(list2.get(size2-1)))
				   return true;
			   else
				   return isSubSet(list1, list2, size1, size2-1);
		   }
		   else if(size2==1){
				if(list1.get(size1-1).equals(list2.get(0)))
				   return true;
			   else
				   return isSubSet(list1, list2, size1-1, size2);
		   }else{
            if(size1>size2 && !list1.get(size1-1).equals(list2.get(size2-1)))
               return isSubSet(list1, list2, size1, size2-1);
            else if(size1<size2 && !list2.get(size2-1).equals(list1.get(size1-1)))
                return isSubSet(list1, list2, size1-1, size2);
            else{
                return isSubSet(list1, list2, size1-1, size2-1);
            }
                
        }   
	   }catch(NullPointerException           |
               ClassCastException            | 
               IllegalStateException         | 
               IllegalArgumentException      |
			   IndexOutOfBoundsException exp)
		{
			exp.printStackTrace(System.err);
			return false;
		} 
    }
    /**
     * toString overrided method
     * @return information of the class.
     */
    @Override
    public String toString() {
        return "ArrayListRecursive{" +
               "list1="   + list1.toString() + 
               ", list2=" + list2.toString() + '}';
    }



    
    
}
