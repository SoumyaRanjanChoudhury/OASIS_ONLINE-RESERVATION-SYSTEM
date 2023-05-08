package oasis;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class OnlineReservationSystem {
	
	  private static Scanner scanner = new Scanner(System.in);
	  private static Connection conn = null;


	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		 System.out.println("Welcome to Online Reservation System");
		    
		    // Login
		    System.out.print("Enter your login id: ");
		    String loginId = scanner.nextLine();
		    System.out.print("Enter your password: ");
		    String password = scanner.nextLine();
		    
		    // Check if the login credentials are valid
		    if (isValidLogin(loginId, password)) {
		    
		      // Display the main menu
		      displayMenu();
		      
		    } else {
		      System.out.println("Invalid login credentials. Please try again.");
		    }
		    
		    scanner.close();
		  }
		  
		  private static boolean isValidLogin(String loginId, String password) {
			return false;
		    // Check if the login credentials are valid and return true or false accordingly
		  }
		  
		  private static void displayMenu() throws SQLException {
		  
		    while (true) {
		    	
		    	  System.out.println("Please select an option:");
		          System.out.println("1. Reservation System");
		          System.out.println("2. Cancellation Form");
		          System.out.println("3. Exit");
		          
		          int choice = scanner.nextInt();
		          
		          switch (choice) {
		            case 1:
		              reservationSystem();
		              break;
		            case 2:
		              cancellationForm();
		              break;
		            case 3:
		              System.out.println("Thank you for using Online Reservation System");
		              System.exit(0);
		              break;
		            default:
		              System.out.println("Invalid choice. Please try again.");
		              break;
		          }
		          
		          // Add a delay before clearing the console
		          try {
		            Thread.sleep(2000);
		          } catch (InterruptedException e) {
		            e.printStackTrace();
		          }
		          
		          // Clear the console
		          System.out.print("\033[H\033[2J");
		          System.out.flush();
		          
		        }
		        
		      }
		      
		      private static void reservationSystem() {
		      
		        System.out.print("Enter your name: ");
		        String name = scanner.nextLine();
		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();
		        System.out.print("Enter your gender: ");
		        String gender = scanner.nextLine();
		        System.out.print("Enter the train number: ");
		        int trainNumber = scanner.nextInt();
		        System.out.print("Enter the class type: ");
		        String classType = scanner.nextLine();
		        System.out.print("Enter the date of journey: ");
		        String dateOfJourney = scanner.nextLine();
		        System.out.print("Enter the source station: ");
		        String sourceStation = scanner.nextLine();
		        System.out.print("Enter the destination station: ");
		        String destinationStation = scanner.nextLine();
		        
		        // Insert the reservation data into the database
		        insertReservationData(name, age, gender, trainNumber, classType, dateOfJourney, sourceStation, destinationStation);
		        
		        System.out.println("Reservation successful!");
		        
		      }
		      
		      private static void insertReservationData(String name, int age, String gender, int trainNumber,
					String classType, String dateOfJourney, String sourceStation, String destinationStation) {
				// TODO Auto-generated method stub
				
			}

			private static void cancellationForm() throws SQLException {
		      
		        System.out.print("Enter your PNR number: ");
		        int pnrNumber = scanner.nextInt();
		        
		        // Retrieve the reservation data from the database based on the PNR number
		        ResultSet rs = retrieveReservationData(pnrNumber);
		        
		        if (rs.next()) {
		        
		          System.out.println("Your reservation details:");
		          System.out.println("Name: " + rs.getString("name"));
		          System.out.println("Age: " + rs.getInt("age"));

		    }


	}

			private static ResultSet retrieveReservationData(int pnrNumber) {
				// TODO Auto-generated method stub
				return null;
			}

}
