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
import com.mobiconnect.entities.LeaveTable;
import com.mobiconnect.services.LeaveTableService;

@RestController
public class LeaveTableController {
    @Autowired
    private LeaveTableService leaveTableService;


     //get all leaves
     @GetMapping("/leave")
     public ResponseEntity<List<LeaveTable>> getLeave()
    {
        List<LeaveTable>list=leaveTableService.getAllLeave();
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }


      //get single employee
    @GetMapping("/leave/{id}")
    public ResponseEntity<LeaveTable> getLeave(@PathVariable("id")int id)
    {
        LeaveTable leaveTable=leaveTableService.getLeaveById(id);
        if(leaveTable==null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(leaveTable));
    }


    //add leave
    @PostMapping("/leave")
    public ResponseEntity<Optional<LeaveTable>> addLeave(@RequestBody LeaveTable leaveTable)
    {
        LeaveTable lt=null;
       try{
            lt=this.leaveTableService.addLeave(leaveTable);
            System.out.println(leaveTable);
            return ResponseEntity.ok(Optional.of(lt));
       }
       catch(Exception e)
       {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
       }
    }


    //delete leave
    // @DeleteMapping("/leave/{leaveId}")
    // public ResponseEntity<Void> deleteLeave(@PathVariable("leaveId")int leaveId)
    // {
    //    try{
    //     this.leaveTableService.deleteLeave(leaveId);
    //     return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    //    }
    //    catch(Exception e){
    //         e.printStackTrace();
    //         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    //    }
    // }

     //update leave
     @PutMapping("/leave/{leaveId}")
     public ResponseEntity<LeaveTable>updateLeave(@RequestBody LeaveTable leaveTable, @PathVariable("leaveId")int leaveId)
     {
         try{
            this.leaveTableService.updateLeave(leaveTable,leaveId);
            return ResponseEntity.ok().body(leaveTable);
         }
         catch(Exception e)
         {
             e.printStackTrace();
             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
         }
     }
    
}
