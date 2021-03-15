package ru.indivio.nostro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.indivio.nostro.entity.Rover;

public interface RoverRepository extends JpaRepository <Rover, Long>{
}
