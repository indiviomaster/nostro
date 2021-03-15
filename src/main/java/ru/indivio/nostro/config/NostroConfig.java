package ru.indivio.nostro.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.indivio.nostro.entity.Rover;
import ru.indivio.nostro.repository.RoverRepository;

@Configuration  //- конфигурация контекста
@Slf4j
public class NostroConfig {

    @Bean
    //Предварительно конфигурируем систему
    //CommandLineRunner запускается после старта сервиса
    public CommandLineRunner loadService(RoverRepository roverRepository){
        return  args->{
            log.info("Загрузка данных. Load data.");
            log.info("Добавлен {}", roverRepository.save(new Rover("Rover1","1")));
            log.info("Добавлен {}", roverRepository.save(new Rover("Rover2","2")));
            log.info("Добавлен {}", roverRepository.save(new Rover("Rover3","3")));
            log.info("Данные загружены.");
        };
    }

    @Bean

    public CommandLineRunner loadService2(RoverRepository roverRepository){
        return  args->{
            log.info("Добавлен {}", roverRepository.save(new Rover("Rover4","1")));
            log.info("Добавлен {}", roverRepository.save(new Rover("Rover5","2")));
            log.info("Добавлен {}", roverRepository.save(new Rover("Rover6","3")));
            log.info("Данные загружены.");
        };
    }

}
