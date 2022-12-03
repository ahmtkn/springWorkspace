package kodlama.io.springWorkspace.dataAccess.concretes;

import kodlama.io.springWorkspace.dataAccess.abstracts.ProgramingLangRepository;
import kodlama.io.springWorkspace.entities.concretes.ProgramingLang;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgramingLangRepository implements ProgramingLangRepository {
    List<ProgramingLang> langs;

    public InMemoryProgramingLangRepository() {
        langs = new ArrayList<ProgramingLang>();
        langs.add(new ProgramingLang(1, "PHP"));
        langs.add(new ProgramingLang(2, "JAVA"));
        langs.add(new ProgramingLang(3, "JS"));
        langs.add(new ProgramingLang(4, "PYTHON"));
        langs.add(new ProgramingLang(5, "C#"));
    }

    @Override
    public List<ProgramingLang> getAll() {
        return langs;
    }

    @Override
    public ProgramingLang getById(int id) {
        for (ProgramingLang programingLang : langs){
            if (programingLang.getId() == id){
                return programingLang;
            }
        }
        return null;
    }

    @Override
    public void create(ProgramingLang programingLang) {
        langs.add(programingLang);
    }

    @Override
    public void update(int id, ProgramingLang programingLang) {
         var item = this.getById(id);
         item.setName(programingLang.getName());

    }

    @Override
    public void delete(int id) {
        for (ProgramingLang programingLang : langs){
            if (programingLang.getId() == id){
                langs.remove(programingLang);
            }
        }
    }
}
