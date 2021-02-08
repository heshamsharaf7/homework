
// 2.	Write a Java method that Clone an array to a backup array.
package homew1;


import java.util.Arrays;

/**
 *
 * @author admin
 */
public class Homew2 {
    
    
    
   static  int[] temp ;
    
    static void backup( int[] dataarray){
        temp = dataarray;
        
    }
    
    
     public static void main(String[] args){

      
           int[] dataarray  = {1,2,3,4};
       System.out.println("\n\n\n\n\n-----------------------------\n");
       
       
         System.out.print("data  Array:");
           Arrays.stream(dataarray).forEach(System.out::print);
         backup(dataarray);
         System.out.print("\ndata backup  Array:");
         Arrays.stream(temp).forEach(System.out::print);
              System.out.println();
    }
    
    
}
