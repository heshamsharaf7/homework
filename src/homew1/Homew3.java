// 3.	Write a Java method that remove elements from an array.

package homew1;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author admin
 */
public class Homew3 {
    

/**
* Created by sakura on 9/19/16.
*/

public static void main(String[] args) {
int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };



 
System.out.print("Original Array:");
    Arrays.stream(array).forEach(System.out::print);
    System.out.println(); 
    
    System.out.print("remove Elements Array:");
    Arrays.stream(removeElements(array, 3)).forEach(System.out::print);
    System.out.println();

      
}

static int[] removeElements(int[] array, int em) {
    
      int[] temp = new int[array.length -1];
      int cont = 0;
    for(int i = 0; i < array.length; i++){
        if(array[i] != em){
            temp[cont++] = array[i];
        }
    }
    return temp;
}
}

