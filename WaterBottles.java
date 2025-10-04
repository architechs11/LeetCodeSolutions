import java.util.Scanner;  //to import the Scanner input Class into the code for taking input of both values

public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int count, remaining;
        count = remaining = numBottles;
    
        while(remaining >= numExchange)
        {
            int fresh = (remaining/numExchange);    //new fresh bottles
            count = count + fresh;
            remaining = remaining - (numExchange*fresh) + fresh;
        }
        return count;   //returning the finalized count
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numBottles = in.nextInt();  //input no. of bottles
        int numExchange = in.nextInt(); //input exchange rate
        
        System.out.println("Number of Bottles drank: "+(numWaterBottles(numBottles, numExchange)));
    }
}
