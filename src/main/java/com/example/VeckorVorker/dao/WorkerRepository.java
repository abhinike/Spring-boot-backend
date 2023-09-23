package com.example.VeckorVorker.dao;

import com.example.VeckorVorker.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  WorkerRepository extends JpaRepository<Worker, Long> {
}
