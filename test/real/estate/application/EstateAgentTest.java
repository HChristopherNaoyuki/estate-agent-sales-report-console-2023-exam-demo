package real.estate.application;

import org.junit.Test;
import static org.junit.Assert.*;

public class EstateAgentTest
{
    // Test case to check if total sales are correctly calculated
    @Test
    public void testCalculateTotalSales_ReturnsTotalSales()
    {
        // Arrange: Setup the test data for property sales
        double[] propertySales = {800000, 1500000, 2000000}; // Test sales data
        EstateAgent agent = new EstateAgent("Test Agent", propertySales); // Create an EstateAgent object

        // Act: Calculate the total sales for the agent
        double totalSales = agent.getEstateAgentSales(); // Call the method to get the total sales

        // Assert: Verify that the total sales is as expected
        assertEquals(4300000.0, totalSales, 0.01); // Check if the total sales is correct
    }

    // Test case to check if the commission is calculated correctly (2% of total sales)
    @Test
    public void testCalculateTotalCommission_ReturnsCommission()
    {
        // Arrange: Setup the test data for property sales
        double[] propertySales = {800000, 1500000, 2000000}; // Test sales data
        EstateAgent agent = new EstateAgent("Test Agent", propertySales); // Create an EstateAgent object

        // Act: Calculate the commission for the agent
        double commission = agent.getEstateAgentCommission(); // Call the method to calculate commission

        // Assert: Verify that the commission is correct (2% of total sales)
        assertEquals(86000.0, commission, 0.01); // Check if the commission is 2% of the total sales
    }

    // Test case to verify that the top agent is correctly identified
    @Test
    public void testTopAgent_ReturnsTopPosition()
    {
        // Arrange: Setup test data for two agents' property sales
        double[][] propertySales = {
            {800000, 1500000, 2000000},  // Agent 1 (Total sales: 4300000)
            {700000, 1200000, 1600000}   // Agent 2 (Total sales: 3500000)
        };

        // Create agent instances with the test data
        EstateAgent agent1 = new EstateAgent("Agent 1", propertySales[0]);
        EstateAgent agent2 = new EstateAgent("Agent 2", propertySales[1]);

        EstateAgent[] agents = {agent1, agent2}; // Array of estate agents

        // Act: Identify the top agent
        int topAgentIndex = EstateAgent.topEstateAgent(agents); // Call the method to get the top agent's index

        // Assert: Verify that the correct agent is identified as the top agent
        assertEquals(0, topAgentIndex); // Agent 1 should be the top-performing agent
    }

    // Test case to verify that the top agent is correctly identified in an alternate scenario
    @Test
    public void testTopAgent_ReturnsTopPosition_Alternate()
    {
        // Arrange: Setup test data for two agents' property sales
        double[][] propertySales = {
            {500000, 700000, 900000},   // Agent 1 (Total sales: 2100000)
            {1000000, 1200000, 1500000} // Agent 2 (Total sales: 3700000)
        };

        // Create agent instances with the test data
        EstateAgent agent1 = new EstateAgent("Agent 1", propertySales[0]);
        EstateAgent agent2 = new EstateAgent("Agent 2", propertySales[1]);

        EstateAgent[] agents = {agent1, agent2}; // Array of estate agents

        // Act: Identify the top agent
        int topAgentIndex = EstateAgent.topEstateAgent(agents); // Call the method to get the top agent's index

        // Assert: Verify that the correct agent is identified as the top agent
        assertEquals(1, topAgentIndex); // Agent 2 should be the top-performing agent
    }
}
