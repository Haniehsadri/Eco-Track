# Carbon Footprint Calculator

This repository contains a small application that calculates and compares the carbon footprints of different objects, such as buildings, cars, and bicycles. The project is designed to demonstrate the implementation of an interface and polymorphism in object-oriented programming.

## Background

With growing concerns about carbon footprints and their contribution to global warming, governments and companies worldwide are striving to find ways to reduce greenhouse gas emissions. This project aims to showcase the calculation of carbon footprints for various objects and highlight their impact on the environment.

## Classes and Interface

The application includes three classes: `Building`, `Car`, and `Bicycle`. These classes are unrelated in terms of inheritance but share a common interface, `CarbonFootprint`. Each class has unique attributes and behaviors that differentiate it from the others.

The `CarbonFootprint` interface provides a `getCarbonFootprint` method, which calculates the appropriate carbon footprint for an object. The implementation of this method varies for each class, considering their specific characteristics. Various websites and resources can be consulted to understand the calculations involved in determining carbon footprints.

## Application Usage

The application creates objects of each class and stores references to these objects in an `ArrayList<CarbonFootprint>`. It then iterates through the list, invoking the `getCarbonFootprint` method for each object using polymorphism. The program outputs identifying information along with the carbon footprint for each object.

## Getting Started

To run the application locally, follow these steps:

1. Clone this repository to your local machine.
2. Compile the source code using your preferred Java compiler.
3. Execute the compiled application.
4. View the printed output to see the calculated carbon footprints.

## Contribution

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## Resources

Here are some recommended resources to learn more about carbon footprints and their calculation:

- [EPA Carbon Footprint Calculator](https://www.epa.gov/energy/greenhouse-gas-equivalencies-calculator)
- [Carbon Footprint Guide](https://www.carbonfootprint.com/)
- [United Nations Climate Change - Carbon Footprint](https://unfccc.int/topics/mitigation/workstreams/carbon-footprint)
