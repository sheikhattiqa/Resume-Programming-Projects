/*Filename: Electric
Developer: Attiqa A. Sheikh
Date: April 11, 2020
Purpose: Stores weight of electric vehicle, calculates discount of  $200 into sale price 
if vehicle is more than 3000 pounds, if not then calculates discount of $150
*/

class Electric extends Automobile{
   private int weight;
//constructor to initialize make and model, purchase price, and weight   
   public Electric(String makeAndmodel, double purchasePrice, int weight){
      super(makeAndmodel, purchasePrice);
      this.weight = weight;
      }
   @Override
   //overriden salesTax method
   public double salesTax(){ 
   /*calculates sales tax and applies discount for
   vehicle according to weight*/
      double salesTaxPrice = super.salesTax();
         if(weight > 3000){
            if(salesTaxPrice - 200 >= 0){
            return salesTaxPrice - 200;
            }
            else {
               return 0.0;
               }
             }else{
               if(salesTaxPrice - 150 >= 0){
               return salesTaxPrice - 150;
               }else {
                  return 0.0;
                  }}}
   public int getWeight(){
      return weight;
      }
   public void setWeight(){
      this.weight = weight;
      }
   @Override   
   //overriden toString method that prints make and model, sales price, sales tax, weight, and vehice type
   public String toString(){
      return "Make and Model: " + this.getMakeAndmodel() + "\n" + "Sales Price: " + this.getPurchasePrice() + "\n" + "Sales Tax: " + this.salesTax() + "\n" + "Weight: " + this.getWeight() + "\n" + "Electric Vehicle\n";
      }
      }