/*
Create a class Solution. It will be given two integers x and y as input, you have to
compute x/y. If x and y are not 32 bit signed integers or if y is zero, an exception
will occur and you have to report it.

Aim: Practical No.7_a   Author: Ishant Morghade
Version: 7.3          Date: 19 March,2024
*/

public class Solution 
{
    public static void main(String[] args) 
    {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            
            if (!isWithinRange(x) || !isWithinRange(y)) 
            {
                throw new ArithmeticException("Input integers must be within the range of 32-bit signed integers.");
            }
            
            System.out.println(divide(x, y));
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid input: Please enter valid integers.");
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    public static boolean isWithinRange(int num) 
    {
        return num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE;
    }
    
    public static int divide(int x, int y) throws ArithmeticException 
    {
        if (y == 0) 
        {
            throw new ArithmeticException("Division by zero.");
        }
        return x / y;
    }
}
