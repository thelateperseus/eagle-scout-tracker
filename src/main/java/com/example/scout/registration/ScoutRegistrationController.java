package com.example.scout.registration;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/scouts")
class ScoutRegistrationController {
    private final ScoutRepository repository;

    ScoutRegistrationController(ScoutRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    ScoutRegistrationResponse register(@RequestBody ScoutRegistrationRequest request) {
        Scout newScout = repository.save(new Scout(null, request.name(), request.email(), request.birthDate()));
        return new ScoutRegistrationResponse(newScout.id());
    }
}
