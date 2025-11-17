# Zoo Management System

## About
A comprehensive Java application for managing zoo operations, developed through progressive "prosit" exercises at Esprit.

## Description
This project is a learning-based system designed to practice Java programming concepts by simulating real-world zoo management operations. Each prosit (exercise) builds upon the previous one, progressively adding features and complexity.

## Features
- Animal management (add, update, remove animals)
- Zoo information tracking
- Cage/enclosure management
- Animal categorization and details
- Employee management (zookeepers, veterinarians)
- Food and feeding schedules

## Technologies Used
- Java
- Object-Oriented Programming (OOP)

## Project Structure
- Animal classes and hierarchy
- Zoo management classes
- Employee classes
- Utility classes
- Main application

## Prosits Completed

### Prosit 1: Project Setup & Basic Input
- Created `ZooManagement` class with basic attributes
- Implemented user input using Scanner
- Input validation for zoo name and number of cages

### Prosit 2: Object-Oriented Foundation
- Created `Animal` and `Zoo` classes
- Implemented parameterized constructors
- Added `displayZoo()` method
- Overrode `toString()` method for proper object display

### Prosit 3: Core Zoo Operations
- Implemented `addAnimal()` method with duplicate prevention
- Created `searchAnimal()` method for finding animals by name
- Added `removeAnimal()` functionality
- Made `nbrCages` a constant (max 25 animals)
- Implemented `isZooFull()` validation
- Created `comparerZoo()` to compare two zoos

### Prosit 4: Encapsulation & Organization
- Applied encapsulation (private attributes with getters/setters)
- Added validation (no negative age, non-empty zoo name)
- Organized code into packages: `tn.esprit.gestionzoo.main` and `tn.esprit.gestionzoo.entities`

### Prosit 5: Inheritance - Animal Types
- Created animal hierarchy: `Aquatic` and `Terrestrial` classes
- Implemented `Dolphin` (swimming speed) and `Penguin` (swimming depth) subclasses
- Added parameterized constructors with inheritance
- Overrode `toString()` in subclasses
- Implemented `swim()` method with polymorphism

### Prosit 6: Advanced Aquatic Management
- Added `aquaticAnimals` array in Zoo class
- Implemented `addAquaticAnimal()` method
- Created `maxPenguinSwimmingDepth()` to find deepest diver
- Added `displayNumberOfAquaticsByType()` for statistics
- Overrode `equals()` method for Aquatic animals
- Made `swim()` abstract for mandatory implementation

### Prosit 7: Exception Handling
- Created custom exception `ZooFullException`
- Modified `addAnimal()` to throw exceptions instead of returning boolean
- Implemented `InvalidAgeException` for age validation
- Added proper try-catch blocks in main method

### Prosit 8: Interfaces & Generics
- Created generic interfaces: `Carnivore<T>`, `Herbivore<T>`, and `Omnivore<T>`
- Implemented `Food` enum (MEAT, PLANT, BOTH)
- Applied `Carnivore` interface to `Aquatic` class
- Applied `Omnivore` interface to `Terrestrial` class
- Tested dietary methods with different animal types

## Learning Objectives
- Object-Oriented Programming principles
- Java collections and data structures
- Class inheritance and polymorphism
- Exception handling

## Notes
This is a class project developed at Esprit as part of the Java programming curriculum.

## Contributing
Contributions, issues, and feature requests are welcome! Feel free to check the issues page or submit a pull request.

## Author
**Rym Ben Hmida**
- GitHub: "https://github.com/tirtir45"
- LinkedIn: "https://www.linkedin.com/in/rym-ben-hmida-9a41a730a"

---
*Developed at Esprit - Learning through Prosits* 🎓
