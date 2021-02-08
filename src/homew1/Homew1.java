// 1.	Write a Java method that Reverse an array using another array.
package homew1;

import java.util.*;

/**
 *
 * @author admin
 */
public class Homew1 {
/*function reverses the elements of the array*/
    static String[] reverse(String myArray[])  {
        String[] temp = new String[myArray.length];
        int cont = 0;
        for(int i = (myArray.length -1); i>= 0; i--){
            temp[cont++] = myArray[i];
        }
        return temp;
        
    }
    
    

 
     public static void main(String[] args)
    {
        String [] myArray = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
        System.out.println("Original Array:" + Arrays.asList(myArray));
    
      System.out.println("reverse Array:" + Arrays.asList(reverse(myArray)));
      
   

    }
    
  
}
