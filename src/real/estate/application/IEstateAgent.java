package real.estate.application;

/**
 * Interface for estate agent functionalities.
 */
interface IEstateAgent 
{
    double estateAgentSales(double[] propertySales);
    double estateAgentCommission(double totalSales);
    String topEstateAgent(EstateAgent otherAgent);
}
