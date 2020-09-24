package maven_jawad;
import java.util.ArrayList;

public class ContactsDAO {

	private ArrayList<User> contactList = new ArrayList<User>();
		
	public void addContact(User contact) {
		contactList.add(contact);
	}
	
	//remove contact by firstname
	public void removeContact(String firstname) {
		for (User contact : contactList) 
		{
			if (contact.getFirstName() == firstname)
			{
				contactList.remove(contact);
				
				
			}
		}	
	}
	
	public void updateContact(User contactupdate, String firstname) {

		
		
		for (User contact : contactList) 
		{
			if (contact.getFirstName() == firstname)
			{
				
				contactList.remove(contact);
				contactList.add(contactupdate);
				
			}
		}	
	
	}
	
	public void printContacts(){
		for (User contact : contactList) 
			System.out.println(contact.getFirstName());
	}
	
	//   CRUD
	//Add method     -   Create
	//Print Contacts   - Retreive
	//Update           - Update 
	//Remove contact   - Delete
	
}
