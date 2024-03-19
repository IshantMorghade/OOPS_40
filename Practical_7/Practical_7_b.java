/* Create a method named validate() that accepts an integer as a parameter. 
If the age is less than 18, we are throwing the ArithmeticException otherwise 
print a message welcome to vote. 

Aim: Practical No.7_b   Author: Ishant Morghade
Version: 7.3          Date: 19 March,2024
*/
public class Practical_7_b
{
    public static void main(String[] args) 
    {
        int age = Integer.parseInt(args[0]);

        try
        {
            validate(age);
            System.out.println("Eligible for Voting");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void validate(int age) throws ArithmeticException
    {
        if(age < 18)
        {
            throw new ArithmeticException("Not Eligible for Voting");
        }
    }
}