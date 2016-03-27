package cput.plkbadexample;

/**
 * Created by Edmund.Simons on 2016/03/24.
 */
public class PersonB
{
    String name = "Marilyn";
    String surname = "Monroe";

    PersonC c;

    public void makePerson(String name, String surname, int age)
    {
        c = new PersonC(name, surname, age);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
}
