import java.util.Scanner;

public class StudentInfoInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("Name: ");
        name = scanner.nextLine();

        String address;
        System.out.println("Address: ");
        address = scanner.nextLine();

        String birthday;
        System.out.println("Birthday: ");
        birthday = scanner.nextLine();

        int age;
        System.out.println("Age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        String contactNumber;
        System.out.println("Contact No.: ");
        contactNumber = scanner.nextLine();

        String emailAddress;
        System.out.println("Email Address: ");
        emailAddress = scanner.nextLine();

        String course;
        System.out.println("Course: ");
        course = scanner.nextLine();

        String section;
        System.out.println("Section: ");
        section = scanner.nextLine();

        String schoolName;
        System.out.println("Name of School: ");
        schoolName = scanner.nextLine();

        String schoolAddress;
        System.out.println("School Address: ");
        schoolAddress = scanner.nextLine();
    }
}
