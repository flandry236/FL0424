package FL0424;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class RentalAgreementTest4 {

	SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YY",Locale.ENGLISH);
	String date = "9/3/15";
	

	@Test
	void test() {
		
		try {
			RentalAgreement ra = new Checkout().checkout("JAKD", formatter.parse(date), 6, 0);
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
