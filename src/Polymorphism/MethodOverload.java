package Polymorphism;
class Bike
{   String s="Self";
    public void start()
    {
        System.out.println(s+" start...");
    }
    public void start(String str)
    { s=str;
      System.out.println(s+" start...");
        
    }
}
public class MethodOverload
{
    public static void main(String[] args)
    { Bike ob=new Bike();
      ob.start();
      ob.start("Kick");
        
    }
   
}
