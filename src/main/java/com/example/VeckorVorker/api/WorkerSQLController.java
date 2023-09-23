package com.example.VeckorVorker.api;

import com.example.VeckorVorker.model.Worker;
import com.example.VeckorVorker.serviecs.WorkerSQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequestMapping(path = "api/v1/workers")
@RestController
public class WorkerSQLController {

    WorkerSQLService service ;

    @Autowired
    WorkerSQLController(WorkerSQLService service){
        this.service = service ;
    }

    @PostMapping
    Worker postWorker(@RequestBody Worker worker){
        return service.saveEntity(worker);
    }
//
//    @GetMapping
//    List<Worker> getMapping(){
//        return service.getAllWorkers();
//    }

    @GetMapping
    @RequestMapping(path = "{id}")
    Optional<Worker> getWorker(@PathVariable("id")  Long id){
        return service.getWorkerById(id);
    }


    @GetMapping
    List<Worker> getWorkerPerPage(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "2") int size){
        return service.workersByPage(page, size).getContent();
    }



}
