package io.a3ammari.controller;

import io.a3ammari.model.Command;
import io.a3ammari.model.Position;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PositionController {

    private Logger logger = LoggerFactory.getLogger(PositionController.class);
    @PostMapping("/evaluate")
    public ResponseEntity<Position> evaluateEndpoint(@RequestBody String commands){
        final String TAG = "evaluateEndpoint ";
        logger.debug(TAG+commands);
        Position position = null;
        var lines = commands.lines().map(String::trim).toList();
        logger.debug(TAG+ "number of lines = "+lines.size());
        var cmd = commands.lines().map(String::trim).map(Command::parse).toList();
        for (Command c:
             cmd) {
            position = c.execute(position);
        }
        return ResponseEntity.ok(position);
    }

}
