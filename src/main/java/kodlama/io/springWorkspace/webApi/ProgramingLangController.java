package kodlama.io.springWorkspace.webApi;

import kodlama.io.springWorkspace.business.abstracts.ProgramingLangService;
import kodlama.io.springWorkspace.entities.concretes.ProgramingLang;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/langs")
public class ProgramingLangController {
    private ProgramingLangService programingLangService;

    public ProgramingLangController(ProgramingLangService programingLangService) {
        this.programingLangService = programingLangService;
    }

    @GetMapping("/getall")
    public List<ProgramingLang> getAll(){
        return this.programingLangService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public ProgramingLang getById(@PathVariable() int id){
        return this.programingLangService.getById(id);
    }

    @PostMapping("/create")
    public void create(ProgramingLang programingLang){
        this.programingLangService.create(programingLang);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id,ProgramingLang programingLang){
        this.programingLangService.update(id, programingLang);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        this.programingLangService.delete(id);
    }
}
