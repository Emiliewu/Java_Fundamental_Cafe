public class CafeJava {
  public static void main(String[] args) {
      // APP VARIABLES
      // Lines of text that will appear in the app. 
      String generalGreeting = "Welcome to Cafe Java, ";
      String pendingMessage = ", your order will be ready shortly";
      String readyMessage = ", your order is ready";
      String displayTotalMessage = "Your total is $";
      
      // Menu variables (add yours below)
      double mochaPrice = 3.5;
      //Create 3 more drink price variables, for drip coffee, latte and cappucino following the Pascal case naming convention.
      double dripCoffeePrice = 2.4;
      double lattePrice = 5.5;
      double cappucinoPrice = 4.5;
  
      // Customer name variables (add yours below)
      String customer1 = "Cindhuri";
      //Create 3 more customer variables for Sam, Jimmy and Noah, following the same variable naming convention in the example.
      String customer2 = "Sam";
      String customer3 = "Jimmy";
      String customer4 = "Noah";
  
      // Order completions (add yours below)
      boolean isReadyOrder1 = false;
      // Create the order status flag (true/false) for each customer, following the variable naming convention in the example.
      boolean isReadyOrder2 = false; 
      boolean isReadyOrder3 = false;
      boolean isReadyOrder4 = false;

       // Last requirement: Try changing the price values for each drink and isReady flags (booleans), to test if all of your logic works, even when prices and statuses are changed.
      isReadyOrder1 = true;
      isReadyOrder2 = true;
      isReadyOrder3 = true;
      isReadyOrder4 = true;
  
      // APP INTERACTION SIMULATION (Add your code for the challenges below)
      // Example:
      System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    // ** Your customer interaction print statements will go here ** //
    // Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status.
      
      System.out.println(customer1 + pendingMessage);
    //Noah ordered a cappucino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.
      if(isReadyOrder4 == true) {
        System.out.println(customer4 + readyMessage);
      } else {
        System.out.println(customer4 + pendingMessage);
      }
      //Sam just ordered 2 lattes, print the message to display their total first. Next print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statements).
      System.out.println(customer2 + displayTotalMessage + cappucinoPrice*2);
      if(isReadyOrder2 == true) {
        System.out.println(customer4 + readyMessage);
      } else {
        System.out.println(customer4 + pendingMessage);
      }
      //Jimmy just realized he was charged for a coffee but had ordered a latte. Tell him his new total (what he owes) to make up the difference.
      System.out.println(customer3 + displayTotalMessage + (lattePrice-dripCoffeePrice));
      
     


  }
}
