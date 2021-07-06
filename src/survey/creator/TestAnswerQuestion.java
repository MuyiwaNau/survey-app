package survey.creator;

import java.lang.invoke.StringConcatFactory;
import java.util.UUID;

public record TestAnswerQuestion(UUID id, String question, String description) implements  OpenEndedQuestion<String> {

    @Override
    public boolean validateAnswer(String answer) {
        return true;
    }

    @Override
    public String convert(String answer) {
        return answer;
    }
}
