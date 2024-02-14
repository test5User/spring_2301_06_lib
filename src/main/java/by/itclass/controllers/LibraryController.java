package by.itclass.controllers;

import by.itclass.model.entities.Library;
import by.itclass.model.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LibraryController {
    private LibraryRepository repository;

    @Autowired
    public void setRepository(LibraryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String getAllLibraries(Model model) {
        var libraries = repository.findAll();
        model.addAttribute("libraries", libraries);
        return "index";
    }

    @GetMapping("/view/{id}")
    public String viewLibrary(
            @PathVariable(name = "id") int id,
            Model model) {
        var library = repository.findById(id).get();
        model.addAttribute("library", library);
        return "library";
    }

    @GetMapping("/add")
    public ModelAndView addLibrary() {
        return new ModelAndView("add-library", "library", new Library());
    }

    @PostMapping("/save")
    public String saveLibrary(@ModelAttribute(name = "library") Library library) {
        repository.save(library);
        return "redirect:/";
    }

    @GetMapping("/del/{id}")
    public String delLibrary(@PathVariable(name = "id") int id) {
        repository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public ModelAndView updateLibrary(@PathVariable(name = "id") int id) {
        var library = repository.findById(id).get();
        return new ModelAndView("upd-library", "library", library);
    }
}
