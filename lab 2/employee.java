import java.util.Scanner;

public class employee {
    String name;
    int age;
    double salary;
    public static void main(String[] args)
    {
      employee num = new employee();
      Scanner scanner = new Scanner(System.in);
      num.name = scanner.nextLine();
      num.age = scanner.nextInt();
      num.salary = scanner.nextDouble();
      System.out.println("Name: "+ num.name);
      System.out.println("age: "+ num.age);
      System.out.println("salary: "+ num.salary);
    }
  }
