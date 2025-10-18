/* Odette Sandrine Bakam Nguenouho
Student Number: 301537373
EXERCISE2
LAB3
 */



package Exercise2;

class FullTimeGameTester extends GameTester {
    public FullTimeGameTester(String name)
    {
        super(name, true);
    }


    // getSalary method implemented
    @Override
    public double getSalary()
    {
        return 3000;
    }

}
