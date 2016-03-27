package cput.adpbadexample;

/**
 * Created by Edmund on 2016/03/25.
 */
public class Publisher
{
    String name;
    Writter writter;

    public Publisher(String name, Writter writter) {
        this.name = name;
        this.writter = writter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
