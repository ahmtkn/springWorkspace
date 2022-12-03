package kodlama.io.springWorkspace.dataAccess.abstracts;

import kodlama.io.springWorkspace.entities.concretes.ProgramingLang;

import java.util.List;

public interface ProgramingLangRepository {
   List<ProgramingLang> getAll();
   ProgramingLang getById(int id);
   void create(ProgramingLang programingLang);
   void update(int id, ProgramingLang programingLang);
   void delete(int id);
}
