package com.mobiconnect.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobiconnect.entities.TimesheetTable;
import com.mobiconnect.services.TimesheetTableService;

@RestController
public class TimesheetTableController {
    @Autowired
    private TimesheetTableService timesheetTableService;


     //get all timesheet
     @GetMapping("/timesheet")
     public ResponseEntity<List<TimesheetTable>> getTimesheet()
    {
        List<TimesheetTable>list=timesheetTableService.getAllTimesheet();
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    
      //get single timesheet
      @GetMapping("/timesheet/{id}")
      public ResponseEntity<TimesheetTable> getTimesheet(@PathVariable("id")int id)
      {
          TimesheetTable timesheetTable=timesheetTableService.getTimesheetById(id);
          if(timesheetTable==null)
          {
              return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
          }
          return ResponseEntity.of(Optional.of(timesheetTable));
      }
  
  
      //add timesheettable
      @PostMapping("/timesheet")
      public ResponseEntity<Optional<TimesheetTable>> addTimesheet(@RequestBody TimesheetTable timesheetTable)
      {
          TimesheetTable ts=null;
         try{
              ts=this.timesheetTableService.addTimesheet(timesheetTable);
              System.out.println(timesheetTable);
              return ResponseEntity.ok(Optional.of(ts));
         }
         catch(Exception e)
         {
              e.printStackTrace();
              return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
         }
      }
  
  
      //delete leave
      @DeleteMapping("/timesheet/{timesheetId}")
      public ResponseEntity<Void> deleteTimesheet(@PathVariable("timesheetId")int timesheetId)
      {
         try{
          this.timesheetTableService.deleteTimesheet(timesheetId);
          return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
         }
         catch(Exception e){
              e.printStackTrace();
              return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
         }
      }
  
       //update leave
       @PutMapping("/timesheet/{timesheetId}")
       public ResponseEntity<TimesheetTable>updateTimesheet(@RequestBody TimesheetTable timesheetTable, @PathVariable("timesheetId")int timesheetId)
       {
           try{
              this.timesheetTableService.updateTimesheet(timesheetTable,timesheetId);
              return ResponseEntity.ok().body(timesheetTable);
           }
           catch(Exception e)
           {
               e.printStackTrace();
               return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
           }
       }
}