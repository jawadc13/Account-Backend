package maven_jawad;

import java.util.Scanner;

public class ContactApp extends ContactsDAO {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//password, birthdate, gender
		
		ContactsDAO contactList = new ContactsDAO();
		User user1 = new User("John","Snow",123456789,"deep@deep.com","kingslayer","01/10/1985", "male");
		User user2 = new User("Jamie","Lannister",123456789,"adad@deep.com","badpassword","01/10/1954", "male");
		User user3 = new User("Tyrion","Lannister",123456789,"dgdg@deep.com","shortboi5","04/10/1997", "male");
		User user4 = new User("Angie","Sandler",123456789,"girl@deep.com","coolio123","06/10/1996", "female");
		
		contactList.addContact(user1);
		contactList.addContact(user2);
		contactList.addContact(user3);
		contactList.addContact(user4);
		
		userDecide(contactList);
	
	}
		
			public static void userDecide(ContactsDAO contactList) {
				
				int input = 10;
				
				while(input != 0)
				{	
				Scanner readsen = new Scanner(System.in);
				System.out.println("Welcome to the web, what would you like to do? Type the number shown!\n 1. Create\n 2. Retrieve\n 3. Update\n 4. Delete\n 5. exit\n");
				input = readsen.nextInt(); 
				
				switch(input) {
				case 1:
					
					Scanner readname = new Scanner(System.in);
					System.out.println("Please add first name:\n");
					String firstName = readname.nextLine();
					
					Scanner readlast = new Scanner(System.in);
					System.out.println("Please add last name:\n");
					String lastName = readlast.nextLine();
					
					Scanner readphone = new Scanner(System.in);
					System.out.println("Please add phone number:\n");
					int phoneNumber = readphone.nextInt();
					
					//emailAddress
					Scanner reademail = new Scanner(System.in);
					System.out.println("Please add email:\n");
					String emailAddress = reademail.nextLine();
					
					Scanner readpass = new Scanner(System.in);
					System.out.println("Please add password:\n");
					String password = readpass.nextLine();
					
					Scanner readbirth = new Scanner(System.in);
					System.out.println("Please add birthday XX/XX/XXXX:\n");
					String birthdate = readbirth.nextLine();
					
					Scanner readgender = new Scanner(System.in);
					System.out.println("Please add gender(male, female, or other):\n");
					String gender = readgender.nextLine();
					
					User useradd = new User(firstName,lastName,phoneNumber,emailAddress,password,birthdate,gender);
					
					contactList.addContact(useradd);
					
					break;
					
				case 2:
					
					contactList.printContacts();
					break;
				
				case 3:
					

					 
					
					Scanner readNameUp = new Scanner(System.in);
					System.out.println("Please add first name of the person you want to update info on:\n");
					String nameupdate = readNameUp.nextLine();
					
					Scanner upname = new Scanner(System.in);
					System.out.println("Please edit first name:\n");
					firstName = upname.nextLine();
					
					Scanner uplast = new Scanner(System.in);
					System.out.println("Please edit last name:\n");
					lastName = uplast.nextLine();
					
					Scanner upphone = new Scanner(System.in);
					System.out.println("Please edit phone number:\n");
					phoneNumber = upphone.nextInt();
					
					//emailAddress
					Scanner upemail = new Scanner(System.in);
					System.out.println("Please edit email:\n");
					emailAddress = upemail.nextLine();
					
					Scanner uppass = new Scanner(System.in);
					System.out.println("Please edit password:\n");
					password = uppass.nextLine();
					
					Scanner upbirth = new Scanner(System.in);
					System.out.println("Please edit birthday XX/XX/XXXX:\n");
					birthdate = upbirth.nextLine();
					
					Scanner upgender = new Scanner(System.in);
					System.out.println("Please edit gender(male, female, or other):\n");
					gender = upgender.nextLine();
					
					useradd = new User(firstName,lastName,phoneNumber,emailAddress,password,birthdate,gender);
					
					contactList.updateContact(useradd,nameupdate);
					
					break;
					
				case 4:
					
					Scanner readNameDel = new Scanner(System.in);
					System.out.println("Please add first name of the person you want to delete:\n");
					String namedelete = readNameDel.nextLine();
					
					contactList.removeContact(namedelete);
					
					break;
					
				case 5:
					input = 0;
					break;
				default: 
					System.out.println("Please type in a valid number");
					
				}
				
			}
			}
	
	}
	

		
		
		
		
	
	
		
			
	
	
	
	
	
	
	
	
	
	
	


