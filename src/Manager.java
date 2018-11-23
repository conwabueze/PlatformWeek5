public class Manager extends Employee {

    public Manager() {
    }

    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

    @Override
    public void calculateTransportAllowance(){
        double allowance = (15.0/100.0)*getBasicSalary();
        System.out.println(allowance);
    }


}
