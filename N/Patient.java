package N;
public class Patient {
    public String name;
    public int age;
    public String bloodGroup;
    public int id=-1;

    public Patient(String n, int a, String bg)
    {
        name=n;
        age=a;
        bloodGroup=bg;
    }
    public String toString()
    {

        return "name: " + name +
                "\nage: " + age +
                "\nBloodGroup: " + bloodGroup;
    }
}
