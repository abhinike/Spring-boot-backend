package com.example.VeckorVorker.dao;

import com.example.VeckorVorker.model.Worker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeWokerDao implements WorkerDao {
    private static List<Worker> workerDB = new ArrayList<>();


    @Override
    public int insertWorker(UUID uid, Worker worker) {
        workerDB.add(new Worker(uid, worker.getName(), worker.getCategory()));

        return 1;

    }

    @Override
    public List<Worker> getWorkers() {
        return workerDB;
    }

    @Override
    public int  deleteWorker(UUID uid) {
        return 0;
    }

    @Override
    public Optional<Worker> getWorkerByID(UUID uid) {
        return workerDB.stream().filter(worker -> worker.getUid().equals(uid)).findFirst();
    }

    @Override
    public int updateWorkerByID(UUID uid, Worker worker) {
        return 0;
    }


//    @Override
//    public Optional<Worker> deleteWorker(UUID uid) {
//        workerDB.stream().remove(worker -> worker.getUid().equals(uid));
//    }


}
