package cput.srpbadexample;

import cput.srpbadexample.Impl.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class ArticleTest
{
    Article article;
    @Before
    public void setUp() throws Exception
    {
        article = new Article();
        article.setByLine("Accident on N2");
    }

    @Test
    public void testArticle() throws Exception
    {
        Assert.assertEquals("Accident on N2", article.getByLine());
    }
}
