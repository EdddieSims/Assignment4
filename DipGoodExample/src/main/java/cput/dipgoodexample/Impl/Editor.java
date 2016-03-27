package cput.dipgoodexample.Impl;

import cput.dipgoodexample.Journalist;

/**
 * Created by Edmund on 2016/03/23.
 */
public class Editor
{
    Journalist journalist;

    public void setJourno(Journalist j)
    {
        journalist = j;
    }
    public void edit()
    {
        journalist.writeStory();
    }
}
