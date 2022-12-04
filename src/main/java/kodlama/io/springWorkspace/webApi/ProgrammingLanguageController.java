package kodlama.io.springWorkspace.webApi;

import kodlama.io.springWorkspace.business.abstracts.ProgrammingLanguageService;
import kodlama.io.springWorkspace.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.springWorkspace.business.responses.GetAllProgrammingLanguageResponse;
import kodlama.io.springWorkspace.entities.concretes.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/langs")
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguageResponse> getAll(){
        return this.programmingLanguageService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public GetAllProgrammingLanguageResponse getById(@PathVariable() int id){
        return this.programmingLanguageService.getById(id);
    }

    @PostMapping("/create")
    public void create(CreateProgrammingLanguageRequest createProgrammingLanguageRequest){
        this.programmingLanguageService.create(createProgrammingLanguageRequest);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id, CreateProgrammingLanguageRequest createProgrammingLanguageRequest){
        this.programmingLanguageService.update(id, createProgrammingLanguageRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        this.programmingLanguageService.delete(id);
    }
}
