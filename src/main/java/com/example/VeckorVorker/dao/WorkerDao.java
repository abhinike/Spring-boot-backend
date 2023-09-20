package com.example.VeckorVorker.dao;

import com.example.VeckorVorker.model.Worker;

import java.util.List;
import java.util.UUID;

public interface WorkerDao {

    int insertWorker(UUID uid, Worker worker);

    default int insertWorker(Worker worker){
        UUID uid = UUID.randomUUID();
        return insertWorker(uid, worker);
    }

    List<Worker> getWorkers();






}
