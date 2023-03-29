package com.mobiconnect.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mobiconnect.entities.LeaveTable;

public interface LeaveTableRepository extends CrudRepository<LeaveTable,Integer>{
    public LeaveTable findById(int id);

    public void save(int leaveId);
}