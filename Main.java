import java.util.Scanner;

class Main { 
  
  public static void main(String[] args){
      boolean isSunny = true;
      boolean isRaining = false; 
      double temp = 95.7;
     if (isSunny || temp > 95.7 && !isRaining )
     {
       System.out.println("Let's go get icecream!");

       Scanner scan  = new Scanner(System.in);
        System.out.print("How many scoops would you like?"); //Answer how manu scoop of ice cream you would like.
        int scoops = scan.nextInt();
        System.out.print("Your answer: " + scoops); 

        int count = 0; 
        while(count < scoops){   

          System.out.println("\n What flavor would you like for this scoop?");//For each scoop you choose, what flavor would you like each one to be?
          scan.next();  
      
        count ++;
      
        }
          System.out.println("It's a perfect day to have icecream!");
     }
      else
     {
       System.out.println("Let's stay inside and watch a movie");
       
      }
    } 
  }