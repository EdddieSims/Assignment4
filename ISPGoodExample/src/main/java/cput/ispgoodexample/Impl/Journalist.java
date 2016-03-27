package cput.ispgoodexample.Impl;

import cput.ispgoodexample.Interviewing;
import cput.ispgoodexample.Writing;

/**
 * Created by Edmund.Simons on 2016/03/24.
 */
public class Journalist implements Writing, Interviewing
{
    public String interviewSource()
    {
        System.out.println("Retrieve information");
        return "Retrieve information";
    }

    public void writeStory()
    {
        System.out.println("Write Article");
    }
}
