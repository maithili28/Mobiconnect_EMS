package com.mobiconnect.entities;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_tbl")
public class EmployeeTable
{
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;
    private String name;
    private String email;
    private String contact;
    private String gender;
    private String dob;
    private String designation;
    private String address;
    private String work_location;
    private String date_of_joining;
    private String date_of_exit;
    private String manager;
    private String total_leaves;
    private String leave_balance;

    //getter-setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getWork_location() {
        return work_location;
    }
    public void setWork_location(String work_location) {
        this.work_location = work_location;
    }
    public String getDate_of_joining() {
        return date_of_joining;
    }
    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
    }
    public String getDate_of_exit() {
        return date_of_exit;
    }
    public void setDate_of_exit(String date_of_exit) {
        this.date_of_exit = date_of_exit;
    }
    public String getManager() {
        return manager;
    }
    public void setManager(String manager) {
        this.manager = manager;
    }
    public String getTotal_leaves() {
        return total_leaves;
    }
    public void setTotal_leaves(String total_leaves) {
        this.total_leaves = total_leaves;
    }
    public String getLeave_balance() {
        return leave_balance;
    }
    public void setLeave_balance(String leave_balance) {
        this.leave_balance = leave_balance;
    }

    //constructor
    public EmployeeTable(int id, String name, String email, String contact, String gender, String dob,
            String designation, String address, String work_location, String date_of_joining, String date_of_exit,
            String manager, String total_leaves, String leave_balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.gender = gender;
        this.dob = dob;
        this.designation = designation;
        this.address = address;
        this.work_location = work_location;
        this.date_of_joining = date_of_joining;
        this.date_of_exit = date_of_exit;
        this.manager = manager;
        this.total_leaves = total_leaves;
        this.leave_balance = leave_balance;
    }

    //many to many mapping
    @ManyToMany( cascade = CascadeType.ALL,mappedBy = "employeeTable")
	private List<ProjectTable>projectTable;

    //default constructor
    public EmployeeTable()
    {
        
    }
}
