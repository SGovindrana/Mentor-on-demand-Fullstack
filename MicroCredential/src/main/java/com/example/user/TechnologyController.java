package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
//@RequestMapping({"/api"})
@RequestMapping({"/technologys"})
public class TechnologyController {

    @Autowired
    private TechnologyService TechnologyService;

    @PostMapping
    public Technology create(@RequestBody Technology technology){
        return TechnologyService.create(technology);
    }

    @GetMapping(path = {"/{id}"})
    public Technology findOne(@PathVariable("id") int id){
        return TechnologyService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Technology update(@PathVariable("id") int id, @RequestBody Technology technology){
    	technology.setId(id);
        return TechnologyService.update(technology);
    }

    @DeleteMapping(path ={"/{id}"})
    public Technology delete(@PathVariable("id") int id) {
        return TechnologyService.delete(id);
    }

    @GetMapping
    public List<Technology> findAll(){
        return TechnologyService.findAll();
    }
    
   
}
