package survey;

import survey.creator.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        var survey = createSurvey();
        System.out.println(survey.questions());
    }
    private static Survey createSurvey() {


        Survey survey = new Survey(UUID.randomUUID(), "Feedback survey");

        var question1 = new TextAnswerQuestion(UUID.randomUUID(), "Question 1", null);
        var question2 = new TextAnswerQuestion(UUID.randomUUID(), "Question 2", "");

        System.out.println(question1);
        System.out.println(question2);

        System.out.println("Validate answer");
        boolean isValid = question1.validateAnswer("Answer");
        System.out.println("Is answer valid: " + isValid);

        question1.validateAnswer("434");
        survey.addQuestion(question1);
        survey.addQuestion(question2);

        System.out.println(survey.questions());
        return survey;
    }
}
