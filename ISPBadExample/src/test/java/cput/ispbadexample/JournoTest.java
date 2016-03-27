package cput.ispbadexample;

import cput.ispbadexample.Impl.Journalist;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class JournoTest
{
    Journalist journo;
    @Before
    public void setUp() throws Exception
    {
        journo = new Journalist();
    }

    @Test
    public void testJourno() throws Exception
    {
        Assert.assertEquals("Retrieve information", journo.interviewSource());
    }
}
