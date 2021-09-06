package com.jobs.domain;

public class Mid extends Employee{

	private static final double SUELDO_MINIMO = 1800.00;
	private static final double SUELDO_MAXIMO = 2500.00;
	private static final int IRPF = 15;

	
	public Mid(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate, SUELDO_MINIMO, SUELDO_MAXIMO, IRPF);
		
		if(salaryPerMonth<0 || (salaryPerMonth<SUELDO_MINIMO || salaryPerMonth>SUELDO_MAXIMO)) throw new SalaryException(SalaryException.VALOR_SALARIO_MID);
			
		if(paymentRate==null) throw new Exception();
	
	}	
	
	@Override
	public String toString() {
		return super.toString() 
				+ " Salario Bruto al mes: " + formato.format( totalPaid ) 
				+"\n Salario Bruto al año: " + formato.format( totalPaid*14 )
				+"\n Salario Neto al mes: " + formato.format(   totalPaid * ( (double) (100 -irpf) /100 ) ) 
				+"\n Salario Neto al año: " + formato.format( totalPaid * ( (double) (100 -irpf) /100 ) *14  )+ "\n" 
				+"----------------------------------------\n";
	}

	
}
