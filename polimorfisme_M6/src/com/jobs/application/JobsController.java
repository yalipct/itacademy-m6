package com.jobs.application;

import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Junior;
import com.jobs.persistence.EmployeeRepository;
import com.jobs.domain.Volunteer;
import com.jobs.domain.Boss;
import com.jobs.domain.Employee;
import com.jobs.domain.Manager;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;

public class JobsController {

	private EmployeeRepository repository= new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth){		
		try {
			Boss boss = new Boss(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
			repository.addMember(boss);
			boss.pay();
		} catch (SalaryException e) {
			System.err.println(e.getMessage());
		}catch(CamposVacios e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth){
		try{
			Manager manager = new Manager(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
			repository.addMember(manager);
			manager.pay();
		} catch (SalaryException e) {
			System.err.println(e.getMessage());
		}catch(CamposVacios e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createSeniorEmployee(String name, String address, String phone, double salaryPerMonth){		
		try {
			Senior senior = new Senior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateSenior());
			repository.addMember(senior);
			senior.pay();
		} catch (SalaryException e) {
			System.err.println(e.getMessage());
		}catch(CamposVacios e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createMidEmployee(String name, String address, String phone, double salaryPerMonth){		
		try {
			Mid mid = new Mid(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateMid());
			repository.addMember(mid);
			mid.pay();
		} catch (SalaryException e) {
			System.err.println(e.getMessage());
		}catch(CamposVacios e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createJuniorEmployee(String name, String address, String phone, double salaryPerMonth){		
		try {
			Junior junior = new Junior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateJunior());
			repository.addMember(junior);
			junior.pay();
		}catch (SalaryException e) {
			System.err.println(e.getMessage());
		}catch(CamposVacios e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void createVolunteer(String name, String address, String phone, String description, double ayuda){		
		try {
			Volunteer volunteer = new Volunteer(name, address, phone, description, ayuda);
			repository.addMember(volunteer);
		} catch (SalaryException e) {
			System.err.println(e.getMessage());
		}catch(CamposVacios e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void payAllEmployeers() {
		// TODO Auto-generated method stub
		List<AbsStaffMember> members=repository.getAllMembers();
		
		for(AbsStaffMember miembro : members) {			
			miembro.pay();
		}
		
	}
	

	public String getAllEmployees() {
		
		//String allEmployes="";
		
		List<AbsStaffMember> allMembers=repository.getAllMembers();
		
		StringBuffer res= new StringBuffer(); //--> para evitar hacer el + (allEmployes += employee + " \n")
		//es mejor opción
		
		for(AbsStaffMember employee: allMembers) {			
			
			res.append(employee);
			
			//allEmployes += employee + " \n";
					
		}
		return res.toString(); //allEmployes;
	}
	
	public void Bonus() {
		List <AbsStaffMember> staffList = repository.getAllMembers();
		
		for (AbsStaffMember e: staffList) {
			
			//aplicar el bonus a todos menos al volunteer!!!
			if(e.getClass()==Employee.class) {
				((Employee)e).Bonus();
			}
		}	
	}
	
}
