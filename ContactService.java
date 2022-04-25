package contact;
import java.util.ArrayList;
public class ContactService {
	
	private ArrayList<Contact>contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
		
	}
	public boolean addContact(Contact newContact) {
		boolean isAlreadyContact = false;
		for(Contact contact:contacts) {
			if(contact.getContactId().equalsIgnoreCase(newContact.getContactId())) {
				isAlreadyContact = true;
				break;
			}
		}
			if(!isAlreadyContact) {
				contacts.add(newContact);
				return true;
			}
			else {
				return false;
			}
		
	}

	public boolean deleteContact(String contactId){
		boolean isDeleted = false;
		for(Contact contact:contacts) {
			if(contact.getContactId().equals(contactId)) {
				contacts.remove(contact);
				isDeleted = true;
				break;
			}
			
			
		}
		return isDeleted;
			
	}
	
	public boolean updateContact(String contactId, String firstName, String lastName, String phone, String address) {
		boolean isUpdated = false;
		for(Contact contact:contacts) {
			if(contact.getContactId().equals(contactId)) {
				if(!firstName.equals("") && !(firstName.length()>10)) {
					contact.setFirstName(firstName);
				}
				if(!lastName.equals("") && !(firstName.length()>10)) {
					contact.setLastName(lastName);
				}
				if(!phone.equals("") && phone.length()== 10) {
					contact.setPhone(phone);
				}
				if(!address.equals("") && !(address.length()>30)) {
					contact.setAddress(address);
				}
			isUpdated = true;
			}
			
			
			
			
		}
		
			
		return isUpdated;
			
		
	}
	
	
	

}
