package com.mobiconnect.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mobiconnect.entities.LeaveTable;
import com.mobiconnect.repositories.LeaveTableRepository;

@Component
public class LeaveTableService {
    @Autowired
    private LeaveTableRepository leaveTableRepository;

     //get all leaves
    public List<LeaveTable> getAllLeave()
    {
        List<LeaveTable>list=(List<LeaveTable>)this.leaveTableRepository.findAll();
        return list;
    }

    
      //get single leave by id
      public LeaveTable getLeaveById(int id)
      {
          LeaveTable leaveTable=null;
          try{
          leaveTable=this.leaveTableRepository.findById(id);
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
          return leaveTable;
      }
   
  
       //adding the emp
       public LeaveTable addLeave(LeaveTable l1)
       {
           LeaveTable result=leaveTableRepository.save(l1);
           return result;
       }
  
  
  
        //delete the leave
      public void deleteLeave(int lid)
      {
      
        leaveTableRepository.deleteById(lid);
      }
  
      //update the leave
      public void updateLeave(LeaveTable leaveTable,int leaveId)
      {
          leaveTable.setId(leaveId);
          leaveTableRepository.save(leaveTable);
      }
}
