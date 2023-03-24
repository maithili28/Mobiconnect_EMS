package com.mobiconnect.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mobiconnect.entities.ClientTable;
import com.mobiconnect.repositories.ClientTableRepository;

@Component
public class ClientTableService {
    
    @Autowired
    private ClientTableRepository clientTableRepository;


    //get all clients
    public List<ClientTable> getAllClient()
    {
        List<ClientTable>list=(List<ClientTable>)this.clientTableRepository.findAll();
        return list;
    }

     //get single client by id
    public ClientTable getClientById(int id)
    {
        ClientTable clientTable=null;
        try{
        clientTable=this.clientTableRepository.findById(id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return clientTable;
    }


     //adding the client
     public ClientTable addClient(ClientTable c)
     {
         ClientTable result=clientTableRepository.save(c);
         return result;
     }

     //delete client
    public void deleteClient(int cid) {
        clientTableRepository.deleteById(cid);
    }

    //update the client
    public void updateClient(ClientTable clientTable,int clientId)
    {
        clientTable.setId(clientId);
        clientTableRepository.save(clientTable);
    }
}
