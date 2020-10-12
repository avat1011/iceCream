import java.util.Scanner;

class Main { 
  


  public static void main(String[] args){
     boolean isSunny = true;
     boolean isRaining = false; 
     int temp = 95;
     if (isSunny || temp > 95 && !isRaining )
     {
       System.out.println("Let's go get icecream!");

       Scanner scan  = new Scanner(System.in);
        System.out.print("How many scoops would you like?");
        int scoops = scan.nextInt();
        System.out.print("Your answer: " + scoops);

        int count = 0; 
        while(count < scoops){   

        System.out.println("\n What flavor would you like for every scoop?");string flavor = scan.next;  

        count ++; 
        }

     }
      else
     {
       System.out.println("Let's stay inside and watch a movie");
       
      }
    } 
  }