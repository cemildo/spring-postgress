package ch.cdogan.edu.spring.webprojects;

/**
 * Created by Dogan on 06.11.16.
 */
import ch.cdogan.edu.spring.Entities.Person;
import ch.cdogan.edu.spring.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@Controller
@RequestMapping("/person")
public class GreetingController {

    @Autowired private PersonRepository personRepository;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ModelAttribute("persons")
    public Iterable<Person> getAll(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return personRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ModelAttribute("persons")
    public Iterable<Person> create(@RequestBody Person person) {
        personRepository.save(person);
        return personRepository.findAll();
    }

}
