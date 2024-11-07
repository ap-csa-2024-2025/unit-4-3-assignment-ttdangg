import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {

    // write solutions to problems here

    // Problem 1
    // for (int i = 1; i<=25; i+=2){
    //   System.out.println(i);
    // }


    // version w if statement
    // for (int i = 1; i<=25; i+=1){
    //   if (i%2 == 1){
    //     System.out.println(i);
    //   }
    // }



    // Problem 2
    // for (int i = 17; i <= 73; i++){
    //   System.out.print(i + " ");
      
    //   if (i%10 == 6){
    //     System.out.println();
    //   }
    // }




    // Problem 3
    // Scanner sc = new Scanner(System.in);
    // int num;

    // System.out.println("Enter a number between 0 and 50: ");
    // num = sc.nextInt(); 
    // int count = 0;
    // if ((num<=0) || (num>=50)){
    //   System.out.println("Error");
    // }
    // else{
    //   for (int i = num; i<=50; i++){
    //     System.out.print(i + " ");
    //     count++;
    //     if (count == 5){
    //       System.out.println();
    //       count = 0;
    //     }

    //   }
    // }


    // Problem 4
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Enter a positive integer: ");
    num = sc.nextInt();
    
    if (num>0){
      num -= num%3;
       for (int i = num; i>=0; i-=3){
        System.out.print(i + " ");
      }
    }
    else{
     System.out.println("error");
    }
     






  }
    
}
