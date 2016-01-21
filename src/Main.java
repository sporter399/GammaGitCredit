import java.util.Scanner;




public class Main {

    
    public static void main(String[] args) {
        getInfo accountholder = new getInfo();
        accountholder.getName();
        accountholder.getCreditScore();
        accountholder.credWorth();
        accountholder.displayCustList();
        
        
   
        
    }
}
    
class getInfo
{
    private String custName;
    int custCS;
    int platinum;
    int gold;
    int silver;
    int rust;
   

public void getName(){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter your first and last name: ");
     custName = input.next();
     System.out.println("");
     
}
public void getCreditScore(){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter your credit score: ");
     custCS = input.nextInt();
     System.out.println("");
     
    
    
}





public void credWorth()
{
    if (custCS>=700) {
        platinum = custCS;
        System.out.println("You are a Platinum member");
    }
    if (custCS>=650 && custCS<=700) {
        gold = custCS;
        System.out.println("You are a Gold member");
    }
    if (custCS>=600 && custCS<=650) {
        silver = custCS;
        System.out.println("You are a Silver member");
    }
    if (custCS<=600) {
        rust = custCS;
        System.out.println("You are a Rust member");
    }
    
}
    
        
    
    
public void displayCustList() {
    System.out.println("Your account information:");
    System.out.println(custName+" "+custCS);
    
    
}
}
