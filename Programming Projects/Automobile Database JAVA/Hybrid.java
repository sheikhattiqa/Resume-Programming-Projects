/*Filename: Hybrid
Developer: Attiqa A. Sheikh
Date: April 11, 2020
Purpose: Stores the mile per gallon of vehicle. If vehicle mpg is 
less than 40, then a discount of $100 is applied. If mpg is more 
than 40, then an additional discount of $2 every mpg is applied.
*/

class Hybrid extends Automobile {
   private int mpg;
//constructor that initializes make and model, purchase price, and mpg  
   public Hybrid(String makeAndmodel, double purchasePrice, int mpg){
      super(makeAndmodel, purchasePrice);
      this.mpg = mpg;
      }
   @Override
//overriden method that applies disount according to vehicle mpg
   public double salesTax(){
      double salesTaxPrice = super.salesTax();
      
          if(mpg < 40) {
           if(salesTaxPrice - 100 >=0) {              
               return salesTaxPrice - 100;
           }else {
               return 0.0;
           }
       }else {
           int disct = (this.mpg - 40) * 2;
           if(salesTaxPrice - disct-100 >= 0) {              
               return salesTaxPrice - disct -100;
           }else {
               return 0.0;
           }
       }
   }
   public int getMpg(){
      return mpg;
      }
   public void setMpg(){
      this.mpg = mpg;
      }
   
   @Override
//overriden toString method that prints make and model, sales price, sales tax, hybrid vehicle and mpg 
   public String toString(){
      return "Make and Model: " + this.getMakeAndmodel() + "\n" + "Sales Price: " + this.getPurchasePrice() +"\n" + "Sales Tax: " + this.salesTax() +"\n" + "Hybrid Vehicle \n" + "MPG: " + this.getMpg() +"\n";
}}