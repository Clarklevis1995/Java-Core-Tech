package com.interfaceTestAndOthers.callBack.answerQuestion;

public class Jack implements Student {
    @Override
    public void resolveQuestion(Callback callback) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        callback.tellAnswer(3);
    }
}
