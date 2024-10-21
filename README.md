# Real Estate Application

## Overview

The **Real Estate Application** is a Java program designed to manage and report sales data for estate agents. It allows you to track the sales made by different agents, calculate their total sales and commissions, and identify the top-performing agent.

## Features

- **Sales Tracking**: Records monthly sales data for estate agents.
- **Commission Calculation**: Computes commission based on total sales (2% of total sales).
- **Top Agent Identification**: Identifies the agent with the highest total sales.

## Requirements

- Java Development Kit (JDK) 8 or higher.
- An IDE that supports Java (e.g., IntelliJ IDEA, Eclipse).

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd real-estate-application
   ```

2. **Compile the Application**:
   Ensure your JDK is set up correctly. You can compile the application using:
   ```bash
   javac -d bin src/real/estate/application/*.java
   ```

3. **Run the Application**:
   Navigate to the `bin` directory and execute the main class:
   ```bash
   java real.estate.application.EstateAgentApp
   ```

## File Structure

- `src/`: Contains all the source code for the application.
  - `real/estate/application/EstateAgent.java`: Contains the logic for estate agent data handling.
  - `real/estate/application/EstateAgentApp.java`: The main application class for sales reporting.
  - `real/estate/application/IEstateAgent.java`: An interface for estate agent functionalities.
  - `real/estate/application/EstateAgentAppTest.java`: Unit tests for the main application.
  - `real/estate/application/EstateAgentTest.java`: Unit tests for the `EstateAgent` class.

## Usage

- Upon launching the application, it displays a sales report for estate agents, including their total sales and commissions.
- The top-performing agent is also identified and displayed.

## Testing

The application includes unit tests to ensure functionality:
- **EstateAgentTest**: Tests for total sales calculations, commission calculations, and top agent identification.
- **EstateAgentAppTest**: Ensures the main application runs without exceptions.

To run the tests, use a testing framework like JUnit. Make sure to have it included in your project dependencies.

## Notes

- The application assumes a fixed commission rate of 2% for calculations.
- Sales data for estate agents is hardcoded for demonstration purposes. You may want to implement file I/O or a database for dynamic data management in a real-world application.
