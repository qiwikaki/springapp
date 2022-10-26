package ivan.projects.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("ivan.projects.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public MetalCoreMusic metalCoreMusic(){
        return new MetalCoreMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(metalCoreMusic(),classicalMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
