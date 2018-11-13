import javax.swing.JOptionPane;
import java.util.Random;

public class DogRace{
	private static String askNumOfDogs, askDogSpeed, ready;
	private static int numOfDogs, i;
	static int dogspeed[] = new int[numOfDogs];
	static String dogsname[] = new String[numOfDogs];
   //This is the main method
	public static void main(String [] args) {
		
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		Name(name);
		
		askNumOfDogs = JOptionPane.showInputDialog("How many dogs are you entering into the race?");
		numOfDogs = Integer.parseInt(askNumOfDogs);
		
		Dog();
		
		ready = JOptionPane.showInputDialog(null, "Are you ready to begin the race? \n Enter yes to continue, or no to start over. :)");
				if (ready.equalsIgnoreCase("yes")) {
					finishLine();
				} else if (ready.equalsIgnoreCase("no")){
					System.exit(0);
				} else {
					JOptionPane.showMessageDialog(null, "   That's an invalid option. As \npunishment, you must start over :(");
		            System.exit(0);
				}	
		System.exit(0);		
	}
   //This method will take your name and welcome you to the race
	public static String Name(String yourName) {
		JOptionPane.showMessageDialog(null, "Hello, " + yourName + " welcome to the dog race! DOGS ONLY! \n You will be asked to choose the number of dogs\n you want to " +
				"enter into the race, name them, and give them an integer speed.");
				//System.out.println("The Name method ran properly ;));
		return yourName;
	}
   //This method allows you name your dogs	
	public static void Dog() {
		
			
		String dogsname[] = new String[numOfDogs];
		int dogspeed[] = new int[numOfDogs];
		
		for(i=0; i<numOfDogs; i++){
	         dogsname[i] = JOptionPane.showInputDialog(null, "What's this dog's name?");
	         
	         askDogSpeed = JOptionPane.showInputDialog(null, "How fast is this dog? Instert a positive integer less than 100.");
	         dogspeed[i] = Integer.parseInt(askDogSpeed);
	         
	         //DogStats dog = new DogStats(dogsname[i], dogspeed[i]);
	      }
		
		//displays a message for all the dogs in the race
		for(i=0; i<numOfDogs; i++) {
			JOptionPane.showMessageDialog(null, dogsname[i] + " is in the race! \nTheir speed is " + dogspeed[i]);
		}
			//System.out.println("The Dog method ran properly ;)");
		
	}
   //This method will compare the dogs with a randomly generated number	
	public static void finishLine(){
		int firstPlace = 0; //dogspeed[0];
		int winner = 0;
		
		Random win = new Random(); //This is the random number
		int winCondition = win.nextInt(150); //The speed cap is at 150
		
		for(i=0; i<dogspeed.length - 1; i++) {
			 if (firstPlace < dogspeed[i]) {
		            firstPlace = dogspeed[i]; 
		            System.out.println(firstPlace);
		            if (firstPlace > winCondition) {
		            	winner = firstPlace;
		            	System.out.println(winner);
		            	JOptionPane.showMessageDialog(null, dogspeed[i] + "won!!!"); 
		            } 
		      }	
	
		} 
			//System.out.println("The finishLine method ran properly ;)" );
	}
}
//This is for the object dog? not sure what to do with this one yet, honestly, just to see if i could make on object
class DogStats{
	private String name;
	private int speed;
	DogStats(String n, int s){
		name = n;
		speed = s;
	}
}