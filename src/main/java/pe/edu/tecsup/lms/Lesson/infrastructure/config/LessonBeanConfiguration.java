package pe.edu.tecsup.lms.Lesson.infrastructure.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.tecsup.lms.Lesson.application.CompleteLessonUseCase;
import pe.edu.tecsup.lms.Lesson.application.CompleteLessonUseImpl;
import pe.edu.tecsup.lms.shared.domain.event.EventPublisher;

@Configuration
public class LessonBeanConfiguration {
    @Bean
    public CompleteLessonUseCase completeLessonUseCase(EventPublisher eventPublisher){
        return new CompleteLessonUseImpl(eventPublisher);
    }

}
