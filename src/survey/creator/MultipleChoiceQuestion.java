package survey.creator;

import java.util.IllformedLocaleException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public record MultipleChoiceQuestion<T>(UUID id, String question, String description, List<? extends AnswerOption<T>>  options)
        implements SelectionBasedQuestion<T> {

    public MultipleChoiceQuestion(UUID id, String question, String description, List<? extends AnswerOption<T>> options) {
        Objects.requireNonNull(id, "The id is required");
        Objects.requireNonNull(question, "The question is required");
        Objects.requireNonNull(description, "The description is required");
        Objects.requireNonNull(options, "The list of options is required");

        if (options.size() < 2){
            throw new IllformedLocaleException("The list of options should have at least  2 elements");
        }
        this.id = id;
        this.question = question;
        this.description = description;
        this.options = List.copyOf(options);
    }
}
