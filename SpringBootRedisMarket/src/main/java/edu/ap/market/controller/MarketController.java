package edu.ap.market.controller;

import edu.ap.market.model.Product;
import edu.ap.market.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;


@Controller
@Scope("session")
public class MarketController {

    private RedisService service; // pattern : "products":name:weight:amount
    private static ArrayList<String> answers = new ArrayList<String>();
    
    static{
    answers.add("It is certain.");
    answers.add("Signs point to yes.");
    answers.add("Concentrate and ask again.");
    answers.add("Very doubtful.");
    }
    @Autowired
    public void setRedisService(RedisService service) {
        this.service = service;
    }

    public MarketController() {
 }
  

    @RequestMapping("/")
    public String root() {
        return "askEightBall";
    }

    @GetMapping("/askEightBall")
    public String askEightBall() {
        return "askEightBall";
    }


    @RequestMapping("/getAnswer")
    @ResponseBody
    public String listProductsByName(
                                       ) {
                                   
       return "Yes for certain!";
    }


}
