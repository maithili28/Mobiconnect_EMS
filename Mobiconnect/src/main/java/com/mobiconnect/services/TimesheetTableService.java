package com.mobiconnect.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mobiconnect.entities.TimesheetTable;
import com.mobiconnect.repositories.TimesheetTableRepository;

@Component
public class TimesheetTableService {
    @Autowired
    private TimesheetTableRepository timesheetTableRepository;

     //get all timesheet
    public List<TimesheetTable> getAllTimesheet()
    {
        List<TimesheetTable>list=(List<TimesheetTable>)this.timesheetTableRepository.findAll();
        return list;
    }


     //get single leave by id
     public TimesheetTable getTimesheetById(int id)
     {
         TimesheetTable timesheetTable=null;
         try{
         timesheetTable=this.timesheetTableRepository.findById(id);
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return timesheetTable;
     }
  
 
      //adding the timesheet
      public TimesheetTable addTimesheet(TimesheetTable t1)
      {
          TimesheetTable result=timesheetTableRepository.save(t1);
          return result;
      }
 
 
 
       //delete the leave
     public void deleteTimesheet(int tid)
     {
     
       timesheetTableRepository.deleteById(tid);
     }
 
     //update the leave
     public void updateTimesheet(TimesheetTable timesheetTable,int timesheetId)
     {
         timesheetTable.setId(timesheetId);
         timesheetTableRepository.save(timesheetTable);
     }
}
