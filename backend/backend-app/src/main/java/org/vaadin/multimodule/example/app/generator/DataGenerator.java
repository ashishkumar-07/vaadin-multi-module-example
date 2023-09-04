package org.vaadin.multimodule.example.app.generator;

import org.springframework.stereotype.Component;
import org.vaadin.multimodule.example.backend.entity.SamplePerson;
import org.vaadin.multimodule.example.backend.service.SamplePersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Component
public class DataGenerator {

    @Bean
    public CommandLineRunner loadData(SamplePersonRepository samplePersonRepository) {
        return args -> {
            Logger logger = LoggerFactory.getLogger(getClass());
            if (samplePersonRepository.count() != 0L) {
                logger.info("Using existing database");
                return;
            }
            int seed = 123;

            logger.info("Generating demo data");

            logger.info("... generating 100 Sample Person entities...");

            SamplePerson samplePerson = new SamplePerson();
            samplePerson.setFirstName("Sample");
            samplePerson.setLastName("Data");
            samplePersonRepository.save(samplePerson);
        };
    }

}