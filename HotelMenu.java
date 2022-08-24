/*
 * 
 * 
 */
package africadventures;

/**
 *
 * @author Ayub
 */
public class HotelMenu {
    
    public static  double calculateMealPrice(double tiprate,double taxrate, int price){
        double totalMealPrice;
        double tip = tiprate * price;
        double tax = taxrate * price;
        totalMealPrice = tip + tax + price;
        
        return Math.floor(totalMealPrice);
    }
    
    public static void main(String[] args) {
        double result = calculateMealPrice(0.02, 0.14, 94);
        System.out.println("Total Meal Price : " + result);
        System.out.println();
    }
    
}
