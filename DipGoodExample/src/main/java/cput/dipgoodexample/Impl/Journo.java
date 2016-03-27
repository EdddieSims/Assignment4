package cput.dipgoodexample.Impl;

import cput.dipgoodexample.Journalist;

/**
 * Created by Edmund on 2016/03/23.
 */
public class Journo implements Journalist
{
    @Override
    public String writeStory()
    {
        System.out.println("Story being written");
        return "Story being written";
    }
}
