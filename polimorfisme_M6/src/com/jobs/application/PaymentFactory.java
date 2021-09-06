package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	public static IPaymentRate createPaymentRateBoss() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.5;
			}
		};
	}

	public static IPaymentRate createPaymentRateManager() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.1;
			}
		};
	}

	// reducció del: 5% de sou respectivament respecte a la base.
	public static IPaymentRate createPaymentRateSenior() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth -= salaryPerMonth * 0.95;
			}
		};
	}

	// reducció del:10% de sou respectivament respecte a la base.
	public static IPaymentRate createPaymentRateMid() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth -= salaryPerMonth * 0.90;
			}
		};
	}

	// reducció del: 15% de sou respectivament respecte a la base.
	public static IPaymentRate createPaymentRateJunior() {
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth -= salaryPerMonth * 0.85;
			}
		};
	}
	public static IPaymentRate createPaymentRateVolunteer(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return 0;     
			}
		};
	}

}
