package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String description;
	private static final double AYUDA_DEL_GOBIERNO = 300.00;
	

	public Volunteer(String name, String address, String phone, String description, double ayuda) throws Exception {
		super(name, address, phone);
		
		//if(totalPaid>0) throw new SalaryException(SalaryException.SALARY_VOLUNTEER);
		
		this.description=description;
		
		if(ayuda > AYUDA_DEL_GOBIERNO) {
			throw new SalaryException(SalaryException.AYUDA_VOLUNTEER);			
		}
		
		totalPaid=ayuda;
	}
	

	public String getDescription() {
		return description;
	}


	@Override
	public void pay() {
		
	}


	@Override
	public String toString() {
		return  super.toString()
				+ " description: " + description 
				+ "\n Recibe una ayuda mensual de: " + formato.format(totalPaid)+ "\n"
				+ "----------------------------------------\n";
	
	}



	


	

	
	
	
	
	

}
