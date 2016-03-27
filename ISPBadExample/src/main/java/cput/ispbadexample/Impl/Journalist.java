package cput.ispbadexample.Impl;

import cput.ispbadexample.JournalistInterface;

/**
 * Created by Edmund.Simons on 2016/03/24.
 */
public class Journalist implements JournalistInterface
{
    public void writeArticle()
    {
        System.out.println("Write Article");
    }

    public String interviewSource()
    {
        System.out.println("Retrieve information");
        return "Retrieve information";
    }
}
