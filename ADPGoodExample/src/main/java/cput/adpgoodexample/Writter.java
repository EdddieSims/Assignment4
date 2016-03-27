package cput.adpgoodexample;

/**
 * Created by Edmund on 2016/03/25.
 */
public class Writter
{
    String name;
    String surname;
    String bookName;
    String pubName;
    Publisher publisher;

    public Writter(String name, String surname, String bookName) {
        this.name = name;
        this.surname = surname;
        this.bookName = bookName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPubName() {
        return this.pubName = publisher.getName();
    }

    public String getBookName() {
        return this.bookName;
    }
}
