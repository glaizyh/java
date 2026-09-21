import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        System.out.println("Name: ");
        name = in.nextLine();

        String address;
        System.out.println("Address: ");
        address = in.nextLine();

        String birthday;
        System.out.println("Birthday: ");
        birthday = in.nextLine();

        int myAge;
        System.out.println("Age: ");
        myAge = in.nextInt();
        in.nextLine();

        String contactNumber;
        System.out.println("Contact No.: ");
        contactNumber = in.nextLine();

        String emailAddress;
        System.out.println("Email Address: ");
        emailAddress = in.nextLine();

        String course;
        System.out.println("Course: ");
        course = in.nextLine();

        String section;
        System.out.println("Section: ");
        section = in.nextLine();

        String school;
        System.out.println("Name of School: ");
        school = in.nextLine();

        String schoolAddress;
        System.out.println("School Address: ");
        schoolAddress = in.nextLine();
    }
}
