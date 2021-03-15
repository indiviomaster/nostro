package ru.indivio.nostro.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.indivio.nostro.entity.Rover;
import ru.indivio.nostro.repository.RoverRepository;

import java.util.List;
@Slf4j
@Service //это бизнес единица scope->singletone,
// можно аннотировать как @Component - для вспомогательной единицы (Sheduller)
public class RoverService{

    private final RoverRepository roverRepository;
    @Autowired
    public RoverService(RoverRepository roverRepository) {
        this.roverRepository = roverRepository;
    }

    public List<Rover> getAllRover(){
        log.info("Список Роверов запрошен метод getAllRover");
        return roverRepository.findAll();
    }
}
