package cput.adpbadexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class BookTest
{
    Writter writter1;
    Writter writter2;
    Publisher publisher;
    @Before
    public void setUp() throws Exception
    {
        writter1 = new Writter("Dillon", "Davids", "Chasing Shadows", publisher);
        publisher = new Publisher("Paarl Media", writter2);
        writter2 = new Writter("Theo", "Hayes", "Going Fast", publisher);
    }

    @Test
    public void testBook() throws Exception
    {
        Assert.assertEquals("Hayes", writter2.getSurname());
    }
}
