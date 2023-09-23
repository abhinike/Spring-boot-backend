package com.example.VeckorVorker.serviecs;

import com.example.VeckorVorker.dao.WorkerRepository;
import com.example.VeckorVorker.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerSQLService {


    WorkerRepository repository;

    @Autowired
    public WorkerSQLService(WorkerRepository repository) {
        this.repository = repository;
    }

    public Worker saveEntity(Worker entity) {
        return repository.save(entity);
    }

    public List<Worker> getAllWorkers(){
        return repository.findAll();
    };

    public void deleteWorkerbyID(int id) {
        repository.deleteById(id);
    }

    public Optional<Worker> getWorkerById(int id){
       return repository.findById(id);
    }

    public Page<Worker> workersByPage(int page, int size){
        PageRequest pageRequest = PageRequest.of(page, size);
        return repository.findAll(pageRequest);
    }


    //update worker
    public Optional<Worker> updateWorker(int id, Worker worker){

        Optional<Worker> existingWorker = repository.findById(id);

        if(!existingWorker.isEmpty()){
            //updates fields
            existingWorker.get().setName(worker.getName());
            existingWorker.get().setCategory(worker.getCategory());

        }
        return existingWorker;

    }
    //filter by electrician
//    public Pgae<Worker> filterByCategory(int category)
}
