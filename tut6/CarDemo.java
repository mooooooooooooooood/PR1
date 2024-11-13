package PR1.tut6;

public class CarDemo {
    public static void main (String[] arg) {
        Car myHybrid = new Car(50); // efficiency of 50 km per liter
        myHybrid.addGas(50); // Tank 20 liters
        myHybrid.drive(10); // Drive 10 km
        double gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank
        System.out.println(gasLeft);

        Car myHybrid1 = new Car(50); // efficiency of 50 miles per gallon
        myHybrid1.addGas(20); // Tank 20 gallons
        myHybrid1.drive(100); // Drive 100 miles
        double gasLeft1 = myHybrid1.getGasInTank(); // Get gas remaining in tank
        System.out.println(gasLeft1);
    }
}
