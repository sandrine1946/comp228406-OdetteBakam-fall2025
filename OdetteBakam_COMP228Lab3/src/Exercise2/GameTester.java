/* Odette Sandrine Bakam Nguenouho
Student Number: 301537373
EXERCISE2
LAB3
 */

package Exercise2;

abstract class GameTester {
    private final String name;
    private final boolean isFullTime;

    public GameTester(String name, boolean isFullTime) {
        this.name = name;
        this.isFullTime = isFullTime;
    }

    abstract double getSalary();
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Status: " + (isFullTime ? "Full-Time" : "Part-Time"));
        System.out.println("Salary: $" + getSalary());
        System.out.println("-------------------------");
    }
}
