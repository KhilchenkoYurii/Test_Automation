public class Student
{
    private String name;
    private  int rating;

    public Student()
    {
        this.name = "Noname";
        this.rating=0;
    }
    public Student(String name, int rating)
    {
        this.name = name;
        this.rating = rating;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRating()
    {
        return rating;
    }

    public void ChangeRating(int rating)
    {
        this.rating = rating;
    }
    public boolean betterStuden(Student student)
    {
        return this.rating>student.rating;
    }
    public String toString()
    {
        return "Student: "+this.name+"\n"+"Rating: "+this.rating;
    }

}
