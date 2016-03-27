package cput.adpgoodexample;

/**
 * Created by Edmund on 2016/03/25.
 */
public class Publisher
{
    String name;
    PrintingPlant plant;

    public Publisher(String name, PrintingPlant plant) {
        this.name = name;
        this.plant = plant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
