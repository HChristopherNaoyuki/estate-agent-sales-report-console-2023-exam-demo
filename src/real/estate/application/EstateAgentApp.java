package real.estate.application;

import java.text.DecimalFormat;

/**
 * Main application class for Estate Agent sales reporting.
 */
public class EstateAgentApp
{
    public static void main(String[] args)
    {
        // Property sales data for two estate agents over three months
        double[][] propertySales = {
            {800000, 1500000, 2000000},  // Sales data for Joe Bloggs: January, February, March
            {700000, 1200000, 1600000}   // Sales data for Jane Doe: January, February, March
        };

        // Create instances of EstateAgent for Joe Bloggs and Jane Doe
        EstateAgent joeBloggs = new EstateAgent("Joe Bloggs", propertySales[0]);
        EstateAgent janeDoe = new EstateAgent("Jane Doe", propertySales[1]);

        // Create a DecimalFormat instance for currency formatting
        DecimalFormat formatter = new DecimalFormat("#,###.00");

        // Print the header of the sales report
        System.out.println("ESTATE AGENTS SALES REPORT");
        System.out.println();
        
        // Print column headers for the months (JAN, FEB, MAR)
        System.out.printf("%-20s\t\t%-10s\t\t%-10s\t\t%-10s%n", "", "JAN", "FEB", "MAR");
        System.out.println("---------------------------------------------------------------------------------------------");

        // Display Joe Bloggs's sales formatted under the respective month columns
        System.out.printf("%-20s\t\tR%-10s\t\tR%-10s\t\tR%-10s%n",
                          joeBloggs.getName(),
                          formatter.format(propertySales[0][0]),
                          formatter.format(propertySales[0][1]),
                          formatter.format(propertySales[0][2]));

        // Display Jane Doe's sales formatted under the respective month columns
        System.out.printf("%-20s\t\tR%-10s\t\tR%-10s\t\tR%-10s%n",
                          janeDoe.getName(),
                          formatter.format(propertySales[1][0]),
                          formatter.format(propertySales[1][1]),
                          formatter.format(propertySales[1][2]));

        // Print total property sales for each estate agent
        System.out.println();
        System.out.printf("Total property sales for %s: R %s%n",
                          joeBloggs.getName(),
                          formatter.format(joeBloggs.getEstateAgentSales()));
        System.out.printf("Total property sales for %s: R %s%n",
                          janeDoe.getName(),
                          formatter.format(janeDoe.getEstateAgentSales()));

        // Print total commission earned by each estate agent
        System.out.println();
        System.out.printf("Sales Commission for %s: R %s%n",
                          joeBloggs.getName(),
                          formatter.format(joeBloggs.getEstateAgentCommission()));
        System.out.printf("Sales Commission for %s: R %s%n",
                          janeDoe.getName(),
                          formatter.format(janeDoe.getEstateAgentCommission()));

        // Print the top-performing estate agent
        System.out.print("\nTop performing estate agent: ");
        
        // Create an array of EstateAgent
        EstateAgent[] agents = {joeBloggs, janeDoe};
        
        // Correctly call the static topEstateAgent method
        int topAgentIndex = EstateAgent.topEstateAgent(agents);
        System.out.printf("%s%n", (topAgentIndex == 0 ? joeBloggs.getName() : janeDoe.getName()));

        // Prints a blank line
        System.out.println();
    }
}
