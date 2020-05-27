package Polymorphism;
class Hound
{
   public void bark()
    {
        System.out.println("woof");
    }
    public void sniff1()
    {
        System.out.println("Sniff1");
    }
}
class Dog extends Hound
{
     public void bark()
    {
        System.out.println("Bow"); 
    }
     public void sniff2()
     {   super.bark();
         System.out.println("Sniff2");
     }
}
public class MethodOverwrite
{
    public static void main(String[] args)  
    {
       Dog ob=new Dog();
       ob.bark();
        ob.sniff1();
        ob.sniff2();
    }
}
