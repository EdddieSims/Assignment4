package cput.dipgoodexample;

import cput.dipgoodexample.Impl.Journo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class JournoTest
{
    Journo journo;

    @Before
    public void setUp() throws Exception
    {
        journo = new Journo();
    }

    @Test
    public void testJourno() throws Exception
    {
        Assert.assertEquals("Story being written", journo.writeStory());
    }
}
