package bt.app.casino.controller.poker;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/poker")
public class PokerController {
    /*
     * 
     * const card = require('./card');
const player = require("./player");
const playerHand = require('./playerHand');
const DeckOfCards = require("./DeckOfCards");
const { pokerGame, getAllPlayers} = require("./pokerGame");
const pokerHand = require("./pokerHand");
const handEvaluator = require("./handEvaluator");
     */

    @GetMapping(path="/card")
    public ResponseEntity<String> dealCard(){
        return ResponseEntity
            .status(HttpStatus.OK)
            .contentType(MediaType.APPLICATION_JSON)
            .body("{}");
    }

    @GetMapping(path="/mybets")
    public ResponseEntity<String> getMyCurrentBets(){
        return ResponseEntity
            .status(HttpStatus.OK)
            .contentType(MediaType.APPLICATION_JSON)
            .body("{bets: 3000}");
    }

    @PostMapping(path="/fold", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> foldCard(@RequestBody String json){
        System.out.println(json);
        return ResponseEntity
            .status(HttpStatus.OK)
            .contentType(MediaType.APPLICATION_JSON)
            .body("{foldstatus: done}");
    }

}
