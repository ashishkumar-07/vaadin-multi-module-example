package org.vaadin.multimodule.example.app.controller;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vaadin.multimodule.example.backend.entity.SamplePerson;
import org.vaadin.multimodule.example.backend.service.SamplePersonService;

import java.util.List;

@RestController
@RequestMapping("/persons")

public class PersonController {

    private final SamplePersonService samplePersonService;

    public PersonController(SamplePersonService samplePersonService) {
        this.samplePersonService = samplePersonService;
    }

    @GetMapping
    public Page<SamplePerson> getAllPerson(){
        return samplePersonService.list(Pageable.ofSize(10).withPage(0));
    }
}
