package ivan.projects.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
//@Scope("prototype")
public class ClassicalMusic implements Music{
    public void doMyInit(){
        System.out.println("doMyIni");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
