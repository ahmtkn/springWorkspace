package kodlama.io.springWorkspace.business.abstracts;

import kodlama.io.springWorkspace.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.springWorkspace.business.responses.GetAllProgrammingLanguageResponse;
import kodlama.io.springWorkspace.entities.concretes.ProgrammingLanguage;
import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllProgrammingLanguageResponse> getAll();
    GetAllProgrammingLanguageResponse getById(int id);
    void create(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
    void update(int id, CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
    void delete(int id);
}
