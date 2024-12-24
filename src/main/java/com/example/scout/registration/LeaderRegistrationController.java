package com.example.scout.registration;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/leaders")
class LeaderRegistrationController {
    private final LeaderRepository repository;

    LeaderRegistrationController(LeaderRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    RegisterLeaderResponse register(@RequestBody RegisterLeaderRequest request) {
        Leader newLeader = repository.save(new Leader(null, request.name(), request.email()));
        return new RegisterLeaderResponse(newLeader.id());
    }
}
