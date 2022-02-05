package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;


public class ResultActivity extends AppCompatActivity {
    QuizQuestionsActivity qObj = new QuizQuestionsActivity();
//    private ArrayList<Integer> selectedQ = (ArrayList<Integer>) getIntent().getSerializableExtra("selectedAns");
//
//    private ArrayList<Question> qList = (ArrayList<Question>) getIntent().getSerializableExtra("qList");

//    private ArrayList<Integer> selectedQ = qObj.getselectedAns();
//    private ArrayList<Question> qList = qObj.getqList();
//    Bundle bundle = getIntent().getExtras();
//   // ArrayList<Question> qList = bundle.getParcelableArrayList("questions");
//    ArrayList<Integer> selectedQ = bundle.getIntegerArrayList("selectedAns");

    private int currQues=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundle = getIntent().getExtras();
        ArrayList<Question> qList = bundle.getParcelableArrayList("questions");
        ArrayList<Integer> selectedQ = bundle.getIntegerArrayList("selectedQ");
        int countCorrAns= bundle.getInt("result_display");


        setQuestion(qList, countCorrAns, selectedQ);



    }

    private void setQuestion(ArrayList<Question> qList, int countCorrAns, ArrayList<Integer> selectedQ){

        final TextView tv6 = (TextView) findViewById(R.id.result_display);
        tv6.setText("Result!" + "\n"+Integer.toString(countCorrAns) + "/"+ Integer.toString(qList.size()));

        // setting first question
        Question question1 = qList.get(0);
        final TextView tv1 = (TextView) findViewById(R.id.question1);
        Log.i("first ques",Integer.toString(currQues) + ". " + question1.getQuestion());
        tv1.setText(Integer.toString(currQues) + ". " + question1.getQuestion());

        final TextView op11 = (TextView) findViewById(R.id.option_one_1);
        op11.setText(question1.getOption1());

        final TextView op12 = (TextView) findViewById(R.id.option_two_1);
        op12.setText(question1.getOption2());

        final TextView op13 = (TextView) findViewById(R.id.option_three_1);
        op13.setText(question1.getOption3());

        final TextView op14 = (TextView) findViewById(R.id.option_four_1);
        op14.setText(question1.getOption4());


        switch(question1.getCorrectAns()) {
                case 1 :
                    op11.setBackgroundColor(Color.parseColor("#3DDC84"));

                    break;
                case 2:
                    op12.setBackgroundColor(Color.parseColor("#3DDC84"));;

                    break;
                case 3:
                    op13.setBackgroundColor(Color.parseColor("#3DDC84"));;

                    break;
                case 4:
                    op14.setBackgroundColor(Color.parseColor("#3DDC84"));;

                    break;
        }



        if(question1.getCorrectAns() != selectedQ.get(0)){
            switch (selectedQ.get(0)) {
                case 1 :
                    op11.setBackgroundColor(Color.parseColor("#FF0000"));
                    break;
                case 2:
                    op12.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;
                case 3:
                    op13.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;
                case 4:
                    op14.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;

            }


        }

        currQues++;
        // setting second question
        Question question2 = qList.get(1);
        final TextView tv2 = (TextView) findViewById(R.id.question2);
        tv2.setText(Integer.toString(currQues) + ". " + question2.getQuestion());

        final TextView op21 = (TextView) findViewById(R.id.option_one_2);
        op21.setText(question2.getOption1());

        final TextView op22 = (TextView) findViewById(R.id.option_two_2);
        op22.setText(question2.getOption2());

        final TextView op23 = (TextView) findViewById(R.id.option_three_2);
        op23.setText(question2.getOption3());

        final TextView op24 = (TextView) findViewById(R.id.option_four_2);
        op24.setText(question2.getOption4());

        switch(question2.getCorrectAns()) {
            case 1 :
                op21.setBackgroundColor(Color.parseColor("#3DDC84"));

                break;
            case 2:
                op22.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
            case 3:
                op23.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
            case 4:
                op24.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
        }



        if(question2.getCorrectAns() != selectedQ.get(1)){
            switch (selectedQ.get(1)) {
                case 1 :
                    op21.setBackgroundColor(Color.parseColor("#FF0000"));
                    break;
                case 2:
                    op22.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;
                case 3:
                    op23.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;
                case 4:
                    op24.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;

            }


        }

        currQues++;
        // setting third question
        Question question3 = qList.get(2);
        final TextView tv3 = (TextView) findViewById(R.id.question3);
        tv3.setText(Integer.toString(currQues) + ". " + question3.getQuestion());

        final TextView op31 = (TextView) findViewById(R.id.option_one_3);
        op31.setText(question3.getOption1());

        final TextView op32 = (TextView) findViewById(R.id.option_two_3);
        op32.setText(question3.getOption2());

        final TextView op33 = (TextView) findViewById(R.id.option_three_3);
        op33.setText(question3.getOption3());

        final TextView op34 = (TextView) findViewById(R.id.option_four_3);
        op34.setText(question3.getOption4());

        switch(question3.getCorrectAns()) {
            case 1 :
                op31.setBackgroundColor(Color.parseColor("#3DDC84"));

                break;
            case 2:
                op32.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
            case 3:
                op33.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
            case 4:
                op34.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
        }



        if(question3.getCorrectAns() != selectedQ.get(2)){
            switch (selectedQ.get(2)) {
                case 1 :
                    op31.setBackgroundColor(Color.parseColor("#FF0000"));
                    break;
                case 2:
                    op32.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;
                case 3:
                    op33.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;
                case 4:
                    op34.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;

            }


        }

        currQues++;
        // setting fourth question
        Question question4 = qList.get(3);
        final TextView tv4 = (TextView) findViewById(R.id.question4);
        tv4.setText(Integer.toString(currQues) + ". " + question4.getQuestion());

        final TextView op41 = (TextView) findViewById(R.id.option_one_4);
        op41.setText(question4.getOption1());

        final TextView op42 = (TextView) findViewById(R.id.option_two_4);
        op42.setText(question4.getOption2());

        final TextView op43 = (TextView) findViewById(R.id.option_three_4);
        op43.setText(question4.getOption3());

        final TextView op44 = (TextView) findViewById(R.id.option_four_4);
        op44.setText(question4.getOption4());

        switch(question4.getCorrectAns()) {
            case 1 :
                op41.setBackgroundColor(Color.parseColor("#3DDC84"));

                break;
            case 2:
                op42.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
            case 3:
                op43.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
            case 4:
                op44.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
        }

        if(question4.getCorrectAns() != selectedQ.get(3)){
            switch (selectedQ.get(3)) {
                case 1 :
                    op41.setBackgroundColor(Color.parseColor("#FF0000"));
                    break;
                case 2:
                    op42.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;
                case 3:
                    op43.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;
                case 4:
                    op44.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;

            }


        }

        currQues++;
        // setting fifth question
        Question question5 = qList.get(4);
        final TextView tv5 = (TextView) findViewById(R.id.question5);
        tv5.setText(Integer.toString(currQues) + ". " + question5.getQuestion());

        final TextView op51 = (TextView) findViewById(R.id.option_one_5);
        op51.setText(question5.getOption1());

        final TextView op52 = (TextView) findViewById(R.id.option_two_5);
        op52.setText(question5.getOption2());

        final TextView op53 = (TextView) findViewById(R.id.option_three_5);
        op53.setText(question5.getOption3());

        final TextView op54 = (TextView) findViewById(R.id.option_four_5);
        op54.setText(question5.getOption4());

        switch(question5.getCorrectAns()) {
            case 1 :
                op51.setBackgroundColor(Color.parseColor("#3DDC84"));

                break;
            case 2:
                op52.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
            case 3:
                op53.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
            case 4:
                op54.setBackgroundColor(Color.parseColor("#3DDC84"));;

                break;
        }


        if(question5.getCorrectAns() != selectedQ.get(4)){
            switch (selectedQ.get(4)) {
                case 1 :
                    op51.setBackgroundColor(Color.parseColor("#FF0000"));
                    break;
                case 2:
                    op52.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;
                case 3:
                    op53.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;
                case 4:
                    op54.setBackgroundColor(Color.parseColor("#FF0000"));;
                    break;

            }


        }



    }


}