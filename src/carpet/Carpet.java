/*
 * Bennie
 * Carpet.java
 * This program calculates the area of the carpet
 * February 27,2018
 */
package carpet;

/**
 *
 * @author huangsiwen
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length;
        double width,price,Area;
        length=6;
        width=8.5;
        price=19.95;
        Area=width*length/price;
        
        System.out.println("the area of the carpet is "+Area+" m^2");
    }
    
}
