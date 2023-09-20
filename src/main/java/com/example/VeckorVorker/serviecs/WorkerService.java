package com.example.VeckorVorker.serviecs;

import com.example.VeckorVorker.dao.WorkerDao;
import com.example.VeckorVorker.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
