package com.example.scout.award;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/awards")
class AwardController {
    private final AwardRepository repository;

    AwardController(AwardRepository repository) {
        this.repository = repository;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    CreateAwardResponse create(@RequestBody CreateAwardRequest request) {
        Award newAward = repository.save(new Award(null, request.scoutId(), request.badgeId(), request.dateAwarded()));
        return new CreateAwardResponse(newAward.id());
    }
}
