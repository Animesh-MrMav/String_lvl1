package String_lvl1;
import java.util.*;// print initials.
public class String2
{   String F,M,L;
    void input()
    {   Scanner ob=new Scanner(System.in);
        System.out.println("Enter First Name:");
        F=ob.nextLine();
        System.out.println("Enter Middle Name:");
        M=ob.nextLine();
        System.out.println("Enter Last Name:");
        L=ob.nextLine();    
    }
    void print()
    {
        System.out.println("The Full Name is: "+F+" "+M+" "+L);
        System.out.println("Initials: "+F.charAt(0)+"."+M.charAt(0)+"."+L.charAt(0));
        
    }
    public static void main(String[] args) {
        String2 ob=new String2();
        ob.input();
        ob.print();
    }
    
}
