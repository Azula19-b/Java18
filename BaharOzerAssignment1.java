package baharozerassignment1;  // Define the package name

import java.util.Scanner;  // Import the Scanner class for user input

class BaharPet {  // Define the class BaharPet
    private String name;  // Declare a private field for the pet's name
    private String type;  // Declare a private field for the pet's type
    private String color;  // Declare a private field for the pet's color
    private int age;  // Declare a private field for the pet's age
    private float weight;  // Declare a private field for the pet's weight

    // Getter and Setter methods
    public String getName() {  // Define a public getter method for the pet's name
        return name;  // Return the value of the name field
    }

    public void setName(String name) {  // Define a public setter method for the pet's name
        this.name = name;  // Assign the provided name to the name field
    }

    public String getType() {  // Define a public getter method for the pet's type
        return type;  // Return the value of the type field
    }

    public void setType(String type) {  // Define a public setter method for the pet's type
        this.type = type;  // Assign the provided type to the type field
    }

    public String getColor() {  // Define a public getter method for the pet's color
        return color;  // Return the value of the color field
    }

    public void setColor(String color) {  // Define a public setter method for the pet's color
        this.color = color;  // Assign the provided color to the color field
    }

    public int getAge() {  // Define a public getter method for the pet's age
        return age;  // Return the value of the age field
    }

    public void setAge(int age) {  // Define a public setter method for the pet's age
        this.age = age;  // Assign the provided age to the age field
    }

    public float getWeight() {  // Define a public getter method for the pet's weight
        return weight;  // Return the value of the weight field
    }

    public void setWeight(float weight) {  // Define a public setter method for the pet's weight
        this.weight = weight;  // Assign the provided weight to the weight field
    }
}

public class BaharOzerAssignment1 {  // Define the class BaharOzerAssignment1
    public static void main(String[] args) {  // Define the main method, the entry point of the program
        BaharPet myPet = new BaharPet();  // Create a new instance of BaharPet
        Scanner scanner = new Scanner(System.in);  // Create a new Scanner object for user input

        try {  // Start a try block to handle potential input errors
            // Prompt the user for the pet's details
            System.out.print("Please enter your pet's name: ");  // Prompt for pet's name
            String name = scanner.nextLine();  // Read the pet's name
            myPet.setName(name);  // Set the pet's name

            System.out.print("Please enter your pet's type (e.g., dog, cat): ");  // Prompt for pet's type
            String type = scanner.nextLine();  // Read the pet's type
            myPet.setType(type);  // Set the pet's type

            System.out.print("Please enter your pet's color: ");  // Prompt for pet's color
            String color = scanner.nextLine();  // Read the pet's color
            myPet.setColor(color);  // Set the pet's color

            System.out.print("Please enter your pet's age (in years): ");  // Prompt for pet's age
            int age = scanner.nextInt();  // Read the pet's age
            myPet.setAge(age);  // Set the pet's age

            System.out.print("Please enter your pet's weight (in pounds): ");  // Prompt for pet's weight
            float weight = scanner.nextFloat();  // Read the pet's weight
            myPet.setWeight(weight);  // Set the pet's weight

            // Retrieve the details and display the message
            String petName = myPet.getName();  // Get the pet's name
            String petType = myPet.getType();  // Get the pet's type
            String petColor = myPet.getColor();  // Get the pet's color
            int petAge = myPet.getAge();  // Get the pet's age
            float petWeight = myPet.getWeight();  // Get the pet's weight

            // Print a message about the pet
            System.out.println("There once was a(n) " + petColor + " " + petType + " named " + petName +
                    ". In December 2023, at the age of " + petAge + ", " + petName +
                    " was " + petWeight + " pounds. " + petName +
                    " was a happy " + petType + " and had a long and happy life.");  // Print the pet's details
        } catch (Exception e) {  // Catch any exceptions that occur during input
            System.out.println("Invalid input. Please enter the correct values.");  // Print an error message
        } finally {  // The finally block is executed regardless of an exception
            scanner.close();  // Close the scanner to free up resources
        }
    }
}
