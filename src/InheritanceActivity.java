public class InheritanceActivity {

    public static void main(String[] args) {
        Manager one = new Manager(126534, "Peter", "Chennai India", 237844, 65000);

        one.calculateSalary();

        Trainee two  = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        two.calculateSalary();

        one.calculateTransportAllowance();
        two.calculateTransportAllowance();
        //System.out.println(one.getBasicSalary());
    }
}
