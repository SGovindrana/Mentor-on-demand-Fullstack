package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
//@RequestMapping({"/api"})
@RequestMapping({"/skills"})
public class SkillController {

    @Autowired
    private SkillService skillService;

    @PostMapping
    public Skill create(@RequestBody Skill skill){
        return skillService.create(skill);
    }

    @GetMapping(path = {"/{id}"})
    public Skill findOne(@PathVariable("id") int id){
        return skillService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Skill update(@PathVariable("id") int id, @RequestBody Skill skill){
        skill.setId(id);
        return skillService.update(skill);
    }

    @DeleteMapping(path ={"/{id}"})
    public Skill delete(@PathVariable("id") int id) {
        return skillService.delete(id);
    }

    @GetMapping
    public List<Skill> findAll(){
        return skillService.findAll();
    }
}
