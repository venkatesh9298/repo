package com.hk.quizProjct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class QuestionContainer {
  private ArrayList<Question> questionSet;

  public QuestionContainer() {
    questionSet = new ArrayList<Question>();

    String q = "java is  programming or platform";
    String[] a = {"Programming", "Platform", "Both", "None of the above"};
    questionSet.add(new Question(q, a, "None of the above"));

    q = "which of the follwing is not a  java keyword ";
    a = new String[] {"class", "for", "while", "Object"};
    questionSet.add(new Question(q, a, "Object"));

    q = "Where does the Sun rise?";
    a = new String[] {"East", "South", "West", "North"};
    questionSet.add(new Question(q, a, "East"));



    q = "Who invented the telephone?";
    a = new String[] {"Thomas Edison", "Michael Faraday", "James Watt", "Alexander Bell"};
    questionSet.add(new Question(q, a, "Alexander Bell"));

    q = "Where is the capital of Japan?";
    a = new String[] {"Beijing", "Tokyo", "Seoul", "Bangkok"};
    questionSet.add(new Question(q, a, "Tokyo"));

    Collections.shuffle(questionSet, new Random());
  }

  String name;
  int ccount = 0;
  int wcount = 0;

  public void start() {

    Scanner scan = new Scanner(System.in);
    System.out.println("Hi Enter your name ");
    name = scan.nextLine();
    System.out.println(" \nYour test is begining\n");


    // show questions from questionSet
    for (int question = 0; question < questionSet.size(); question++) {
      System.out.println(questionSet.get(question).getQuestion());
      int numChoices = questionSet.get(question).getChoices().size();
      // show choices from questions in questionSet
      for (char choice = 0; choice < numChoices; choice++) {
        System.out
            .println((choice + 1) + ": " + questionSet.get(question).getChoices().get(choice));
      }
      int Answer = scan.nextInt();
      ArrayList<String> choiceSet = questionSet.get(question).getChoices();
      String correctAnswer = questionSet.get(question).getAnswer();
      int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
      if (Answer == correctAnswerIndex + 1) {
        ccount++;
      } else
        wcount++;
    }
    System.out.println("Do you want to show resultes [yes/no]");
    String opt = scan.next();

    if (opt.equals("yes")) {
      showResult();
    }

  }

  public void showResult() {

    System.out.println(" \n\nHi " + name);
    System.out.println("total questions :\t" + questionSet.size());
    System.out.println("correct answer(s):\t" + ccount);
    System.out.println("wrong answer(s) :\t" + wcount);
    float per = (ccount * 100) / questionSet.size();
    if (per > 40.0) {
      System.out.println(" Result :          pass ");
    } else
      System.out.println(" Result :          fail");


  }
}
