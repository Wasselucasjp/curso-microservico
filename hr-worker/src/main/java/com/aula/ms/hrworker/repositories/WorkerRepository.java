package com.aula.ms.hrworker.repositories;

import com.aula.ms.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
