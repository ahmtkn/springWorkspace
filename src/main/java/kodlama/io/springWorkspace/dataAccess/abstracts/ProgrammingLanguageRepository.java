package kodlama.io.springWorkspace.dataAccess.abstracts;

import kodlama.io.springWorkspace.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}
