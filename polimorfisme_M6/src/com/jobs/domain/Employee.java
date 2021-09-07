package com.jobs.domain;

import com.jobs.application.CamposVacios;
import com.jobs.application.SalaryException;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	protected double sueldoNetoMensual;
	protected double sueldoNetoAnual;
	protected double sueldoBrutoMensual;
	protected double sueldoBrutoAnual;

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate, double SUELDO_MINIMO, double SUELDO_MAXIMO, int irpf) throws SalaryException, CamposVacios {
		super(name, address, phone);
		
		if (name.equals(""))
			throw new CamposVacios("El campo name del empleado " + name + CamposVacios.CAMPO_VACIO);
		if (address.equals(""))
			throw new CamposVacios("El campo address del empleado " + name + CamposVacios.CAMPO_VACIO);
		if (phone.equals(""))
			throw new CamposVacios("El campo phone del empleado " + name + CamposVacios.CAMPO_VACIO);
		
		
		//if(salaryPerMonth<SUELDO_MINIMO || salaryPerMonth<SUELDO_MAXIMO) throw new Exception("El salario mensual de : " + salaryPerMonth + " para: " + name + " no es adecuado para su puesto");
		
		if(paymentRate==null) throw new SalaryException(SalaryException.PAYMENT_RATE);
				
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
