package cput.adpgoodexample;

/**
 * Created by Edmund on 2016/03/25.
 */
public class PrintingPlant
{
    String name;
    String address;
    double costPerUnit;

    public PrintingPlant(String name, String address, double costPerUnit) {
        this.name = name;
        this.address = address;
        this.costPerUnit = costPerUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }
}
