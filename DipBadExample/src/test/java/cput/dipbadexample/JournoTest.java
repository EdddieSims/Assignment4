package cput.dipbadexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class JournoTest
{
    Journalist journo;
    Editor editor;

    @Before
    public void setUp() throws Exception
    {
        editor = new Editor();
        journo = new Journalist();
    }

    @Test
    public void testJourno() throws Exception
    {
        Assert.assertEquals("Story being written", journo.writeStory());
    }
}
