package cput.ispgoodexample;

import cput.ispgoodexample.Impl.Journalist;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class JournoTest
{
    Journalist journalist;

    @Before
    public void setUp() throws Exception
    {
        journalist = new Journalist();
    }

    @Test
    public void testJourno() throws Exception
    {
        Assert.assertEquals("Retrieve information", journalist.interviewSource());
    }
}
