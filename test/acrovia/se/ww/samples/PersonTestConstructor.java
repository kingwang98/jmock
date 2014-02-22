package acrovia.se.ww.samples;

import static org.junit.Assert.*;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;

import mockit.NonStrictExpectations;
import mockit.Verifications;
import mockit.VerificationsInOrder;

import org.junit.Test;

public class PersonTestConstructor {

	@Test
	public void testPerson() {
		assertNotNull(new Person());
		assertNotNull(new Person(""));
	}

	@Test
	public void testGetName() {
		new MockUp<Person>() {
			@Mock
			public void $init() {
				// Dont assign name variable at all
				// Leave it null
			}

			@Mock
			public void $init(String name) {
				// Dont assign name variable at all
				// Leave it null
			}

		};

		// test constructor without input parameter
		Person p = new Person();
		String name = p.getName();
		assertNull("Name of person is null", name);

		// test constructor with input parameter
		p = new Person("Alibaba");
		name = p.getName();
		assertNull("Name of person is null", name);
	}

	@Test
	public void testSetName(@Mocked final Person p) {

		new NonStrictExpectations() {
			// new Expectations() {
			{
				p.setName(anyString);
				times = 2;
				p.getName();
				returns("WW");
				times = 2;
			}
		};
		p.setName("KK");
		p.setName("Kg");
		System.out.println(p.getName());
		final String result = p.getName();

		new Verifications() {
			{
				String my = "WW";
				assertEquals(my, result);
			}
		};

		new VerificationsInOrder() {
			{
				p.setName(anyString);
				p.getName();
				p.getName();
			}
		};

	}

}
