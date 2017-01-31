import java.time.LocalDate;

public class BasePlusCommissionEmployee extends ComissionEmployee{

	private Double baseSalary;
	
	public BasePlusCommissionEmployee (String first, String last, String sin,LocalDate dob, Double comRate, Double baseSalary )
	{
		super(first, last, sin, dob, comRate);
		
		setBaseSalary(baseSalary);
		
	}
	


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}
	
	public PayCheque getPayCheque(){
		
		PayCheque newPayCheque = new PayCheque(super.toString(), baseSalary);
		
		return newPayCheque;
	}
}