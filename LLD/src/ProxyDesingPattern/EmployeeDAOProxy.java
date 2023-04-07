package ProxyDesingPattern;

import java.util.Objects;

public class EmployeeDAOProxy implements EmployeeDAO{
    EmployeeDAOImpl employeeDAOImpl;

    public EmployeeDAOProxy() {
        this.employeeDAOImpl = employeeDAOImpl;
    }

    @Override
    public void create(String client, Employee employee) throws Exception{
         if(client.equals("Admin")){
             employeeDAOImpl.create(client,employee);
             return;
       }
         throw  new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
         if(client.equals("Admin")){
             employeeDAOImpl.delete(client,employeeId);
             return;
         }
         throw  new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client.equals("Admin") || client.equals("Client")){
            return employeeDAOImpl.get(client,employeeId);
        }
        throw  new Exception("Access Denied");
    }
}
