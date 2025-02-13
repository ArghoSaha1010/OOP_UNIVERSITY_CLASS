public class Person {
    private String name;
    private int age;


    public int getage()
    {
        return age;
    }
    public void setage(int age)
    {
        this.age = age;
    }


    public String getname()
    {
        return name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }

    public static void main (String[] args)
    {
        Person in = new Person();
        in.setage(56);
        System.out.println(in.getage());

    }
}
