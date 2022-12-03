package kodlama.io.springWorkspace.business.concretes;

import kodlama.io.springWorkspace.business.abstracts.ProgramingLangService;
import kodlama.io.springWorkspace.dataAccess.abstracts.ProgramingLangRepository;
import kodlama.io.springWorkspace.entities.concretes.ProgramingLang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramingLangManager implements ProgramingLangService {

    private ProgramingLangRepository programingLangRepository;

    @Autowired
    public ProgramingLangManager(ProgramingLangRepository programingLangRepository) {
        this.programingLangRepository = programingLangRepository;
    }

    @Override
    public List<ProgramingLang> getAll() {
        return this.programingLangRepository.getAll();
    }

    @Override
    public void create(ProgramingLang programingLang) {
        this.programingLangRepository.create(programingLang);
    }

    @Override
    public void update(int id,ProgramingLang programingLang) {
        this.programingLangRepository.update(id,programingLang);
    }

    @Override
    public void delete(int id) {
        this.programingLangRepository.delete(id);
    }

    @Override
    public ProgramingLang getById(int id) {
        return this.programingLangRepository.getById(id);
    }
}
