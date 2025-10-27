

        public class Main {
    import java.util.Scanner;

  public static void main(String [] args) {
   String highSchool = "Birch Wathen Lenox";
   double drinkPrice = 1.50;
   double candyPrice = 1.25;
   double hotDogPrice = 2.75;
   double hamburgerPrice = 3.50;
   int orderNumber = (int) (Math.random() * 100) + 1;
   int drinksOrdered = (int) (Math.random() * 2) + 1;
   int candyOrdered = (int) (Math.random() * 2) + 1;
   int hotdogOrdered = (int) (Math.random() * 2) + 1;
   int hamburgerOrdered = (int) (Math.random() * 2) + 1;
   double cost = + hamburgerOrdered * hamburgerPrice + candyOrdered * candyPrice + hotdogOrdered * hotDogPrice + drinksOrdered * drinkPrice;
   double totalCost = (cost * 1.08) + 1.00;


     // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchool + " Snack Bar          *");
     System.out.println("*     Order Number   "+ orderNumber +"                               *");
     System.out.println("*     Drink ..........$ " + drinkPrice + "          *");                      
     System.out.println("*     Candy ..........$ " + candyPrice + "          *");     
     System.out.println("*     Hot Dog ........$ " + hotDogPrice + "          *");     
     System.out.println("*     Hamburger ......$ " + hamburgerPrice + "          *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");

     System.out.println("*   Total Cost ........*" + totalCost);
     System.out.println("***********************");

  }
  }

   

