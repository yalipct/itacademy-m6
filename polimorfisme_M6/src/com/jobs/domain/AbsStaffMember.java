package com.jobs.domain;

import java.text.*;

import com.jobs.application.CamposVacios;

public abstract class AbsStaffMember {

	protected NumberFormat formato = new DecimalFormat("#€0.00");

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid = 0;
	protected int irpf = 0;

	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone) throws CamposVacios {
		if (name.equals(""))
			throw new CamposVacios("El campo name del empleado " + name + CamposVacios.CAMPO_VACIO);
		if (address.equals(""))
			throw new CamposVacios("El campo address del empleado " + name + CamposVacios.CAMPO_VACIO);
		if (phone.equals(""))
			throw new CamposVacios("El campo phone del empleado " + name + CamposVacios.CAMPO_VACIO);

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static int getCOUNTER_MEMBERS() {
		return COUNTER_MEMBERS;
	}

	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}

	public double getTotalPaid() {
		return totalPaid;
	}

	public int getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}

	public abstract void pay();

	public String toString() {

		String empleado = "----------------------------------------\n"
				+ " Empleado " + (id) + ":\n name: " + name + "\n address: "
				+ address + "\n phone: " + phone + "\n";

		return empleado;
	}

}
