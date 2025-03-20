package courses;

public class MyCalculation extends calculation{
    //we can create method to get the multiplication of two num
    public void multiplication(int firstNum ,int secondNum)
    {
        total=firstNum*secondNum;
        System.out.println("multiplication is : "+total);
    }
    //i can't access the object of the class outside the function so we can create main function here
    public static void main(String[] args)
    {
       MyCalculation myCalc =new MyCalculation();
       myCalc.addition(6,5);
       myCalc.subtraction(6,9);
       myCalc.multiplication(9,7);

    }
}
