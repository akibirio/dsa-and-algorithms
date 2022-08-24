
package africadventures.missingnumber;

/**
 *
 * @author Ayub
 */
public class MainMissingNumber {
    
    public static void main(String[]args){
        MissingNumber obj = new MissingNumber();
        
        int[] natNumbers = {1,2,3,5};
        int arraySize = 5;        
        
        System.out.println("Missing is : " + obj.findMissingNumber(natNumbers, arraySize));
        
   
    }
    
}
