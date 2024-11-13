package PR1.tut6;

public class Car {
    //attributes
    double efficiency; //liters/km
    double gas; //liters

    //constructor
    public Car (double e){
        this.efficiency = e;
        gas = 0;
    }

    //methods
    public void addGas (double g) {
        gas += g;
    }
    public void drive (double km) {
        double GasUsed = km; //efficiency
        if (GasUsed <= gas) {
            gas -= GasUsed;
            System.out.println("Car drove for " + km + " km and used" + GasUsed + " liters of gas");
        } else {
            km = gas + efficiency;
            System.out.println("Car drove for " + km + " km and used up all " + gas + " liters of gas");
            gas = 0; // out of gas
        }
    }

    public double getGasInTank() {
        return gas;
    }
}
