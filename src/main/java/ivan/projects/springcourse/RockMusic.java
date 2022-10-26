package ivan.projects.springcourse;

import org.springframework.stereotype.Component;
//@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "It's my life";
    }
}
