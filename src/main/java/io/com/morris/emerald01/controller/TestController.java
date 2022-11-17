package io.com.morris.emerald01.controller;

import io.com.morris.emerald01.model.Position;
import io.com.morris.emerald01.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/test")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @GetMapping("/framework/{name}")
    public ResponseEntity<?> framework(@PathVariable String name) {
        logger.info("Path Variable={}", name);
        return ResponseEntity.ok("Framework: " + name);
    }

    @CrossOrigin
    @GetMapping("/positions")
    public Position getAllPositions() {
        ArrayList<String> positionsList = new ArrayList<>();
        positionsList.add("Gardener");
        positionsList.add("Shop-Keeper");
        positionsList.add("Cleaner");
        positionsList.add("Software Engineer");
        positionsList.add("Sanitary Engineer");
        positionsList.add("Construction engineer");
        logger.info("Test Controller Positions list = {}", positionsList);

        positionsList.forEach((position) -> {
            if (testService.isEngineeringPosition(position)) {
                logger.info("{} is a engineering position", position);
            } else {
                logger.info("{} is not an engineering position", position);
            }
        });
        return new Position(positionsList);
    }
}
