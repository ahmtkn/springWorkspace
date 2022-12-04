package kodlama.io.springWorkspace.business.responses;

import kodlama.io.springWorkspace.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguageResponse {
    private int id;
    private String name;
}
