package com.courzelo.quiz_skills.quiz.entities;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Document(collection="Quiz")
@Getter
@Setter
@AllArgsConstructor
public class Quiz {

    @Id
    private String id;
    private String title;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date creationdate;
    @Temporal (TemporalType.DATE)
    private Date limitdate;
    private int nbquestions;
    private float countdown;
    private String type;
    @Enumerated(EnumType.STRING)
    private Evaluation_model evaluationmodel;
    private float finalscore;
    private List<Questions> questionsList;


    public Quiz() {
        super();
    }
}
