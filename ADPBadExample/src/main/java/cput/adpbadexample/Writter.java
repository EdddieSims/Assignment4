package cput.adpbadexample;

/**
 * Created by Edmund on 2016/03/25.
 */
public class Writter
{
    String name;
    String surname;
    String bookName;

    Publisher publisher;

    public Writter(String name, String surname, String bookName, Publisher publisher) {
        this.name = name;
        this.surname = surname;
        this.bookName = bookName;
        this.publisher = publisher;
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBookName() {
        return bookName;
    }
}
