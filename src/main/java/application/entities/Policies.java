package application.entities;

import javax.persistence.*;

@Entity
public class Policies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;

    private Integer sum;

    private Integer clientId;

    private Integer employeeId;

    private Integer insurance_type_id;

    private Integer insurance_case_id;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getInsurance_type_id() {
        return insurance_type_id;
    }

    public void setInsurance_type_id(Integer insurance_type_id) {
        this.insurance_type_id = insurance_type_id;
    }

    public Integer getInsurance_case_id() {
        return insurance_case_id;
    }

    public void setInsurance_case_id(Integer insurance_case_id) {
        this.insurance_case_id = insurance_case_id;
    }
}
