package cput.ocpbadexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class VehicleTest
{
    Vehicle vehicle;
    DetermineVehicleType vType;

    @Before
    public void setUp() throws Exception
    {
        vehicle = new Vehicle();
        vehicle.setPassengers(4);

        vType = new DetermineVehicleType();
        vType.vehicleType(vehicle);
    }

    @Test
    public void testCar() throws Exception
    {
        Assert.assertEquals("This is a car", vType.vehicleType(vehicle));
    }
}
