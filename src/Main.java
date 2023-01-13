import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Actor person = new Actor();
        person.setAge(12);
        person.setNumberOfFilms(2);
        Person person1 = new Actor();
        person1.setAge(22);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        Actor actor = new Actor();
        actor.setAge(33);
        actor.setNumberOfFilms(22);
        persons.add(actor);
        persons.add(person);
        actor.setYear(2002);
        sortedPerson(persons).forEach(System.out::println);
    }

    public static List<Person> sortedPerson(List<Person> persons) {
        return persons.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
    }
}
