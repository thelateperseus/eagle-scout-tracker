package com.example.scout;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

/** Verifying modulithic structure and creating documentation for {@link ApplicationModules}. */
class ModularityTests {

    ApplicationModules modules = ApplicationModules.of(ScoutApplication.class);

    @Test
    void verifiesArchitecture() {

        System.out.println(modules);

        modules.verify();
    }

    @Test
    void createDocumentation() {
        new Documenter(modules).writeDocumentation();
    }
}
