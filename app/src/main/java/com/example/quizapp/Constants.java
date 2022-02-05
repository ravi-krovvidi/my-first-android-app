package com.example.quizapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Constants {

    public static ArrayList<Question> getQuestions() {
        ArrayList<Question> qList = new ArrayList<>();

        Question q1 = new Question(1, "What is the name of the artist who painted ‘Mona Lisa’?", "Leonardo da Vinci",
                "Pablo Picasso","Giotto Di Bondone","Diego Velázquez",1);

        qList.add(q1);

        Question q2 = new Question(2, "Which country held the 2016 Summer Olympics?", "China",
                "Ireland","Brazil","Italy",3);

        qList.add(q2);

        Question q3 = new Question(3, "Which planet is the hottest?", "Venus",
                "Saturn","Mercury","Mars",1);

        qList.add(q3);

        Question q4 = new Question(4, "In Pirates of the Caribbean, what was Captain Jack Sparrow’s ship’s name?", "The Slytherin",
                "The Marauder","The Black Pearl","The Black Python",3);

        qList.add(q4);

        Question q5 = new Question(5, "What is the rarest blood type?", "O",
                "A","B","AB-Negative",4);

        qList.add(q5);

        Question q6 = new Question(6, "Which U.S. state is known as the sunflower state?" ,
                "Florida",
                "California","Maine","Kansas",4);

        qList.add(q6);

        Question q7 = new Question(7, "How many bones are there in the human body?", "206",
                "205","201","209",1);

        qList.add(q7);

        Question q8 = new Question(8, "Fe is the chemical symbol for?", "Zinc",
                "Hydrogen","Fluorine","Iron",4);

        qList.add(q8);

        Question q9 = new Question(9, "How many hearts does an octopus have?", "1",
                "8","4","3",4);

        qList.add(q9);

        Question q10 = new Question(10, "How many degrees are in a circle?", "360",
                "180","150","319",1);

        qList.add(q10);

        ArrayList<Question> fiveQuesList = new ArrayList<>();
        Random rand = new Random();
        int count=1;
        while(count<=5){
            Question q = qList.get(rand.nextInt(qList.size()));
            if(!fiveQuesList.contains(q)) {
                fiveQuesList.add(q);
                count++;
            }
        }


    return fiveQuesList;
    }
}
