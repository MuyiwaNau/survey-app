package survey.creator;

import java.util.Objects;

public record StringAnswerOption(String option) implements AnswerOption<String> {
    public StringAnswerOption(String option) {
        Objects.requireNonNull(option, "The list of options is required");

        this.option = option;
    }
}
