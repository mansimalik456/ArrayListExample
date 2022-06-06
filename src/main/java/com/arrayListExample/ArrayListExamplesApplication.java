package com.arrayListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayListExamplesApplication {

	private static final Logger logger = LoggerFactory.getLogger(ArrayListExamplesApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ArrayListExamplesApplication.class, args);
		
		 ArrayList<String> languages = new ArrayList<>(15);
		 
		// Get Size of the arrayList 
		 logger.info("The size of the array is before add elements in list :{}" , languages.size());  
		 
		 languages.add("Java");
		 languages.add("Python");
		 languages.add("Swift");
	     languages.add("JavaScript");
		 languages.add("HTML");
		 languages.add("CSS");
		 languages.add("Python");
		 
		 logger.info("The size of the arrayList: {}" , languages.size());
		    
		 logger.info("The size of the array is after add elements in list :  {}" , languages.size());   
		    
		 logger.info("After invoking add(E e) method: {}" , languages);  
		     
		    // Removing Duplicate element 
		    Set<String> s = new LinkedHashSet<String>(languages);  
		    logger.info("After removeing duplicate element from arrayList : {}" , s); 
		    
		    languages.add(1, "C++");  
		    logger.info("After invoking add(int index, E element) method: {}" , languages);  
		    
	        //accessing the element 
		    String str = languages.get(1);
		    logger.info("Get element at index 1 : {}" , str);
		    
		    //changing the element 
		    languages.set(2, "JavaScript");
		    logger.info("Modified ArrayList after set JavaScript at index 2 : {}" , languages);
		    
		 // getting the subList using subList() method
            List<String> arrlist = languages.subList(2, 6);
            logger.info("Sublist of arrlist language from 2 to 6 : {}" , arrlist);
		    
            logger.info("Traversing list through Iterator : " );
		    Iterator itr= languages.iterator(); 
		    while(itr.hasNext()){ 
		    	logger.info((String) itr.next()); 
		    }  
		    
		    logger.info("Traversing list through forEach() method:");   
		    languages.forEach(a->{                 //Here, we are using lambda expression  
		    	logger.info(a);  
	         });  
		    
		    //Traversing list through for-each loop  
		    logger.info("Traversing list through for-each loop : {}");
		    for(String list:languages)    
		    	logger.info(list);   
		    
		    
		 // using indexOf() to find index of 3
		    int pos = languages.indexOf("JavaScript");
		    logger.info("The element JavaScript is at index : {}" , pos);
		    
		    // using lastIndexOf() to find last index of 6
		    int pos2 = languages.lastIndexOf("JavaScript");
		    logger.info("The last occurrence of JavaScript is  : {}" , pos2);
		    
		    // Contains method of arrayList 
	        boolean ans = languages.contains("JavaScript");
	        if (ans)
	        	logger.info("The list contains JavaScript");
	        else
	        	logger.info("The list does not contains JavaScript");  
	        
	        //Remove element at index 2 
	        languages.remove(2); 
	        logger.info("Remove element at index 3 : {}" , languages);
	        
	        languages.remove("C++");
	        logger.info("Remove element C++: {}" , languages);
		   	        
	    //Removing elements on the basis of specified condition  
	    languages.removeIf(str1 -> str.contains("Swift"));   //Here, we are using Lambda expression   
	    logger.info("After invoking removeIf() method remove Swift if exist : {}" , languages);  
	        
	        
	    ArrayList<String> arrlist2 = new ArrayList<String>();
        arrlist2.add("1");
        arrlist2.add("2");
        arrlist2.add("3");
        // print arrlist2
        logger.info("Collection Elements to be removed : {}" , arrlist2);
        
        logger.info("addAll method : " + languages.addAll(arrlist2)); 
        logger.info("After invoking add(E e) method: {}" , languages);

        // Removing elements from arrlist specified in arrlist2 using removeAll() method
        languages.removeAll(arrlist2);
        // print arrlist1
        logger.info("ArrayList after removeAll() operation : {}" , languages);

     
        //Sorting the list 
        logger.info("Sorting the list : ");
	    Collections.sort(languages); 
	    //Traversing list through the for-each loop  
	    for(String listData:languages)  
	    	logger.info(listData);  
	   
	        

	}

}
