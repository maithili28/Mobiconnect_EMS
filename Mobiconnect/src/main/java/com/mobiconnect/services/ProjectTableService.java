package com.mobiconnect.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mobiconnect.entities.ProjectTable;
import com.mobiconnect.repositories.ProjectTableRepository;

@Component
public class ProjectTableService {
    @Autowired
    private ProjectTableRepository projectTableRepository;

     //get all projects
     public List<ProjectTable> getAllProjects()
     {
         List<ProjectTable>list=(List<ProjectTable>)this.projectTableRepository.findAll();
         return list;
     }
    

      //get single project by id
    public ProjectTable getProjectById(int id)
    {
        ProjectTable projectTable=null;
        try{
        projectTable=this.projectTableRepository.findById(id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return projectTable;
    }


     //adding the projects
     public ProjectTable addProject(ProjectTable p)
     {
         ProjectTable result=projectTableRepository.save(p);
         return result;
     }

      //delete the project
    public void deleteProject(int pid)
    {
        projectTableRepository.deleteById(pid);
    }


    public void updateProject(ProjectTable projectTable, int projectId) {
    }


    //update the project
    public void updateBook(ProjectTable projectTable,int projectId)
    {
        projectTable.setId(projectId);
        projectTableRepository.save(projectTable);
    }
}
