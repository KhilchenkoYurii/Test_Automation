public class Main
{
    public static void main(String avg[])
    {
        Student student1 = new Student("Yurii Khilchenko",4);
        Student student2 = new Student( "Iatskiv Andryi",3);
        Student student3 = new Student("Kyziv Yaroslav",3);

        float avgrating = (student1.getRating()+student2.getRating()+student3.getRating())/3;
        System.out.println("Average rating: "+avgrating);
        student2.ChangeRating(5);
        avgrating = (student1.getRating()+student2.getRating()+student3.getRating())/3;
        System.out.println("Average rating: "+avgrating);

    }
}
