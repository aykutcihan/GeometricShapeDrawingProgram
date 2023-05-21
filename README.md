# GeometricShapeDrawing

This is a simple Java application that demonstrates the use of the Factory Method Design Pattern. The program asks the user for the type of geometric shape they wish to draw (circle, square, or rectangle) and draws the shape accordingly.
## How to Run

1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA.
3. Run the `main` method in the `FactoryPatternDemo` class.

## Project Structure

Shape: This is an interface that all geometric shapes must implement. It defines the draw() method.

Circle, Square, Rectangle: These classes represent different geometric shapes. Each class implements the Shape interface and provides its own implementation of the draw() method.

ShapeFactory: This is the factory class that creates instances of the geometric shape classes based on the user's input.

FactoryPatternDemo: This class contains the main method and is the entry point for the application.
## Contribution

Contributions are welcome! Please fork the repository and create a pull request with your changes, or open an issue to discuss what you would like to change.


## License

