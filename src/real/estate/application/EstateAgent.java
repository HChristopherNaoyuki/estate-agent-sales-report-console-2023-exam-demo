package real.estate.application;

public class EstateAgent
{
    // Instance variables
    private final String name;
    private final double[] sales;

    // Constructor to initialize EstateAgent with name and sales data
    public EstateAgent(String name, double[] sales)
    {
        this.name = name;
        this.sales = sales;
    }

    // Getter for the name of the estate agent
    public String getName()
    {
        return name;
    }

    // Method to calculate the total sales made by the estate agent
    public double getEstateAgentSales()
    {
        double total = 0;
        
        // Loop through the sales array and add up all the sales
        for (double sale : sales)
        {
            total += sale;
        }
        
        return total;
    }

    // Method to calculate the commission of the estate agent (assumed to be 2% of total sales)
    public double getEstateAgentCommission()
    {
        return getEstateAgentSales() * 0.02;
    }

    // Static method to compare the sales of multiple estate agents and return the index of the top-performing agent
    public static int topEstateAgent(EstateAgent[] agents)
    {
        // Initialize the first estate agent as the top-performing agent
        int topIndex = 0;
        double highestSales = agents[0].getEstateAgentSales();

        // Loop through the array of agents to find the agent with the highest sales
        for (int i = 1; i < agents.length; i++)
        {
            if (agents[i].getEstateAgentSales() > highestSales)
            {
                highestSales = agents[i].getEstateAgentSales();
                topIndex = i;
            }
        }

        // Return the index of the top-performing estate agent
        return topIndex;
    }
}
