package com.ars.book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/b")
public class Controller {
    BookRepository bookRepository;

    @RequestMapping( method = RequestMethod.GET)
    public List<Book> getAll(){
        return bookRepository.findAll();
    }
//    public String getAll(){
//        return "sdadjlhlsldkfnknl";
//    }

}

