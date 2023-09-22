package com.example.VeckorVorker.serviecs;

import com.example.VeckorVorker.dao.WorkerDao;
import com.example.VeckorVorker.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class WorkerService {
    @Autowired
    private final WorkerDao workerDao;


    public WorkerService(@Qualifier("fakeDao") WorkerDao workerDao) {
        this.workerDao = workerDao;
    }

    public void addWorker(Worker worker){
        workerDao.insertWorker(worker);
    }

    public List<Worker> getWorkers(){
        return workerDao.getWorkers();
    }


    public Optional<Worker> getWorkerById(UUID uid){
        return workerDao.getWorkerByID(uid);
    }

    public int updateWorkerById(UUID uid, Worker worker){
        return workerDao.updateWorkerByID(uid, worker);
    }


    public String deleteUserById(UUID uid){
        int ans =  workerDao.deleteWorker(uid);

        if(ans == 1) return "deleted succesfully";
        else return "not found";
    }



}
