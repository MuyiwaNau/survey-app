package survey.creator;

public interface OpenEndedQuestion<T> extends Question {

    boolean validateAnswer(T answer);

    T convert(String answer);

}
