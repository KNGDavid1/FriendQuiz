package com.example.android.friendquiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Tracks the totalScore


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int totalScore = 0;

    //Calculates the score of the quiz
    public void FriendQuiz() {
        solveQuestion1();
        solveQuestion2();
        solveQuestion3();
        solveQuestion4();
        solveQuestion5();
        solveQuestion6();
        solveQuestion7();
        solveQuestion8();
        totalScore--;
    }


    private void solveQuestion8() {
    }

    private void solveQuestion7() {
    }

    public void resetScore(View view) {
        EditText editTextOne = findViewById(R.id.correctAnswer);
        editTextOne.getText().clear();

        EditText editTextTwo = findViewById(R.id.keyanswer_name_parents);
        editTextTwo.getText().clear();

        CheckBox cbOp1 = findViewById(R.id.one_brother_one_sister);
        cbOp1.setChecked(false);

        CheckBox cbOp2 = findViewById(R.id.two_brothers);
        cbOp2.setChecked(false);

        CheckBox cbOp3 = findViewById(R.id.black_walnut);
        cbOp3.setChecked(false);

        CheckBox cbOp4 = findViewById(R.id.strawberry_kiwi);
        cbOp4.setChecked(false);

        CheckBox cbOp5 = findViewById(R.id.chocolate_checkbox);
        cbOp5.setChecked(false);

        RadioGroup radioGroup = findViewById(R.id.q1);
        radioGroup.clearCheck();

        RadioGroup radioGroupTwo = findViewById(R.id.q2);
        radioGroupTwo.clearCheck();

        RadioGroup radioGroupThree = findViewById(R.id.q3);
        radioGroupThree.clearCheck();

        RadioGroup radioGroupFour = findViewById(R.id.q4);
        radioGroupFour.clearCheck();

        totalScore = 0;
    }

    public void FriendQuiz(int score) {
        Button FriendQuiz = findViewById(R.id.Submit);
        FriendQuiz.setText(String.valueOf(score));
    }

    private void display(int i) {
    }

    private void solveQuestion1() {
        RadioButton answerQues1 = findViewById(R.id.answer1Chicken);
        if (answerQues1.isChecked()) {
            totalScore += 1;
        } else {
            totalScore--;
        }
    }

    private void solveQuestion2() {
        RadioButton answerQues2 = findViewById(R.id.answer2_Christmas);
        if (answerQues2.isChecked()) {
            totalScore += 1;
        } else {
            totalScore--;
        }
    }

    private void solveQuestion3() {
        RadioButton answerQues3 = findViewById(R.id.answer3_Action);
        if (answerQues3.isChecked()) {
            totalScore += 1;
        } else {
            totalScore--;
        }
    }

    private void solveQuestion4() {
        RadioButton answerQues4 = findViewById(R.id.answer4_Math);
        if (answerQues4.isChecked()) {
            totalScore += 1;
        } else {
            totalScore--;
        }
    }

    private void solveQuestion5() {
        CheckBox one_brother_one_sister = findViewById(R.id.one_brother_one_sister);
        CheckBox two_brothers = findViewById(R.id.two_brothers);
        if ((one_brother_one_sister.isChecked()) && (two_brothers.isChecked()))
            if (one_brother_one_sister.isChecked()) {
                totalScore += 1;

            } else {
                totalScore--;
            }
    }

    private void solveQuestion6() {
        CheckBox black_walnut = findViewById(R.id.black_walnut);
        CheckBox strawberry_kiwi = findViewById(R.id.strawberry_kiwi);
        CheckBox chocolate_checkbox = findViewById(R.id.chocolate_checkbox);
        if ((black_walnut.isChecked()) && (chocolate_checkbox.isChecked()) && (strawberry_kiwi.isChecked())) {
            if (black_walnut.isChecked()) {
                totalScore += 1;
            } else {

                totalScore--;
            }
        }

    }

    // first edit text question 7 place code here for players answer about correct spelling of name
    public int solveQuestion7;
    {
        EditText yourAnswer = findViewById(R.id.correctAnswer);
        String TypeYourAnswer = yourAnswer.getText().toString();

        if (TypeYourAnswer.equals("Harmonie")) {
            totalScore += 1;
        } else {
            totalScore--;
        }
    }

    // second edit text question place code here for players answer about correct name of parents
    public int solveQuestion8;
    {
        EditText name = findViewById(R.id.keyanswer_name_parents);
        String Parent_name = name.getText().toString();

        if (Parent_name.equals("David and Rhonda")) {
            totalScore += 1;
        } else {
            totalScore--;
        }
    }


    Context context = getApplicationContext();
    CharSequence text = "You got " + totalScore + " out of 8 correct.";
    int duration = Toast.LENGTH_SHORT;

    public void FriendQuiz(View view) {
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        totalScore = 0;

    }
}

