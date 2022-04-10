package com.courzelo.quiz_skills.quiz.businesses;






import com.courzelo.quiz_skills.quiz.businesses.iservices.IServiceQuiz;
import com.courzelo.quiz_skills.quiz.entities.Quiz;
import com.courzelo.quiz_skills.quiz.entities.dtos.QuizDTO;
import com.courzelo.quiz_skills.quiz.repositories.QuizRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class QuizBusiness implements IServiceQuiz {

    ModelMapper mapper=new ModelMapper();

    @Autowired
    QuizRepository quizrepository;

    @Override
    public QuizDTO getquizbyid(String id) {
        Quiz quiz=quizrepository.findById(id).orElseGet(Quiz::new);

        return mapper.map(quiz,QuizDTO.class);

    }
}
