import java.util.Scanner;

public class emp
{
    String name;
    static int age;
    double salary;
    final static int x = 10;

    void insert_data() 
    {
        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();

        age = scanner.nextInt();

        salary = scanner.nextDouble();
    }

    public static void age_display() 
    {
        System.out.println("Age: " + age);
        System.out.println("X: " + x);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) 
    {
        emp num = new emp();
        num.insert_data();
        num.display();
        age_display();
    }
}
