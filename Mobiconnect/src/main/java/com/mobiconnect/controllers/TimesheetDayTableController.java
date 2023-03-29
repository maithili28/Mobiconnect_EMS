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

import com.mobiconnect.entities.TimesheetDayTable;
import com.mobiconnect.entities.TimesheetTable;
import com.mobiconnect.services.TimesheetDayTableService;

@RestController
public class TimesheetDayTableController {
    @Autowired
    private TimesheetDayTableService timesheetDayTableService;


     //get all time
     @GetMapping("/timesheetday")
     public ResponseEntity<List<TimesheetDayTable>> getTimesheetday()
    {
        List<TimesheetDayTable>list=timesheetDayTableService.getAllTimesheetday();
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

     //get single timesheetday
     @GetMapping("/timesheetday/{id}")
     public ResponseEntity<TimesheetDayTable> getTimesheetDay(@PathVariable("id")int id)
     {
         TimesheetDayTable timesheetDayTable=timesheetDayTableService.getTimesheetDayById(id);
         if(timesheetDayTable==null)
         {
             return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
         }
         return ResponseEntity.of(Optional.of(timesheetDayTable));
     }
 
 
     //add timesheetdaytable
     @PostMapping("/timesheetday")
     public ResponseEntity<Optional<TimesheetDayTable>> addTimesheetDay(@RequestBody TimesheetDayTable timesheetDayTable)
     {
         TimesheetDayTable tsd=null;
        try{
             tsd=this.timesheetDayTableService.addTimesheetDay(timesheetDayTable);
             System.out.println(timesheetDayTable);
             return ResponseEntity.ok(Optional.of(tsd));
        }
        catch(Exception e)
        {
             e.printStackTrace();
             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
     }
 
 
     //delete leave
     @DeleteMapping("/timesheetday/{timesheetDayId}")
     public ResponseEntity<Void> deleteTimesheetDay(@PathVariable("timesheetDayId")int timesheetDayId)
     {
        try{
         this.timesheetDayTableService.deleteTimesheetDay(timesheetDayId);
         return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch(Exception e){
             e.printStackTrace();
             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
     }
 
      //update leave
      @PutMapping("/timesheetday/{timesheetDayId}")
      public ResponseEntity<TimesheetDayTable>updateTimesheetDay(@RequestBody TimesheetDayTable timesheetDayTable, @PathVariable("timesheetDayId")int timesheetDayId)
      {
          try{
             this.timesheetDayTableService.updateTimesheetDay(timesheetDayTable,timesheetDayId);
             return ResponseEntity.ok().body(timesheetDayTable);
          }
          catch(Exception e)
          {
              e.printStackTrace();
              return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
          }
      }
}