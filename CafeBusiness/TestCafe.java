import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestCafe {
    
	public static void main(String[] args) {
	    // TO-DO:
	    // Create an instance of the CafeUtil class        
	    // in order to use the CafeUtil class' methods.
        CafeUtil appTest = new CafeUtil();
    
	    // Hint: it will need to correspond with the variable name
	    // used in your test code.
        System.out.println("----- Streak Goal Test -----");
        appTest.setNumWeeks(5);
        appTest.getStreakGoal();

        System.out.println("----- Price Chart Test-----");
        appTest.printPriceChart("Chai Latte Mix", 4.5, 3);
        appTest.printPriceChart("Specialty Coaster", 2.0, 5);

        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n",appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");
        List<String> loadMenu = Arrays.asList( "drip coffee", "cappucino", "latte", "mocha" );
        List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);
        ArrayList<String> menu = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
            
        // Note: Below is a way to add multiple elements to a list in fewer lines.
        // It does require an extra import at the top of the file.
        menu.addAll(loadMenu);
        prices.addAll(loadPrices);
        appTest.displayMenu(menu, prices);

        System.out.println("----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // Test 4 times
        for (int i = 0; i < 4; i++) { 
            appTest.addCustomer(customers); 
            System.out.println(customers);
        }


// ////////////////sample code //////////////////////////////////
	    // Given Test Cases Here
        // System.out.println("----- Military Hours Test -----");
        // appTest.militaryHoursTest();

        // System.out.println("----- Special Alerts Test -----");
        // appTest.specialsAlert();

        // System.out.printf("Leads at day 10: %s \n", appTest.leadsAtDay10());

        // System.out.println("----- Display Menu Test-----");
        // String[] menu1 = {
        //     "drip coffee -- $1.50",
        //     "cappucino -- $3.50",
        //     "latte -- $4.50",
        //     "mocha -- $3.50"
        //     };
        // String[] menu2 = {
        //     "bagel -- $1.50",
        //     "avocado toast -- $6.50",
        //     "croissant -- $4.00",
        //     "quiche -- $2.00"
        //     };
        // appTest.displayMenu2(menu1);
        // appTest.displayMenu2(menu2);


       

        // double[] priceIndex = {1.5, 3.5, 4.5, 3.5, 1.5, 6.5, 4, 2};
        // System.out.printf("Highest price: %s \n",appTest.getHighestPrice(priceIndex));

        // String[] customers = {
        //     "Cindhuri", "Noah", "Sam", "Jimmy", 
        //     "Ian Curtis", "Ada", "Brandon Stantman", 
        //     "Zoe", "Jesse"};
        // System.out.println(appTest.raffleWinners(customers));
    
	}
}
