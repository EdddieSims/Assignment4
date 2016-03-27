package cput.srpgoodexample;

import cput.srpgoodexample.Impl.Article;
import cput.srpgoodexample.Impl.Content;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Edmund on 2016/03/27.
 */
public class ArticleTest
{
    Article article;
    Content content;

    @Before
    public void setUp() throws Exception
    {
        article = new Article();
        content = new Content();

        article.setArticle(content);
    }

    @Test
    public void testArticle() throws Exception
    {
        Assert.assertEquals("This is the article", article.getArticle());
    }
}
