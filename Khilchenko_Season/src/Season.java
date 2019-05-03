import java.io.Reader;
import java.util.Scanner;

public class Season
{
    public enum Seasons
    {
        Winter,
        Spring,
        Summer,
        Autumn;
    }
    public static void WhatIsSeason(String mounth)
    {
        Seasons season = null;
        boolean check = true;
        switch(mounth)
        {
            case "December":
            case "January" :
            case "February":
                season = Seasons.Winter;
                break;
            case "March":
            case "April":
            case "May":
                season = Seasons.Spring;
                break;
            case "June":
            case "Jule":
            case "August":
                season = Seasons.Summer;
                break;
            case "September":
            case "October":
            case "November":
                season = Seasons.Autumn;
                break;
            default:
                check = false;
                System.out.println("This is not mounth");
        }
        if(check)
            System.out.println("This is "+season);
    }
    public static void main(String args[])
    {
        String m;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Input mounth: ");
            m = sc.nextLine();
            WhatIsSeason(m);
        }

    }
}

