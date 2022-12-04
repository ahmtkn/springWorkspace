package kodlama.io.springWorkspace.business.concretes;

import kodlama.io.springWorkspace.business.abstracts.ProgrammingLanguageService;
import kodlama.io.springWorkspace.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.springWorkspace.business.responses.GetAllProgrammingLanguageResponse;
import kodlama.io.springWorkspace.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.springWorkspace.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<GetAllProgrammingLanguageResponse> getAll() {
        List<ProgrammingLanguage> programmingLanguages = this.programmingLanguageRepository.findAll();
        List<GetAllProgrammingLanguageResponse> getAllProgrammingLanguageResponses = new ArrayList<GetAllProgrammingLanguageResponse>();

        for (ProgrammingLanguage programmingLanguage : programmingLanguages){
            GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
            responseItem.setId(programmingLanguage.getId());
            responseItem.setName(programmingLanguage.getName());
            getAllProgrammingLanguageResponses.add(responseItem);
        }

        return getAllProgrammingLanguageResponses;
    }

    @Override
    public GetAllProgrammingLanguageResponse getById(int id) {
        Optional<ProgrammingLanguage> programmingLanguage = this.programmingLanguageRepository.findById(id);
        GetAllProgrammingLanguageResponse getAllProgrammingLanguageResponse = new GetAllProgrammingLanguageResponse();
        getAllProgrammingLanguageResponse.setId(programmingLanguage.get().getId());
        getAllProgrammingLanguageResponse.setName(programmingLanguage.get().getName());
        return getAllProgrammingLanguageResponse;
    }

    @Override
    public void create(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(createProgrammingLanguageRequest.getName());
        this.programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public void update(int id, CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        Optional<ProgrammingLanguage> programmingLanguage = this.programmingLanguageRepository.findById(id);
        programmingLanguage.get().setName(createProgrammingLanguageRequest.getName());
        this.programmingLanguageRepository.save(programmingLanguage.get());
    }

    @Override
    public void delete(int id) {
        Optional<ProgrammingLanguage> programmingLanguage = this.programmingLanguageRepository.findById(id);
        this.programmingLanguageRepository.delete(programmingLanguage.get());
    }
}
