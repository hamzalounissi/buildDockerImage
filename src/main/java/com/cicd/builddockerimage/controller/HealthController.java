package com.cicd.builddockerimage.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @Value("${com.cicd.buildDockerImage.version}")
    private String version;

    @Value("${com.cicd.environmentvar}")
    private String ENVIRONMENT_VAR;

    @GetMapping("/version")
    public ResponseEntity<?> version(){
        return ResponseEntity.ok(version);
    }

    @GetMapping("/environmentVar")
    public ResponseEntity<?> displayEnvironmentVar(){
        return ResponseEntity.ok(ENVIRONMENT_VAR);
    }
}
