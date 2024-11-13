package PR1.tut7;

public class Employee {
    String employeeName;
    double currentSalary;
    public Employee(String employeeName, double currentSalary) {
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
    }

    public String getName() {
        return employeeName;
    }

    public double getSalary() {
        return currentSalary;
    }

    public void raiseSalary(double byPercent) {
        double increase = currentSalary * byPercent / 100 ;
        currentSalary = currentSalary + increase;
    }

}
