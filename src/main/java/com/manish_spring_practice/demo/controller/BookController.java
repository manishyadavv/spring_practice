package com.manish_spring_practice.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*@Controller
public class BookController {


    @RequestMapping(path="/book", method= RequestMethod.GET)
    @ResponseBody
    public String getBookDetails(){
        return "Book details returned";
    }
}
Both above and below are same its just @RestController = @Controller + @ResponseBody
 */

@RestController
public class BookController {

    @GetMapping("/book")
    public String getBookDetails(){
        return "Book details returned";
    }
}
