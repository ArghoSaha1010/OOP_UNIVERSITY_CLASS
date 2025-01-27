import java.util.Scanner;

public class employees {
    String name;
    int age;
    double salary;
    final int x = 10; 

    public void display()
     {
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("X: " + x);
    }

    public static void main(String[] args)
     {
        employees num = new employees();
        Scanner scanner = new Scanner(System.in);

        num.name = scanner.nextLine();
        num.age = scanner.nextInt();
        num.salary = scanner.nextDouble();
        num.display();
    }
}
