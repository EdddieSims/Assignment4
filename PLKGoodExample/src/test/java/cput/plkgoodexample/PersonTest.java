package cput.plkgoodexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class PersonTest
{
    PersonA personA;
    PersonB personB;
    PersonC personC;
    @Before
    public void setUp() throws Exception
    {
        personA = new PersonA();
        personB = new PersonB();
        personC = new PersonC("Charles", "Xavier", 46);

        personA.getPersonB(personB);
        personA.createPersonBClone();
    }

    @Test
    public void testPerson() throws Exception
    {
        Assert.assertEquals(46, personC.getAge());
    }
}
