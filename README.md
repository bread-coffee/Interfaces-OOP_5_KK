# Java Interfaces Practice Repository

This repository is used to practice concepts related to Java Interfaces. Below is the file structure and a brief explanation of the files and their relationships.

## File Structure

- **Interfaces**
    - **Brake**: Interface representing the brake functionality.
    - **Engine**: Interface representing the engine functionality.
    - **Media**: Interface representing the media functionality.

- **Classes**
    - **Car**: A general class that implements both `Engine` and `Brake` interfaces.
    - **CDPlayer**: A class that implements the `Media` interface.
    - **ElectricEngine**: A class that implements the `Engine` interface.
    - **PowerEngine**: A class that implements the `Engine` interface.
    - **NiceCar**: A class that utilizes the methods of `Engine` and `Media` to function. It also includes a feature to change the engine type from `PowerEngine` to `ElectricEngine`.

## NiceCar Class

The `NiceCar` class is designed to demonstrate the use of interfaces and their implementation in a practical example. Here is a detailed description of the `NiceCar` class:

```java
public class NiceCar {
        private Engine engine;
        private Media player = new CDPlayer();

        public NiceCar() {
                engine = new PowerEngine();
        }

        public NiceCar(Engine engine) {
                this.engine = engine;
        }

        public void start() {
                engine.start();
        }

        public void stop() {
                engine.stop();
        }

        public void startMusic() {
                player.start();
        }

        public void stopMusic() {
                player.stop();
        }

        public void upgradeEngine() {
                this.engine = new ElectricEngine();
        }
}
```

### Description

- **Attributes**:
    - `engine`: An instance of the `Engine` interface, initially set to `PowerEngine`.
    - `player`: An instance of the `Media` interface, specifically a `CDPlayer`.

- **Constructors**:
    - `NiceCar()`: Default constructor that initializes the engine to `PowerEngine`.
    - `NiceCar(Engine engine)`: Constructor that allows setting a custom engine.

- **Methods**:
    - `start()`: Starts the engine.
    - `stop()`: Stops the engine.
    - `startMusic()`: Starts the media player.
    - `stopMusic()`: Stops the media player.
    - `upgradeEngine()`: Upgrades the engine to `ElectricEngine`.

This class demonstrates how to use interfaces to define functionalities and how to implement these functionalities in different classes. It also shows how to switch implementations at runtime, providing flexibility and extensibility in the code.


## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

Make sure you have the following installed on your local machine:
- Java Development Kit (JDK)
- An IDE or text editor of your choice (e.g., IntelliJ IDEA, Eclipse, VSCode)

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/java-interfaces-practice.git
    ```
2. Navigate to the project directory:
    ```sh
    cd java-interfaces-practice
    ```
3. Open the project in your preferred IDE.

## Usage

To run the project, follow these steps:

1. Compile the Java files:
    ```sh
    javac -d bin src/*.java
    ```
2. Run the main class:
    ```sh
    java -cp bin MainClass
    ```

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

Project Link: [https://github.com/your-username/java-interfaces-practice](https://github.com/your-username/java-interfaces-practice)