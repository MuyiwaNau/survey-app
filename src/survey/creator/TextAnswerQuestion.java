package survey.creator;

import java.util.Objects;
import java.util.UUID;

public record TextAnswerQuestion(UUID id, String question, String description) implements OpenEndedQuestion<String> {

    public TextAnswerQuestion(UUID id, String question, String description) {

        Objects.requireNonNull(id, "The id is required");
        Objects.requireNonNull(question, "The question is required");
        Objects.requireNonNull(description, "The description is required");

        this.id = id;
        this.question = question;
        this.description = description;
    }

    @Override
    public boolean validateAnswer(String answer) {
        Objects.requireNonNull(answer, "The answer is required");
        return true;
    }

    @Override
    public String convert(String answer) {
        return answer;
    }
}
