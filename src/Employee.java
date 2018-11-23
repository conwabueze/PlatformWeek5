public class Employee {
    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;
    private double basicSalary;
    private double specialAllowance;
    private double Hra;

    public Employee() {
    }

    public Employee(long Id, String Name, String address, long phone) {
        employeeId = Id;
        employeeName = Name;
        employeeAddress = address;
        employeePhone = phone;
    }

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
        specialAllowance = 250.80;
        Hra = 1000.50;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public long getEmployeePhone() {
        return employeePhone;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getSpecialAllowance() {
        return specialAllowance;
    }

    public double getHra() {
        return Hra;
    }

    public void calculateSalary(){
        double salary = basicSalary + (basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
        System.out.println("Salary: " + salary);
    }

    public void calculateTransportAllowance(){
        System.out.println(10.0/100.0*basicSalary);
    }


}
