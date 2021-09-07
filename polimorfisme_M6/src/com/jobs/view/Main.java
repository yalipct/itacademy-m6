package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	private static JobsController controller = new JobsController();

	public static void main(String[] args) {//  
		
			controller.createBossEmployee("Pepe Boss", "Direccin molona", "666666666 ", 6000.0);
			controller.createVolunteer("Juan Volunteer", "Direccn molona 4", "614266666", "Es vountario", 350.0);
			controller.createManagerEmployee("Pedro Manager", "Direccn molona 2", "665226666", 4500.50);
			controller.createJuniorEmployee("Alberto Junior", "Septimania", "589123456", 950.75);
			controller.createMidEmployee("Fran Mid", "Sant Joaquin", "589123456", 2500.0);
			controller.createSeniorEmployee("Carlos Senior", "Vallirana", "589123456", 3075.0);
			
			controller.payAllEmployeers();

			controller.Bonus();

			String allEmployees = controller.getAllEmployees();
			System.out.println("EMPLOYEES: " + " \n" + allEmployees);

		

	}

}
