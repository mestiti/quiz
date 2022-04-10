package com.courzelo.quiz_skills.quiz.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Questions {
    private String question;
    private int points;
    private List<String> correctanswer;
    private List<String> wronganswer;

    public Questions()
    {super();}


}