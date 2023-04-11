package kafka.producer.entity;


public class Employee {

    private String name;
    private String empId;
    private String birthDate ;

    public String getName() {
        return name;
    }

    public Employee() {
    }

    public Employee(String name, String empId, String birthDate) {
        this.name = name;
        this.empId = empId;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
