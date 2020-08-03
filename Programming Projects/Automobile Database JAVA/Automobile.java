/*Filename: Automobile
Developer: Attiqa A. Sheikh
Date: April 11, 2020
Purpose: Contains automobile’s make, model, and purchase price in whole dollars.
*/
public class Automobile {
   private String makeAndmodel;
   private double purchasePrice;
//constructor that initializes intance variables makeAndmodel and purchasePrice
   public Automobile(String makeAndmodel, double purchasePrice){
      super();
      this.makeAndmodel = makeAndmodel;
      this.purchasePrice = purchasePrice;
      }
   public String getMakeAndmodel(){
      return makeAndmodel;
      }
   public double getPurchasePrice(){
      return purchasePrice;
      }
   public void setPurchasePrice(){
      this.purchasePrice = purchasePrice;
      }
   public double salesTax(){
   //calculate sales tax by multiplying purchase price by 5%
      return this.purchasePrice * 0.05; 
      }   
   public String toString(){
   //prints out make and model, sales price, and sales tax of vehicle
      return ("Make and Model: " + makeAndmodel + "\n" + "Sales Price: " + purchasePrice + "\n" + "Sales Tax: " + this.salesTax() + "\n");
      }
      }
   
  