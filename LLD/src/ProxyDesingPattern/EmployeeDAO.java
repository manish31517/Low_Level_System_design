package ProxyDesingPattern;

public interface EmployeeDAO {
    public void create (String client, Employee employee) throws Exception;
    public  void delete (String client, int employeeId) throws  Exception;

    public  Employee get(String client, int employeeId) throws Exception;

}
