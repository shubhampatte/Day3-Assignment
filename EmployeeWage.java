public class EmployeeWage {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int T_days = 20;
		int EMP_WAGE_PER_HR = 20;
		int sumofsalary=0;
		int wage=0;
		for (int i=1;i<=T_days;i++) {
			int attendance =  (int) Math.floor(Math.random() * 10) % 3;
			if (attendance == IS_FULL_TIME) {
				int WORKING_HRS = 16;
				wage=EMP_WAGE_PER_HR * WORKING_HRS;
				sumofsalary = sumofsalary + wage;
			}
			else if (attendance == IS_PART_TIME) {
				int WORKING_HRS = 8;
				wage=EMP_WAGE_PER_HR*WORKING_HRS;
				sumofsalary = sumofsalary + wage;
			}
			else {
				sumofsalary = sumofsalary + wage;
			}
		}
		System.out.println("total salary:" +sumofsalary);
	}


}
