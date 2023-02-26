public class Actor extends Person
{
    Actor()
    {
        System.out.println("Actor constructor");
    }
    public void personmethod()
    {
        super.personmethod();
        System.out.println("actor methid rebase");
    }

    int numberOfFilms;
    int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

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
