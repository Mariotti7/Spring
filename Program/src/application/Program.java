package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				System.out.println();
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idSalary = sc.nextInt();
		Employee emp = list.stream().filter(value -> value.getId() == idSalary).findFirst().orElse(null);
		if(emp == null) System.out.println("This id does not exist!");
		else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		for(Employee employee : list) {
			System.out.println(employee);
		}
	
		sc.close();
	}
	//Fun��o auxiliar para verificar se j� existe um ID
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(value -> value.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
