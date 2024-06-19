import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        
         short id=in.nextShort();
         char gender=in.next().charAt(0);
         double salary=in.nextDouble();
        float f=in.nextFloat();
        System.out.println(" enter name :");
        String name=in.nextLine();
        System.out.println("name:"+name);
        System.out.println("age:");
    
        int age=in.nextInt();
        
        System.out.println("age:"+age);
       // System.out.println("id:"+id);
       // System.out.println("gender :"+gender);
        //System.out.println("salary :"+salary);
    }
}
