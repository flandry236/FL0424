package FL0424;
public class ToolCharge {

	private String toolType;
	private double dailyCharge;
	private boolean weekDayCharge;
	private boolean weekEndCharge;
	private boolean holidayCharge;
	
	

	public String getToolType() {
		return toolType;
	}
	public void setToolType(String toolType) {
		this.toolType = toolType;
	}
	public double getDailyCharge() {
		return dailyCharge;
	}
	public void setDailyCharge(float dailyCharge) {
		this.dailyCharge = dailyCharge;
	}
	public boolean isWeekDayCharge() {
		return weekDayCharge;
	}
	public void setWeekDayCharge(boolean weekDayCharge) {
		this.weekDayCharge = weekDayCharge;
	}
	public boolean isWeekEndCharge() {
		return weekEndCharge;
	}
	public void setWeekEndCharge(boolean weekEndCharge) {
		this.weekEndCharge = weekEndCharge;
	}
	public boolean isHolidayCharge() {
		return holidayCharge;
	}
	public void setHolidayCharge(boolean holidayCharge) {
		this.holidayCharge = holidayCharge;
	}
	

}
