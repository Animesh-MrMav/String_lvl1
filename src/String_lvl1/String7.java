package String_lvl1;
import java.util.*; //day n number.
import java.lang.*;
public class String7 
{ String dn;
  void input()
  { Scanner ob=new Scanner(System.in);
    System.out.println("Enter the string:");
    dn=ob.nextLine();   
  }
  void check()
  {  int l=-1;
      String[] dno ={"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
      for(int i=0;i<8;i++)
      { if(dn.equalsIgnoreCase(dno[i]))
          l=i;
      }
      if(l!=-1)
          System.out.println("The Day Number is:"+l);
      else
          System.out.println("Invalid name.");
  }
    public static void main(String[] args) 
    {  String7 ob=new String7();
       ob.input();
       ob.check();
        
    }
    
}
