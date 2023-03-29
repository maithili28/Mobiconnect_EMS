package com.mobiconnect.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mobiconnect.entities.TimesheetDayTable;
import com.mobiconnect.repositories.TimesheetDayTableRepository;

@Component
public class TimesheetDayTableService {
    @Autowired
    private TimesheetDayTableRepository timesheetDayTableRepository;

     //get all timesheetday
    public List<TimesheetDayTable> getAllTimesheetday()
    {
        List<TimesheetDayTable>list=(List<TimesheetDayTable>)this.timesheetDayTableRepository.findAll();
        return list;
    }


     //get single leave by id
     public TimesheetDayTable getTimesheetDayById(int id)
     {
         TimesheetDayTable timesheetDayTable=null;
         try{
         timesheetDayTable=this.timesheetDayTableRepository.findById(id);
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return timesheetDayTable;
     }
  
 
      //adding the timesheet
      public TimesheetDayTable addTimesheetDay(TimesheetDayTable t1)
      {
          TimesheetDayTable result=timesheetDayTableRepository.save(t1);
          return result;
      }
 
 
 
       //delete the leave
     public void deleteTimesheetDay(int tid)
     {
     
       timesheetDayTableRepository.deleteById(tid);
     }
 
     //update the leave
     public void updateTimesheetDay(TimesheetDayTable timesheetDayTable,int timesheetDayId)
     {
         timesheetDayTable.setId(timesheetDayId);
         timesheetDayTableRepository.save(timesheetDayTable);
     }
}