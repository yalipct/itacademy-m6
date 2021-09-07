package com.jobs.domain;

import com.jobs.application.SalaryException;

public class Junior extends Employee {

	private static final double SUELDO_MINIMO = 900.00;
	private static final double SUELDO_MAXIMO = 1600.00;
	private static final int IRPF = 2;

	public Junior(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate, SUELDO_MINIMO, SUELDO_MAXIMO, IRPF);

		if (salaryPerMonth < 0 || (salaryPerMonth < SUELDO_MINIMO || salaryPerMonth > SUELDO_MAXIMO))
			throw new SalaryException(SalaryException.VALOR_SALARIO_JUNIOR);

		if (paymentRate == null)
			throw new Exception();

	}

	@Override
	public String toString() {
		return super.toString() 
				+ " Salario Bruto al mes: " + formato.format(totalPaid) 
				+ "\n Salario Bruto al a�o: " + formato.format(totalPaid * 14) 
				+ "\n Salario Neto al mes: " + formato.format(totalPaid * ((double) (100 - irpf) / 100)) 
				+ "\n Salario Neto al a�o: " + formato.format(totalPaid * ((double) (100 - irpf) / 100) * 14) + "\n"
				+ "----------------------------------------\n";
	}

}
