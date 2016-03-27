package cput.adpgoodexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class BookTest
{
    Writter writter;
    Publisher publisher;
    PrintingPlant printingPlant;
    Book book;

    @Before
    public void setUp() throws Exception
    {
        book = new Book(writter, "This is the book intro", 563, publisher);
        writter = new Writter("Dillon", "Davids", "Chasing Shadows");
        publisher = new Publisher("Creative Writtings", printingPlant);
        printingPlant = new PrintingPlant("Paarl Media", "Paarl", 29.99);
    }

    @Test
    public void testBook() throws Exception
    {
        Assert.assertEquals("Chasing Shadows", writter.getBookName());
    }
}
