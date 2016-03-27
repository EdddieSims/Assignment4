package cput.plkbadexample;

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

    String name;
    String surname;

    @Before
    public void setUp() throws Exception
    {
        personA = new PersonA();
        personB = new PersonB();

        personA.getPersonB(personB);
        personA.createPersonBClone(personB);
    }

    @Test
    public void testPerson() throws Exception
    {
        personC = new PersonC(personB.getName(), personB.getSurname(), 46);

        Assert.assertEquals(46, personC.getAge());
    }
}
