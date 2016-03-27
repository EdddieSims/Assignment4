package cput.dipbadexample;

/**
 * Created by Edmund on 2016/03/23.
 */
public class Editor
{
    Journalist journo;

    public void setJourno(Journalist j)
    {
        journo = j;
    }
    public void edit()
    {
        journo.writeStory();
    }
}
