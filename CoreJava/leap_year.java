import java.util.*;
public class leap_year
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int a = sc.nextInt();
        if(a%100==0 && a%4==0)
        {
            System.out.println(a+" is a leap year.");
        }
        else{
            System.out.println(a+" is not a leap year.");
        }
    }
}