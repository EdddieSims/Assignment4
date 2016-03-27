package cput.ispgoodexample.Impl;

import cput.ispgoodexample.Writing;

/**
 * Created by Edmund.Simons on 2016/03/24.
 */
public class Editor
{
    Writing write;

    public void setWrite(Writing w)
    {
        write = w;
    }

    public void edit()
    {
        write.writeStory();
    }
}
