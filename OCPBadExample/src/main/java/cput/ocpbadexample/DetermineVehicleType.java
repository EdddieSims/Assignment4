package cput.ocpbadexample;

/**
 * Created by Edmund.Simons on 2016/03/24.
 */
public class DetermineVehicleType
{
    public String vehicleType(Vehicle v)
    {
        if(v.getPassengers() == 4)
        {
            vehicleCar();
        }
        else if(v.getPassengers() == 46)
        {
            vehicleBus();
        }
        return "This is a car";
    }

    public String vehicleCar()
    {
        return "This is a car";
    }
    public String vehicleBus()
    {
        return "This is a bus";
    }
}
