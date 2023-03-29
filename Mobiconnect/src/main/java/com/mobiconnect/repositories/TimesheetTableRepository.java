package com.mobiconnect.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mobiconnect.entities.TimesheetTable;

public interface TimesheetTableRepository extends CrudRepository<TimesheetTable,Integer>{
    public TimesheetTable findById(int id);

    public void save(int timesheetId);
}