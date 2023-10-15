package org.example.question;

public class HttpQuestion extends AbstractQuestion {
    private String[] methods = {"put", "get", "patch", "post", "delete"};
    @Override
    public boolean checkAnswer(String answer) {
        answer = answer.toLowerCase();
        for (String method : methods) {
            if (!answer.contains(method)) {
                return false;
            }
        }
        return true;
    }

    public HttpQuestion() {
        super("Какие методы HTTP-запросов вы знаете?");
    }
}
