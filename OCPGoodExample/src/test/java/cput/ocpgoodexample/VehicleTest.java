package cput.ocpgoodexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class VehicleTest
{
    DetermineVehicleType vType;
    Car car;

    @Before
    public void setUp() throws Exception
    {
        vType = new DetermineVehicleType();
        car = new Car();
    }

    @Test
    public void testCar() throws Exception
    {
        Assert.assertEquals("This is a car", vType.vehicleType(car));
    }
}
