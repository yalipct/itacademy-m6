package com.jobs.domain;

import com.jobs.application.CamposVacios;
import com.jobs.application.SalaryException;

public class Senior extends Employee{
	
	private static final double SUELDO_MINIMO = 2700.00;
	private static final double SUELDO_MAXIMO = 4000.00;
	private static final int IRPF = 24;
	
	
	public Senior(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws SalaryException, CamposVacios {
		super(name, address, phone, salaryPerMonth, paymentRate, SUELDO_MINIMO, SUELDO_MAXIMO, IRPF);
		
		if(salaryPerMonth<0 || (salaryPerMonth<SUELDO_MINIMO || salaryPerMonth>SUELDO_MAXIMO)) throw new SalaryException(SalaryException.VALOR_SALARIO_SENIOR);
			
		if(paymentRate==null) throw new SalaryException(SalaryException.PAYMENT_RATE);
	
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
