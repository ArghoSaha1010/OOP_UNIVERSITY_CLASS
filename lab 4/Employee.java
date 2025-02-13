public class Employee {
    int id = 570;
    String name = "Argho saha";

    public void display() {
        System.out.println(this.id);
        System.out.println(this.name);
    }

    class HR extends Employee {
        protected double salary = 10000.00;

        public void display() {
            System.out.println(this.salary);
        }

        public void manage_employee() {
            System.out.println("The Employee is a star Employee");
        }
    }

    class Soft_eng extends Employee {
        protected double salary = 20000.00;

        public void display() {
            System.out.println(this.salary);
        }

        public void Dev_code() {
            System.out.println("The Employee corrects the code");
        }
    }

    public static void main(String[] args) {

        Employee emp = new Employee();

        Employee.HR hr = emp.new HR();
        Employee.Soft_eng softEng = emp.new Soft_eng();

        hr.display();
        softEng.display();

        hr.manage_employee();
        softEng.Dev_code();
    }
}
