package survey.creator;

import java.util.List;

public interface SelectionBasedQuestion<T> extends Question {

    List<? extends AnswerOption<T>> options();

}
