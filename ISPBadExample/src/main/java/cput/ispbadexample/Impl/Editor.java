package cput.ispbadexample.Impl;

import cput.ispbadexample.JournalistInterface;

/**
 * Created by Edmund.Simons on 2016/03/24.
 */
public class Editor
{
    JournalistInterface journo;

    public void setJournalist(JournalistInterface j)
    {
        journo = j;
    }

    public void edit()
    {
        journo.writeArticle();
    }
}
