# Observer Design Pattern - Stock Market Example

This project demonstrates the **Observer Design Pattern** using a stock market scenario.

## 🧠 Pattern Overview

The **Observer Pattern** is a behavioral design pattern where an object, known as the **Observable** or **Subject**, maintains a list of its dependents, called **Observers**, and notifies them automatically of any state changes.

## 📈 Scenario

We simulate a simple **Stock Market system** where:

- The `StockAgent` (Observable) monitors stock price changes.
- Multiple `StockAgency` instances (Observers) subscribe to updates from the `StockAgent`.
- When the stock price goes up or down, all subscribed agencies are notified automatically.

This design ensures a **loosely coupled** and **scalable** system, where observers can be added or removed dynamically at runtime.

## 🔄 Components

- **Observable (Subject)**:
  - `StockAgent`: Maintains a list of observers and notifies them when the stock price changes.
  
- **Observers**:
  - `StockAgency`: Implements an `update()` method that responds to stock price changes.



