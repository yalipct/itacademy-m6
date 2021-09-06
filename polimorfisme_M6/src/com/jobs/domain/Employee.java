package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	protected double sueldoNetoMensual;
	protected double sueldoNetoAnual;
	protected double sueldoBrutoMensual;
	protected double sueldoBrutoAnual;

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate, double SUELDO_MINIMO, double SUELDO_MAXIMO, int irpf) throws Exception {
		super(name, address, phone);
		
		//if(salaryPerMonth<SUELDO_MINIMO || salaryPerMonth<SUELDO_MAXIMO) throw new Exception("El salario mensual de : " + salaryPerMonth + " para: " + name + " no es adecuado para su puesto");
		
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		this.irpf=irpf;
	}
	
	
	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}
	
	public void Bonus() {
		totalPaid= totalPaid*1.1;
	}


	@Override
	public String toString() {
		
		String empleado=
				"----------------------------------------\n"
				+ " Empleado " + (id) + ":\n name: " + name + "\n address: " + address + "\n phone: " + phone + "\n";
		
		return empleado;
	}
	
	
}
