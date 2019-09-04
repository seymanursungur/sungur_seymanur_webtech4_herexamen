package edu.ap.market.model;

public class Product {

    private String question;
    private String answer;
   

    public Product() {}

    public Product(String name, String answer) {
        this.question = name;
        this.answer = answer;

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
