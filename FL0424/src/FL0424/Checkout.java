package FL0424;

import java.util.Date;

public class Checkout {

	
		public Checkout() {
			super();
		}
	
		public RentalAgreement checkout(String toolCode, Date checkoutDate, int rentalDays, int percentage)  throws Exception {
			
			if(rentalDays < 1)
				throw new Exception("Rental days must be 1 or greater.");
			
			if(percentage > 100 || percentage < 0) {
				throw new Exception("Percentage discount must be between 0 and 100");
			}
			
			if(toolCode == null || toolCode.isBlank()) {
				throw new Exception("Tool code must be provided");
			}
			
			if(checkoutDate == null) {
				throw new Exception("Date must be provided");
			}
			
			Tool tool = new Tool(toolCode);
			
			return new RentalAgreement(tool,rentalDays,checkoutDate,percentage);
	}
}
