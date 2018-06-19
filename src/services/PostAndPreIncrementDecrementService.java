package services;

class A
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;
        System.out.println("x");
    }
 
    {
        i = i++ + ++i;
        System.out.println("y");
    }
}

class B extends A
{
    static
    {
        i = --i - i--;
        System.out.println("a");
    }
 
    {
        i = ++i + i++;
        System.out.println("b");
    }
}
 
public class PostAndPreIncrementDecrementService
{
    public static void main(String[] args)
    {
        B b = new B();
 
        System.out.println(b.i);
    }
}