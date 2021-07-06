package survey.creator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Survey {

    private final UUID id;

    private String title;

    private int numberOfQuestions;

    private List<Question> questions;

    public Survey(UUID id, String title) {
        Objects.requireNonNull(id, "The id is required");
        Objects.requireNonNull(title, "The title is required");

        this.id = id;
        this.title = title;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        if (question.description() != null){
        questions.add(question);
        }
    }

    public List<Question> questions() {
        return List.copyOf(questions);
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", numberOfQuestions=" + numberOfQuestions +
                ", questions=" + questions +
                '}';
    }
}
