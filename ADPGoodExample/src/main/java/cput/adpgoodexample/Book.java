package cput.adpgoodexample;

/**
 * Created by Edmund on 2016/03/25.
 */
public class Book
{
    String intro;
    int pageCount;

    Writter writter;
    Publisher publisher;

    public Book(Writter writter, String intro, int pageCount, Publisher publisher) {
        this.writter = writter;
        this.intro = intro;
        this.pageCount = pageCount;
        this.publisher = publisher;
    }
}
