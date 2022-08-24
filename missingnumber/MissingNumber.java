
package africadventures.missingnumber;

/**
 *
 * @author Ayub
 */
public class MissingNumber {
    public int findMissingNumber(int[] natNumbers, int size){
        int missingNatNum;
        int tempSum =0;
        int SumResult;
        
        //n(n+1)/2
        SumResult = size * (size+1)/2;
        for(int i = 0; i < natNumbers.length; i++){
                tempSum += natNumbers[i];
        }
        //getMissingNumber
        missingNatNum = SumResult - tempSum;
        
        //return the missingNumber after finding it from the expression above
        return missingNatNum;
    }
    
}
