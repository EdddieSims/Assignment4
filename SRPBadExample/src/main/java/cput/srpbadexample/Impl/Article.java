package cput.srpbadexample.Impl;

import cput.srpbadexample.ArticleInterface;

/**
 * Created by Edmund on 2016/03/25.
 */
public class Article implements ArticleInterface
{
    String byLine;
    String article;
    String author;

    public void setByLine(String byLine)
    {
        this.byLine = byLine;
    }

    public void setArticle(String article)
    {
        this.article = article;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getByLine() {
        return byLine;
    }

    public String getArticle() {
        return article;
    }

    public String getAuthor() {
        return author;
    }
}
