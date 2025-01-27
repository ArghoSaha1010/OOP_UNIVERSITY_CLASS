import java.util.Scanner;

public class employe
{
    String name;
    static int age;
    double salary;
    final static int x = 10; 

    public static void age_display()
    {
      System.out.println("age: " + age);
      System.out.println("X: " + x);

    }

    public void display()
    {
      System.out.println("Name: " + name);
      System.out.println("Salary: " + salary);
    }

    public static void main(String[] args)
     {
        employe num = new employe();
        Scanner scanner = new Scanner(System.in);

        num.name = scanner.nextLine();
        num.age = scanner.nextInt();
        num.salary = scanner.nextDouble();
        num.display();
        age_display();
    }
}
