package com.learnoset.offlinequizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("_____ class represents the basic building block for user interface components.", "View", "View Group", "LayoutParams",  "View");
        final QuestionsList question2 = new QuestionsList("A _____ provides simple feedback about an operation in a small popup", "Toast", "Checkbox", "EditText",  "Toast");
        final QuestionsList question3 = new QuestionsList("_____ provides the user a screen with which the user can interact.", "Tasks", "Intent", "Activity",  "Activity");
        final QuestionsList question4 = new QuestionsList("Activity provide with some possible life cycles , select the correct one :", "Foreground & Partially hidden", "Fully hidden & destroyed", "All of above",  "All of above");
        final QuestionsList question5 = new QuestionsList("_____ are messages which allow Android components to request functionality from other\n" +
                "components of the Android system", "Activity", "Intent", "Toast",  "Intent");
        final QuestionsList question6 = new QuestionsList("A _____ is a collection of activities that users interact with when performing a certain job", "Task", "Activity", "Intent",  "Task");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }


    public static List<QuestionsList> getQuestions(String selectedTopicName) {
                return javaQuestions();

    }
}
