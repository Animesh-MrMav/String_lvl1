package String_lvl1;
import java.util.*; // gender
import java.lang.*;
public class String12
{  String name;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the name:");
    name=ob.nextLine();   
  }
  void gender()
  {   int c;
      String gen,sal;
      c=name.indexOf(" ");
      sal=name.substring(0, c);
      if(sal.compareTo("Mr")==0)
          gen="Male";
      else if(sal.compareTo("Mrs")==0)
          gen=" Married Female";
      else if(sal.compareTo("Miss")==0)
          gen="Female";
      else if (sal.compareTo("Kumari")==0)
          gen="Female";
      else
          gen="Cannot determine";
      System.out.println("Gender:"+gen);
          
  }
   public static void main(String[] args) {
        String12 obj=new String12();
        obj.input();
        obj.gender();
    }
    
}
