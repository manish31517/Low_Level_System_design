package ProxyDesingPattern;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void create(String client, Employee employee) throws Exception{
        System.out.println("New row is created");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
         System.out.println("Row is deleted");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Fetching data from api");
        return new Employee();
    }
}
