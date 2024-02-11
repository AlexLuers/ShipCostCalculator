/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shipcostcalculator;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class ShipCostCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaring variables
        double itemPrice;
        double shippingPrice;
        double totalPrice;
        //asking for input
        System.out.println("What is the price of your item?");
        itemPrice = in.nextDouble();
        if ((itemPrice) >= 100) 
        {       
            shippingPrice = 0;
        }
        else
        {
            shippingPrice = itemPrice * 0.2;
        }
        //doing the math
        totalPrice = shippingPrice + itemPrice;
        //outputs
        System.out.println("The shipping price is " + shippingPrice + "$");
        System.out.println("The total cost of your item is " + totalPrice + "$");
    }
    
}
