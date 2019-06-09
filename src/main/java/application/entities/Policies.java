package application.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer sum;

    private Integer client_id;

    private Integer employee_id;

    private Integer insurance_type_id;

    private Integer insurance_case_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
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
