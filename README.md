# Employee Management

This Java program, named EmployeeManagement, demonstrates the use of the `Employee` class to manage information about employees. The program creates instances of the `Employee` class, compares them based on net salary, and displays the sorted list of employees.

## How it Works

### Employee Class

The `Employee` class represents an employee and implements the `Comparable` interface. It includes properties such as ID, name, salary, and the number of dependents. The class provides methods to calculate net salary, compare employees based on net salary, check equality, and generate a string representation.

### Main Class

The `Main` class serves as the main program. It creates instances of the `Employee` class, checks for equality between two employees based on net salary, adds employees to an ArrayList, sorts the list, and prints the sorted list.

## Classes and Methods

### Employee Class

- `public double getNetSalary()`: Calculates and returns the net salary of the employee.
- `public boolean equals(Object o)`: Checks if the net salary of the current employee is equal to the net salary of another employee.
- `public int compareTo(Employee o)`: Compares the net salary of the current employee with that of another employee.
- `public String toString()`: Generates a string representation of the employee.

### Main Class

- `public static void main(String[] args)`: The main method to run the program. It creates instances of the `Employee` class, checks for equality, adds employees to an ArrayList, sorts the list, and prints the sorted list.

## Usage

1. **Compile the Program:**
   - Open a terminal and navigate to the directory containing the program files.
   - Compile the program using the following command:
     ```bash
     javac Main.java
     ```

2. **Run the Program:**
   - After compilation, run the program with the following command:
     ```bash
     java Main
     ```

3. **View Output:**
   - The program will display the result of equality comparison and the sorted list of employees based on net salary.

## Example

```bash
javac Main.java
java Main
