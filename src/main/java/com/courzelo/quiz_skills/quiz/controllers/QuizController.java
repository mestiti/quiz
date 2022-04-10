package com.courzelo.quiz_skills.quiz.controllers;

import com.courzelo.quiz_skills.quiz.entities.dtos.QuizDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.courzelo.quiz_skills.quiz.businesses.iservices.IServiceQuiz;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping( "/quiz" )
@RestController
public class QuizController {

	@Autowired
	private IServiceQuiz iquiz;

	@GetMapping("/get_quizbyid/{id}")
	public QuizDTO showquizbyid(@PathVariable("id") String id) {

		return  iquiz.getquizbyid(id);

	}




}
