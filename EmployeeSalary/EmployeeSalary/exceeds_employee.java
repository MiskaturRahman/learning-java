public class exceeds_employee {
    private String name;
    private double Salary;
    private double annual_Increment;

    public void setName(String nameGiven) {
        name = nameGiven;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double SalaryGiven) {
        Salary = SalaryGiven;
    }

    public double getSalary() {
        return Salary;
    }

    public void setannual_Increment(double annual_IncrementRank) {
        annual_Increment = annual_IncrementRank;
    }

    public double getannual_Increment() {
        return annual_Increment;
    }

    public double SalaryAfterIncrement() {
        return Salary * annual_Increment + Salary;
    }

    public exceeds_employee(String employeeName, double salary) {
        name = employeeName;
        Salary = salary;
        annual_Increment = 0.05;

    }
}
