package com.hng.task1.demo.controllers;

import com.hng.task1.demo.models.BasicInformationDTO;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class BasicInformationController {
  @GetMapping
  public BasicInformationDTO getBasicInformation() {

    return new BasicInformationDTO(
        "daniel.oyagha@gmail.com",
        DateTimeFormatter.ISO_INSTANT.format(Instant.now()),
        "https://github.com/dyagzy/hng-12-stage-0-task-1-java-api");
  }
}
