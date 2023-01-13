import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Actor person = new Actor();
        person.personmethod();
        Person person1 = new Actor();
        ArrayList<Person> actors = new ArrayList<>();
        actors.add(person1);
        Actor actor2 = new Actor();
        actors.add(actor2);
    }
}
