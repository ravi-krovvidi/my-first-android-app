package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class QuizQuestionsActivity extends AppCompatActivity implements View.OnClickListener{

    private int currQues =1;
    private ArrayList<Question> qList = null;
    private int selectedOption;
    private int countCorrect;
    private ArrayList<Integer> correctAns = new ArrayList<Integer>();
    private ArrayList<Integer> selectedAns = new ArrayList<Integer>();

    public ArrayList<Question> getqList() {
        return this.qList;
    }

    public ArrayList<Integer> getselectedAns() {
        return this.selectedAns;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);

        Constants c = new Constants();
        qList = c.getQuestions();

        Log.i("Number of Questions", ""+ qList.size());

        setQuestion();

        findViewById(R.id.option_one).setOnClickListener(this);
        findViewById(R.id.option_two).setOnClickListener(this);
        findViewById(R.id.option_three).setOnClickListener(this);
        findViewById(R.id.option_four).setOnClickListener(this);
        findViewById(R.id.btn_submit).setOnClickListener(this);

    }

    private void setQuestion(){
        Question question = qList.get(currQues - 1);

        defaultOptionView();

        if (currQues == qList.size()) {
            final TextView tv = (TextView) findViewById(R.id.btn_submit);
            tv.setText("FINISH");

        } else {
            final TextView tv = (TextView) findViewById(R.id.btn_submit);
            tv.setText("SUBMIT");
        }

        final TextView tv = (TextView) findViewById(R.id.questions);
        tv.setText(Integer.toString(currQues) + ". " + question.getQuestion());

        final TextView tv1 = (TextView) findViewById(R.id.option_one);
        tv1.setText(question.getOption1());


        final TextView tv2 = (TextView) findViewById(R.id.option_two);
        tv2.setText(question.getOption2());

        final TextView tv3 = (TextView) findViewById(R.id.option_three);
        tv3.setText(question.getOption3());

        final TextView tv4 = (TextView) findViewById(R.id.option_four);
        tv4.setText(question.getOption4());



    }


    private void defaultOptionView(){
        ArrayList<TextView> options = new ArrayList<>();
        options.add(0, findViewById(R.id.option_one));
        options.add(1, findViewById(R.id.option_two));
        options.add(2, findViewById(R.id.option_three));
        options.add(3, findViewById(R.id.option_four));

        for(TextView op : options){
            op.setTextColor(Color.parseColor("#7A8087"));
            op.setTypeface(Typeface.DEFAULT);
            op.setBackground(ContextCompat.getDrawable(QuizQuestionsActivity.this,
                    R.drawable.default_option_border_bg));

        }
    }

    private void selectedOptionView(TextView t, int selectedOption){
        defaultOptionView();
        this.selectedOption = selectedOption;
        t.setTextColor(Color.parseColor("#3A8087"));
        t.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        t.setBackground(ContextCompat.getDrawable(QuizQuestionsActivity.this,
                R.drawable.select_option_border));

    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id) {
            case (R.id.option_one):
                selectedOptionView(findViewById(R.id.option_one), 1);
                break;
            case (R.id.option_two):
                selectedOptionView(findViewById(R.id.option_two), 2);
                break;
            case (R.id.option_three):
                selectedOptionView(findViewById(R.id.option_three), 3);
                break;
            case (R.id.option_four):
                selectedOptionView(findViewById(R.id.option_four), 4);
                break;
            case (R.id.btn_submit):
                if (currQues > qList.size()) {
                    Intent intent;
                    intent = new Intent(QuizQuestionsActivity.this, ResultActivity.class);
                    intent.putExtra("questions", qList);
                    intent.putExtra("selectedQ", selectedAns);
                    intent.putExtra("result_display", countCorrect);
                    startActivity(intent);
                } else {
                    Question question = qList.get(currQues - 1);
                    if (selectedOption == question.getCorrectAns()) {
                        countCorrect++;
                    }
                    selectedAns.add(selectedOption);
                    correctAns.add(question.getCorrectAns());
                    selectedOption = 0;
                    setQuestion();
                    currQues++;
                }
        }

    }

}