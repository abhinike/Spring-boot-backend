package com.example.VeckorVorker.api;

import com.example.VeckorVorker.model.Worker;
import com.example.VeckorVorker.serviecs.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("api/v2/workers")
@RestController
public class WorkerController {

    @Autowired
    private final WorkerService workerService ;

    public WorkerController( WorkerService workerService) {
        this.workerService = workerService;
    }

    //get request
    @GetMapping
    List<Worker> getWorkers(){
        return workerService.getWorkers();
    }


    @PostMapping
    String postWorker(@RequestBody Worker worker){
        workerService.addWorker(worker);
        return "added succesfully";
    }




}
