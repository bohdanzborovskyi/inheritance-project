public class Actor extends Person
{
    Actor()
    {
        System.out.println("Actor constructor");
    }
    public void personmethod()
    {
        super.personmethod();
        System.out.println("actor methid");
    }

    int numberOfFilms;

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setNumberOfFilms(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public void printMe(){
        System.out.println("Print ME");
    }
}
