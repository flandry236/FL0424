package FL0424;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class RentalAgreement {
	
	private String toolCode;
	private String toolType;
	private String toolBrand;
	private int rentaldays;
	private Date checkoutDate;
	private Date dueDate;
	private double dailyRentalCharge;
	private int chargeDays;
	private double preDiscountCharge;
	private int discountPercent;
	private double discountAmount;
	private double finalCharge;

	public RentalAgreement(Tool tool, int rentalDays, Date checkout, int percent) {
		toolCode = tool.getToolCode();
		toolType = tool.getCharge().getToolType();
		toolBrand =  tool.getBrand();
		rentaldays = rentalDays;
		checkoutDate = checkout;
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(checkoutDate);
		cal.add(Calendar.DATE, rentalDays);
		dueDate = cal.getTime();
		dailyRentalCharge = tool.getCharge().getDailyCharge();
		chargeDays = checkChargeDays(checkoutDate, dueDate) ?rentalDays-1:rentalDays;
		preDiscountCharge = chargeDays*tool.getCharge().getDailyCharge();
		discountPercent = percent;
		discountAmount = preDiscountCharge * (percent/100.0);
		finalCharge = (preDiscountCharge - discountAmount);
	}

	private boolean checkChargeDays(Date checkoutDate, Date dueDate) {
		Calendar checkCal = Calendar.getInstance();
		checkCal.setTime(checkoutDate);
		LocalDate labor = LocalDate.of(checkCal.YEAR, Calendar.SEPTEMBER, DayOfWeek.MONDAY.getValue());
		Calendar dueCal = Calendar.getInstance();
		dueCal.setTime(dueDate);
		LocalDate forth = LocalDate.of(checkCal.YEAR, Calendar.JULY, 4);
		return (checkCal.before(labor) && dueCal.after(labor)) || (checkCal.before(forth) && dueCal.after(forth))? true: false;
		
	}

	public String getToolCode() {
		return toolCode;
	}

	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}

	public String getToolType() {
		return toolType;
	}

	public void setToolType(String toolType) {
		this.toolType = toolType;
	}

	public String getToolBrand() {
		return toolBrand;
	}

	public void setToolBrand(String toolBrand) {
		this.toolBrand = toolBrand;
	}

	public int getRentaldays() {
		return rentaldays;
	}

	public void setRentaldays(int rentaldays) {
		this.rentaldays = rentaldays;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getDailyRentalCharge() {
		return dailyRentalCharge;
	}

	public void setDailyRentalCharge(double dailyRentalCharge) {
		this.dailyRentalCharge = dailyRentalCharge;
	}

	public int getChargeDays() {
		return chargeDays;
	}

	public void setChargeDays(int chargeDays) {
		this.chargeDays = chargeDays;
	}

	public double getPreDiscountCharge() {
		return preDiscountCharge;
	}

	public void setPreDiscountCharge(double preDiscountCharge) {
		this.preDiscountCharge = preDiscountCharge;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getFinalCharge() {
		return finalCharge;
	}

	public void setFinalCharge(double finalCharge) {
		this.finalCharge = finalCharge;
	}
	
	public void printRA() {
		DateFormat dtf = new SimpleDateFormat("MM/DD/YY");
		System.out.println("Tool code: " + toolCode);
		System.out.println("Tool type: " + toolType);
		System.out.println("Tool brand: " + toolBrand);
		System.out.println("Rental Days: " + rentaldays);
		System.out.println("Checkout Date: " + dtf.format(checkoutDate));
		System.out.println("Due Date: " + dtf.format(dueDate));
		System.out.println("Daily Rental Charge: " + dailyRentalCharge);
		System.out.println("Charge Days: " + chargeDays);
		System.out.println("Pre Discount Charge: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(preDiscountCharge));
		System.out.println("Discount Percent: " + discountPercent + "%");
		System.out.println("Discount Amount: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(discountAmount));
		System.out.println("Final Charge: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(finalCharge));
	}
	
}
