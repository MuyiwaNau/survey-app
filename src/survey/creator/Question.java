package survey.creator;

import java.util.UUID;

public interface Question {

    UUID id();

    String question();

    String description();

}
