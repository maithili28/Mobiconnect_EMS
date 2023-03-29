package com.mobiconnect.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mobiconnect.entities.TimesheetDayTable;

public interface TimesheetDayTableRepository extends CrudRepository<TimesheetDayTable,Integer>{
    public TimesheetDayTable findById(int id);

    public void save(int timesheetDayId);
}