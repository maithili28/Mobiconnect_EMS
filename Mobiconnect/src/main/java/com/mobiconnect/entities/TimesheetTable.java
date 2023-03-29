package com.mobiconnect.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@Data
@ToString
@Entity
@Table(name = "timesheet_tbl")
public class TimesheetTable {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;
    private String start_date;
    private String end_date;
    private String total_hours;
    private String leave_hours;
    private String holiday_hours;
    private String approver;
    private String status;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_table_id")
    private EmployeeTable employeeTable;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "timesheet_day_table_id")
    private TimesheetDayTable timesheetDayTable;

    
}
