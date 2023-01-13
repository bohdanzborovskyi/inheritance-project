import java.util.List;

public class Person
{
    int age;
    String name;
    List<String> filmTitles;
    boolean player;
    boolean flyer;
    boolean patriot;
    String birthPlace;


    Person()
    {
        System.out.println("person constructor");
    }

    protected void personmethod()
    {
        System.out.println("Person method");
    }

    protected void justAMethod(){
        System.out.println("Hello with new method!");
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
