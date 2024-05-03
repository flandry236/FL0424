package FL0424;


public class Tool {

	private String toolCode;
	private String brand;
	private ToolCharge charge;
	
	
	public Tool(String toolCode) {
		super();
		this.toolCode = toolCode;
		String brandCode = toolCode.substring(toolCode.length()-1);
		switch(brandCode) {
		case "S":
			brand = "Stihl";
		case "W":
			brand = "Werner";
		case "D":
			brand = "DeWalt";
		case "R":
			brand = "Ridgid";
		}
		
		String typeCode = toolCode.substring(0,toolCode.length()-1);
		switch(typeCode) {
		case "CHN":
			charge.setToolType("Chainsaw");
			charge.setDailyCharge(1.49f);
			charge.setHolidayCharge(true);
			charge.setWeekDayCharge(true);
			charge.setWeekEndCharge(false);
		case "LAD":
			charge.setToolType("Ladder");
			charge.setDailyCharge(1.99f);
			charge.setHolidayCharge(false);
			charge.setWeekDayCharge(true);
			charge.setWeekEndCharge(true);
		case "JAK":
			charge.setToolType("Jackhammer");
			charge.setDailyCharge(2.99f);
			charge.setHolidayCharge(false);
			charge.setWeekDayCharge(true);
			charge.setWeekEndCharge(false);
		}
	}
	
	
	public String getToolCode() {
		return toolCode;
	}
	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public ToolCharge getCharge() {
		return charge;
	}
	public void setCharge(ToolCharge charge) {
		this.charge = charge;
	}
	
	
	

}
