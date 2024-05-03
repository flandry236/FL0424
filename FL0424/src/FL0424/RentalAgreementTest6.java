package FL0424;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class RentalAgreementTest6 {
	
	SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YY", Locale.ENGLISH);
	String date = "7/2/20";


	@Test
	void test() {
		
		try {
			RentalAgreement ra = new Checkout().checkout("JAKR", formatter.parse(date), 4, 50);
			assertNotNull(ra);
			ra.printRA();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
