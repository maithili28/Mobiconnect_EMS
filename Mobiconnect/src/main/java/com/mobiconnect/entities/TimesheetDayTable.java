package com.mobiconnect.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "timesheetday_tbl")
public class TimesheetDayTable {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    private int id;
    private String day1;
    private String day2;
    private String day3;
    private String day4;
    private String day5;
    private String day6;
    private String day7;
    private String week;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_table_id")
    private ProjectTable projectTable;
    // @OneToMany(mappedBy = "timesheetTable")
    // @JoinColumn(name = "timesheet_table_id")
    // private TimesheetTable timesheetTable;

    
}

