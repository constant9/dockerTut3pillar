package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
public class Employee {

    @Id
    private String id;

    private String email;
    private String fullName;
    private String managerEmail;


    //region ...getters/setters
    public String getId() {
        return id;
    }

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public Employee setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public Employee setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
        return this;
    }
    //endregion
}
