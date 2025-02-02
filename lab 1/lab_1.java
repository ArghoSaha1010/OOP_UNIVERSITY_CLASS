public class lab_1{
    public static void main(String[] args) 
    {
        int a=14;
        int b=7;
        System.out.println("Summation = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Multiplication = "+(a*b));
        System.out.println("Division = "+(a/b));

        //array sum and average

        int[] arr={10,15,20,25,30};
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        System.out.println("Summation of array= "+sum);
        System.out.println("Average of array = "+sum/arr.length);

        //find even number

        int evensum=0;
        int oddsum=0;
        for(int i:arr)
        {
            if(i%2==0)
            {
                evensum+=i;
                System.out.println(i+" is even number ");
            }
            else{
                oddsum+=i;
                System.out.println(i+" is odd number ");
            }
        }
        System.out.println("Even sum = "+evensum);
        System.out.println("Odd sum = "+oddsum);

        ///multiplication table of 12
        System.out.println("Multiple of 12");
        for(int i=12;i<=120;i+=12)
        {
            System.out.println(i);
        }
        //find prime
        int num=13;
        int check=1;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" Not a prime number");
                check=0;
                break;
            }
            
        }  
        if(check==1)System.out.println(num+" is prime number ");

    }
}