package ProxyDesingPattern;

public class Client {
    public static void main(String [] args){
        try {
            EmployeeDAO employeeDAO = new EmployeeDAOProxy();
            employeeDAO.create("Cline", new Employee());
            System.out.println("Operation SuccessFull");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
