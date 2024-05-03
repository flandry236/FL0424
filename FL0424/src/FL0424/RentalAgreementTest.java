package FL0424;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class RentalAgreementTest {

	SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YY", Locale.ENGLISH);
	String date = "9/3/15";	
	String error = "Percentage discount must be between 0 and 100";

	@Test
	void test() {
		try {
			new Checkout().checkout("JAKR", formatter.parse(date), 5, 101);
			
		} catch (ParseException pe) {
			// TODO Auto-generated catch block
			pe.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertEquals(error,e.getMessage());
		}
	}

}
