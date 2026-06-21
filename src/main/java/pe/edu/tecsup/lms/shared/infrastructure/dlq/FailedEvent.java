package pe.edu.tecsup.lms.shared.infrastructure.dlq;


import lombok.AllArgsConstructor;
import lombok.Getter;
import pe.edu.tecsup.lms.shared.domain.event.DomainEvent;

@Getter
@AllArgsConstructor
public class FailedEvent {

    private final DomainEvent event; //evento
    private final String message; // la razon por la que falla
    private final long timestamp; // mascara de tiempo


}
