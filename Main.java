import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
  // System.out.println("enter the number");
  int userNumber = 0;
  do{
    System.out.println("Guess my Number 1 to 100 : ");
    userNumber = sc.nextInt();
    
    if(userNumber == myNumber){
        System.out.println("WooHoo... Correct Number !!"); 
        break;
    
    }else if(userNumber > myNumber){
        System.out.println("Number is too Big");
    
    }else if(userNumber < myNumber){
        System.out.println("Number is too small");
    }
    
    }while(userNumber >= 0);

    System.out.println("My Number was :");
    System.out.println(myNumber);


 }
}
