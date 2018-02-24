package five.principle.Dimite;

public class Client {

    public static void main(String[] args) {

        CompanyManager e = new CompanyManager();
        e.printAllEmployee(new SubCompanyManager());
    }
}
