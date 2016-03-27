package cput.plkgoodexample;

/**
 * Created by Edmund.Simons on 2016/03/24.
 */
public class PersonA
{
    String myName = "Charles";
    String mySurname = "Xavier";

    PersonC c;

    String bName;
    String bSurname;

    public void getPersonB(PersonB b)
    {
        bName = b.getName();
        bSurname = b.getSurname();
    }

    public void createPersonBClone()
    {
        c = new PersonC(bName, bSurname, 46);
    }
}
