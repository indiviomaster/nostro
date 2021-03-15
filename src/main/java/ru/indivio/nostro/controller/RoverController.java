package ru.indivio.nostro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.indivio.nostro.entity.Rover;
import ru.indivio.nostro.service.RoverService;

import java.util.List;

@RestController
@Slf4j
public class RoverController {

    private final RoverService roverService;
    @Autowired
    public RoverController(RoverService roverService) {
        this.roverService = roverService;
    }

    @RequestMapping(value="/rover/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Rover> getAllRovers(){

        return roverService.getAllRover();
    }
}
