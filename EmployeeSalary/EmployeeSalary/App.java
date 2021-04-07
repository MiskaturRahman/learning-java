import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        String userInputString;
        String employeeName;
        double employeeSalary;
        String outputString;

        employeeName = JOptionPane.showInputDialog("Name of the employee: ");
        userInputString = JOptionPane.showInputDialog("Enter the salary amount of " + employeeName + ": ");
        employeeSalary = Double.parseDouble(userInputString);

        exceeds_employee employee1 = new exceeds_employee(employeeName, employeeSalary);
        employee1.setName(employeeName);
        employee1.setSalary(employeeSalary);
        employeeSalary = employee1.SalaryAfterIncrement();

        outputString = String.format("%s has a total salary with increment of $%,.2f", employee1.getName(),
                employeeSalary);
        JOptionPane.showMessageDialog(null, outputString);
        System.exit(0);
    }
}
