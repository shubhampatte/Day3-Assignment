public class EmployeeWage {

	public static void main(String[] args) {

		int T_days = 20;
		int EMP_WAGE_PER_HR = 20;
		int Max_Work_HR = 100;
		int TotalWorkHrs = 0;
		int TotalWorkDay = 0;
		int TotalSalary = 0;
		int EmpWage = 0;
		int WORKING_HRS = 0;

		while (TotalWorkDay <= T_days && TotalWorkHrs <= Max_Work_HR)
		 {

			 TotalWorkDay++;
                         System.out.println("TotalWorkDay:" + TotalWorkDay);

			int attendance =  (int) Math.floor(Math.random() * 10) % 3; 
			System.out.println("Attendence : " + attendance);

			switch (attendance) {
				case 1:
					 WORKING_HRS = 16;
					System.out.println("Full time wage : "+WORKING_HRS);
				break;
				case 2:
					 WORKING_HRS = 8;
					System.out.println("Part time wage : " +WORKING_HRS);
				break;
				default:
					 WORKING_HRS = 0;
					System.out.println("employee is absent : " +WORKING_HRS);

			}
				TotalWorkHrs = TotalWorkHrs + WORKING_HRS;
				System.out.println("TotalWorkHrs : " + TotalWorkHrs);

		 }


		 TotalSalary = TotalWorkHrs * EMP_WAGE_PER_HR;
		System.out.println("TotalSalary : " + TotalSalary);

	}


}
