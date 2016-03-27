package cput.srpgoodexample.Impl;

import cput.srpgoodexample.ArticleInterface;
import cput.srpgoodexample.ContentInterface;

/**
 * Created by Edmund on 2016/03/25.
 */
public class Article implements ArticleInterface
{
    String byLine;
    String author;
    String article;
    public void setByLine(String byLine)
    {
        this.byLine = byLine;
    }

    public void setArticle(ContentInterface content)
    {
        this.article = content.getArticle();
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getArticle() {
        return article;
    }
}
