package cput.plkgoodexample;

/**
 * Created by Edmund.Simons on 2016/03/24.
 */
public class PersonC
{
    String name;
    String surname;
    int age;

    public PersonC(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }
}
