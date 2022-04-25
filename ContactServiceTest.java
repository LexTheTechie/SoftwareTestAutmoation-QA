package contact;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContactServiceTest {
	@Test
	public void testAdd()
	{
	ContactService cs = new ContactService();
	Contact test1 = new Contact("2009436", "Lex", "Alexander", "1111111111", "724 Shilling Dr");
	assertEquals(true, cs.addContact(test1));
	}

	@Test
	public void testDelete()
	{
	   ContactService cs = new ContactService();
	     
	Contact test1 = new Contact("2009436", "Lex", "Alexander", "1111111111", "724 Shilling Dr");
	Contact test2 = new Contact("1234567", "Tuffy", "Alexander", "2187123404", "122 Her World");
	Contact test3 = new Contact("000000", "Tater", "Beck", "9215501793", "143 His World");

	cs.addContact(test1);
	cs.addContact(test2);
	cs.addContact(test3);

	assertEquals(true, cs.deleteContact("1234567"));
	assertEquals(false, cs.deleteContact("0000000"));
	assertEquals(false, cs.deleteContact("0000000"));
	}

	@Test
	public void testUpdate()
	{
	ContactService cs = new ContactService();
	Contact test1 = new Contact("2009436", "Lex", "Alexander", "1111111111", "724 Shilling Dr");
	Contact test2 = new Contact("1234567", "Tuffy", "Alexander", "2187123404", "122 Her World");
	Contact test3 = new Contact("000000", "Tater", "Beck", "9215501793", "143 His World");


	cs.addContact(test1);
	cs.addContact(test2);
	cs.addContact(test3);

	assertEquals(true, cs.updateContact("000000", "TaterFirst", "BeckLast", "9215501793", "143 His World"));
	assertEquals(false, cs.updateContact("000001", "TaterFirst", "BeckLast", "9215501793", "143 His World"));
	}

}
