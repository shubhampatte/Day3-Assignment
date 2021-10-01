public class EmployeeWage {
	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_WAGE_PER_HR = 20;
		int attendance =  (int) Math.floor(Math.random() * 10) % 3;
		if (attendance == IS_FULL_TIME) {
			int WORKING_HRS = 16;
			int EmpWage = WORKING_HRS * EMP_WAGE_PER_HR;
			System.out.println("Full time wage :" +EmpWage);
		}
		else if (attendance == IS_PART_TIME) {
			int WORKING_HRS = 8;
			int EmpWage = WORKING_HRS * EMP_WAGE_PER_HR;
			System.out.println("Part time wage :" +EmpWage);
		}
		else {
			System.out.println("employee is absent");
		}
	}

}
