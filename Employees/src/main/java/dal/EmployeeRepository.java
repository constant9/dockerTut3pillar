package dal;


import model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends
        MongoRepository<Employee, String> {

}
