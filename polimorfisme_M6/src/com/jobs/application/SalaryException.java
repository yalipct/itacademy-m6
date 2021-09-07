package com.jobs.application;

public class SalaryException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String VALOR_VACIO = "Debe introducir un valor";
	public static final String VALOR_SALARIO_BOSS = "Un Boss tiene que cobrar más de 8000€ ";
	public static final String VALOR_SALARIO_MANAGER = "Un Manager tiene que cobrar entre 3000€ y 5000€ ";
	public static final String VALOR_SALARIO_SENIOR= "Un Senior tiene que cobrar entre 2700€ 4000€ ";
	public static final String VALOR_SALARIO_MID = "Un Mid tiene que cobrar entre 1800€ y 2500€ ";
	public static final String VALOR_SALARIO_JUNIOR = "Un Junior tiene que cobrar entre 900€ y 1600€ ";
	public static final String AYUDA_VOLUNTEER = "La ayuda que puede recibir un empleado Volunteer es de como máximo 300€";
	public static final String SALARY_VOLUNTEER = "El volunteer no cobra! Solo puede recibir una ayuda del gobierno";
	public static final String PAYMENT_RATE = "El pago no puede ser nulo";

		
	public SalaryException(String mensaje) {
		super(mensaje);
	}
}
