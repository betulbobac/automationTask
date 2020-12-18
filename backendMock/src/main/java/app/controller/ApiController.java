package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import app.repo.BookRepository;

@RestController
public class ApiController {

    @Autowired
    private BookRepository bookRepository;
    @GetMapping("/api/books")
    ResponseEntity getBooks(@RequestParam (value ="id",required = false) Integer id){
        if(id == null) {
            return new ResponseEntity(bookRepository.generateResponse(id), HttpStatus.OK);
        }


        else if( id==1 || id ==2) {
            return new ResponseEntity(bookRepository.generateResponse(id), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
