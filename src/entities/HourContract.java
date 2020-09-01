package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HourContract {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	protected Date data;
	protected Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
	}
	
	public HourContract(Date data, Double valuePerHour, Integer hours) {
		this.data = data;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	public HourContract(Date data) {
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalValue() {
		return valuePerHour * hours;
	}

	@Override
	public String toString() {
		return "Date (DD/MM/YYYY): " + sdf.format(data) + String.format("%n")
		+ "Value per hour: " + String.format("%.2f%n", valuePerHour) + "Duration (hours): " + hours 
		+ String.format("%n");
	}	
}