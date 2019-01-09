package se.taco.smarthub.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    private static final Logger logger = LoggerFactory.getLogger(TemperatureController.class);


    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity cloudEvent(@RequestBody String body) {

        logger.info("body: {}", body);
        return new ResponseEntity(HttpStatus.OK);
    }

}
