import java.util.ArrayList;
        import java.util.Random;
        import java.util.Timer;
        import java.util.TimerTask;

public class Traffic {
	
    // declaring variables
	
    public static ArrayList<Integer> collection = new ArrayList<Integer>();
    public static Random numb = new Random();
    public static int size = collection.size();

    // creating a method that holds traffic_light functions
    public static void traffic_light() {
    	
        //using the timer class
    	
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
        	
  // declaring int as a global variable
        	
            public int i = 0;
            public int j,x;


            public void run() {
            	
 // this is a default  method which is used by the timer to
 // declare the size of the collection that holds the car

                int size=collection.size();

//creating a while loop function that checks if the cars added in the collection are 100
                
                while (size < 100) {
                	
  // getting a random variable to assign to the numb
                	
                    int ran_numb_add = numb.nextInt(20);
                    
//  int size=collection.size();
// this is for loop that keeps adding to the collection of cars
// within the given range
                    
                    for (int j = 1; j <= ran_numb_add; j++) {
                        int ran_numb = numb.nextInt(100);
                        collection.add(ran_numb);
                        size++;
                    }
 // printing out the random cars that are being added to the collection
                    
                    System.out.println(ran_numb_add+" Car(s) added to the collection");
                    if (size >= 100) {
                        System.out.println("Sorry, The collection is full");
                    }

                }
// the below condition is created to reduce the number of cars
 // based on the colors of the traffic lights
                
                ++i;
                
 // if the size of the cars in the collection is greater than
 // 0 and is equal to 1 the yellow light will show
                
                if (i == 1 && size > 0) {
                    System.out.println("*********");
                    System.out.println("YELLOW");
                    System.out.println("*********");
                    
   // The for loop function that removes cars
// as the yellow light is showing
                    
                    for (j = 1; j <= 20; j++) {
                        collection.remove(j);
                    }

                    System.out.println(j+" Cars are going");
                    
  // printing the remaining cars
//that are in the collection once the yellow light stops showing
                    
                    System.out.println("Remaining cars are "+collection.size());
                    
// "else if". If the size of the cars in the collection is greater than
// 0 and equal to 1 the green light will show
                    
                } else if (i == 9 && size > 0) {
                    System.out.println("*********");
                    System.out.println("GREEN");
                    System.out.println("*********");
                    
  // "for" loop function that removes cars when it's green
                    
                    for (x = 1; x <= 32; x++) {
                        collection.remove(x);
                    }
                    System.out.println(x+" Cars are going");
                    
 // printing the remaining cars
 //that are in the collection once the green light stops showing
                    
                    System.out.println("Remaining cars are "+collection.size());

// We use "else if" to check if our car collection  is empty
                                        
                } else if (size <= 0) {
                    System.out.println("The Collection is empty");
                    System.exit(0);
                    
 // if the size of the cars in the collection is greater than
// 0 and is equal to 30 the red light will show and the cars will stop 
                    
                } else if (i == 30 && size > 0) {
                    System.out.println("*********");
                    System.out.println("  RED");
                    System.out.println("*********");
                    
                } else if (i == 60 && size > 0) {
                    i = 0;
                    
  // if there's no car in the collection, the program will stop
                    
                } else if (size == 0) {
                    System.out.println("No car in your collection");
                    System.exit(0);
                }

            }

        };
 //We use "timer schedule" is used to delay the time each light will show
        timer.schedule(task, 1000, 1000);

    }

 // this is the main method that calls the traffic lights
    public static void main(String[] args) {

        traffic_light();


    }
}