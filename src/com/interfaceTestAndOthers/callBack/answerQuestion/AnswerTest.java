package com.interfaceTestAndOthers.callBack.answerQuestion;

public class AnswerTest {
    public static void main(String[] args) {
        Student Jack = new Jack();
        Teacher teacher = new Teacher(Jack);

        teacher.askQuestion();
    }
}
