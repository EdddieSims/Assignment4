package cput.plkbadexample;

/**
 * Created by Edmund.Simons on 2016/03/24.
 */
public class PersonA
{
    String myName = "Charles";
    String mySurname = "Xavier";

    String bName;
    String bSurname;

    public void getPersonB(PersonB b)
    {
        this.bName = b.getName();
        this.bSurname = b.getSurname();
    }

    public void createPersonBClone(PersonB p)
    {
        p.makePerson(this.bName, this.bSurname, 46);
    }
}
