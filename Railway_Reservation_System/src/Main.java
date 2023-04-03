import java.util.Scanner;
//https://www.geeksforgeeks.org/zoho-interview-experience-set-35-campus/
class Passengers
{
    String Name;
    int Age;
    char Gender;
    String BerthPreference;

    static int lower_berth=0,middle_berth=0,upper_berth=0;
    static int row=0,col=0;
    int confirmed_tickets[][]=new int[21][3];
    int RAC[]=new int[18];

    int waiting_list[]=new int[10];
    Passengers(String Name, int Age, char Gender,String BerthPreference)
    {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.BerthPreference = BerthPreference;
    }
}
public class Main {

    public void Book_Ticket(Passengers p)
    {
        if(p.Age>60)
        {
            if(Passengers.lower_berth<21)
            {
                int itr1=0,itr2=0;
                while()
                if(p.confirmed_tickets[Passengers.row][0]!=1 && Passengers.row<21)
                {
                    p.confirmed_tickets[Passengers.row][0] = 1;
                    if(Passengers.col>=3)
                    {
                        Passengers.row++;
                    }
                    else
                    {
                        Passengers.col++;
                    }
                }
                Passengers.lower_berth++;
            }
            else
            {

            }
         }
    }
    public void Cancel_Ticket()
    {

    }

    public void Print_Booked_Tickets()
    {

    }
    public void Print_Available_Tickets()
    {

    }
    public static void main(String[] args) {
        System.out.println("-----------Railway Reservation System---------------");
        int option;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("             Enter the Option\n1.Book\n2.Cancel\n3.Print Booked Tickets\n4.Print Available Tickets\n5.Exit");
            option=sc.nextInt();
            if(option == 5)
            {
                System.out.println("---------Thank you--------\n        visit Again         ");
                break;
            }
            else if(option == 1)
            {
                int total;
                String Name;
                char gender;
                String berthpreference="";
                int age;
                System.out.println(" Enter the total no of members ");
                total=sc.nextInt();
                while(total>0)
                {
                    System.out.println(" Enter the Name");
                    Name=sc.nextLine();
                    System.out.println(" Enter the Gender");
                    gender=sc.next().charAt(0);
                    System.out.println(" Enter the Age");
                    age=sc.nextInt();
                    System.out.println(" Enter the Berth Preference ");
                    berthpreference=sc.next().toLowerCase();
                    total--;
                    Passengers p=new Passengers(Name,age,gender,berthpreference);
                    if(age>=5)
                    {
                        Main m = new Main();
                        m.Book_Ticket(p);
                    }
                }
            }
        }while(true);

    }
}