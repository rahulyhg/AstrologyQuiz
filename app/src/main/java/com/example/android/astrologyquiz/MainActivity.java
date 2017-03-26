package com.example.android.astrologyquiz;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.R.attr.value;
import static com.example.android.astrologyquiz.R.id.q03_Answer_a;
import static com.example.android.astrologyquiz.R.id.resultTxt_01;
import static com.example.android.astrologyquiz.R.string.correctanswer;
import static com.example.android.astrologyquiz.R.string.question_02;
import static com.example.android.astrologyquiz.R.string.wronganswer;

public class MainActivity extends AppCompatActivity {
    public static int score = 0;
    public static String user_name = "";

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_main);

        // Check whether we're recreating a previously destroyed instance
        if (savedState != null) {
            // Restore value from saved state
            score = savedState.getInt(String.valueOf(score));
            user_name = savedState.getString(String.valueOf(user_name));
        } else {
            score = 0;
            user_name = "";
        }

        Log.v("MainActivity", "Score: " + score);

        //** Initialize UI ** //

            //** Result Text hide
            TextView resultTxt_01 = (TextView) findViewById(R.id.resultTxt_01);
            resultTxt_01.setVisibility(View.GONE);

            TextView resultTxt_02 = (TextView) findViewById(R.id.resultTxt_02);
            resultTxt_02.setVisibility(View.GONE);

            //** Reset button visibility setting ("Try again!")**//
            Button btnReset = (Button) findViewById(R.id.reset);
            btnReset.setVisibility(View.GONE);

            //** Submit button - calculate result **//
            Button btnSubmit = (Button) findViewById(R.id.submit_sign);
            btnSubmit.setVisibility(View.VISIBLE);


        //** End of Initialize UI ** //


        btnSubmit.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             ButtonAnimation(v);
                                             Log.v("MainActivity", "Submit Button Press");
                                             calculateResult(v);
                                             Button btnReset = (Button) findViewById(R.id.reset);
                                             btnReset.setVisibility(View.VISIBLE);
                                         }
                                     }
        );

        //** Submit button, calculate result **//
        btnReset.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             ButtonAnimation(v);
                                             Log.v("MainActivity", "Reset Button Press");
                                             // restart quiz
                                             finish();
                                             startActivity(getIntent());
                                         }
                                     }
        );

    }


    public void Answer04_Click_RadioGroup_Simulation (View v)
    {   RadioButton q04_btn_1 = (RadioButton)findViewById(R.id.q04_btn_1);
        RadioButton q04_btn_3 = (RadioButton)findViewById(R.id.q04_btn_3);
        RadioButton q04_btn_4 = (RadioButton)findViewById(R.id.q04_btn_4);
        RadioButton q04_Answer = (RadioButton)findViewById(R.id.q04_Answer);

        switch (v.getId()) {
            case R.id.q04_btn_1:
                q04_btn_3.setChecked(false);
                q04_btn_4.setChecked(false);
                q04_Answer.setChecked(false);
                break;
            case R.id.q04_btn_3:
                q04_btn_1.setChecked(false);
                q04_btn_4.setChecked(false);
                q04_Answer.setChecked(false);
                break;
            case R.id.q04_btn_4:
                q04_btn_1.setChecked(false);
                q04_btn_3.setChecked(false);
                q04_Answer.setChecked(false);
                break;
            case R.id.q04_Answer:
                q04_btn_1.setChecked(false);
                q04_btn_3.setChecked(false);
                q04_btn_4.setChecked(false);
                break;
        }


    }

    public void Answer05_Click_RadioGroup_Simulation (View v)
    {   RadioButton q05_btn_1 = (RadioButton)findViewById(R.id.q05_btn_1);
        RadioButton q05_btn_2 = (RadioButton)findViewById(R.id.q05_btn_2);
        RadioButton q05_btn_3 = (RadioButton)findViewById(R.id.q05_btn_3);
        RadioButton q05_Answer = (RadioButton)findViewById(R.id.q05_Answer);

        switch (v.getId()) {
            case R.id.q05_btn_1:
                q05_btn_2.setChecked(false);
                q05_btn_3.setChecked(false);
                q05_Answer.setChecked(false);
                break;
            case R.id.q05_btn_2:
                q05_btn_1.setChecked(false);
                q05_btn_3.setChecked(false);
                q05_Answer.setChecked(false);
                break;
            case R.id.q05_btn_3:
                q05_btn_1.setChecked(false);
                q05_btn_2.setChecked(false);
                q05_Answer.setChecked(false);
                break;
            case R.id.q05_Answer:
                q05_btn_1.setChecked(false);
                q05_btn_2.setChecked(false);
                q05_btn_3.setChecked(false);
                break;
        }

    }

    public void Answer06_Click_RadioGroup_Simulation (View v)
    {   RadioButton q06_btn_1 = (RadioButton)findViewById(R.id.q06_btn_1);
        RadioButton q06_btn_2 = (RadioButton)findViewById(R.id.q06_btn_2);
        RadioButton q06_btn_4 = (RadioButton)findViewById(R.id.q06_btn_4);
        RadioButton q06_Answer = (RadioButton)findViewById(R.id.q06_Answer);

        switch (v.getId()) {
            case R.id.q06_btn_1:
                q06_btn_2.setChecked(false);
                q06_btn_4.setChecked(false);
                q06_Answer.setChecked(false);
                break;
            case R.id.q06_btn_2:
                q06_btn_1.setChecked(false);
                q06_btn_4.setChecked(false);
                q06_Answer.setChecked(false);
                break;
            case R.id.q06_btn_4:
                q06_btn_1.setChecked(false);
                q06_btn_2.setChecked(false);
                q06_Answer.setChecked(false);
                break;
            case R.id.q06_Answer:
                q06_btn_1.setChecked(false);
                q06_btn_2.setChecked(false);
                q06_btn_4.setChecked(false);
                break;
        }

    }





    public void ButtonAnimation(View v) {

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

        AnimationSet sets = new AnimationSet(false);
        sets.addAnimation(animTranslate);
        sets.addAnimation(animAlpha);
        sets.addAnimation(animRotate);
        sets.addAnimation(animScale);
        v.startAnimation(sets);
    }

    public void calculateResult(View view) {
        score = 0;
        Log.v("MainActivity", "CalculateResult - begin");

        //** Submit button visibility setting **//
        Button btnSubmit = (Button) findViewById(R.id.submit_sign);
        btnSubmit.setVisibility(View.GONE);


        // Question 01 Checking
        RadioButton q01_Answer = (RadioButton) findViewById(R.id.q01_Answer);
        boolean question_01_ok = q01_Answer.isChecked();
        TextView resultTxt_01 = (TextView) findViewById(R.id.resultTxt_01);
        resultTxt_01.setVisibility(View.VISIBLE);

        if (question_01_ok) {
            Log.v("MainActivity", "CalculateResult - q1 ok");
            score += 1;
            resultTxt_01.setText(getString(R.string.correctanswer));
        }
        else
        {
            resultTxt_01.setText(getString(R.string.wronganswer));
        }


        // Question 02 Checking
        EditText question_02 = (EditText) findViewById(R.id.q02_answer);
        String question_02_Answer = question_02.getText().toString();
        String correctAnswer = "gemini";
        TextView resultTxt_02 = (TextView) findViewById(R.id.resultTxt_02);
         resultTxt_02.setVisibility(View.VISIBLE);

        if (question_02_Answer.equals(correctAnswer)) {
            score += 1;
             resultTxt_02.setText(getString(R.string.correctanswer));
        }
        else
        {
            resultTxt_02.setText(getString(R.string.wronganswer_02_gemini));
        }


        // Question 03 Checking
        CheckBox q03_Answer_a = (CheckBox) findViewById(R.id.q03_Answer_a);
        boolean q03_Answer_a_chk = q03_Answer_a.isChecked();

        CheckBox q03_Answer_b = (CheckBox) findViewById(R.id.q03_Answer_b);
        boolean q03_Answer_b_chk = q03_Answer_b.isChecked();

        CheckBox q03_Answer_c = (CheckBox) findViewById(R.id.q03_Answer_c);
        boolean q03_Answer_c_chk = q03_Answer_c.isChecked();

        CheckBox q03_Answer_d = (CheckBox) findViewById(R.id.q03_Answer_d);
        boolean q03_Answer_d_chk = q03_Answer_d.isChecked();

         if (!(q03_Answer_b_chk  || q03_Answer_d_chk )) {

             if ((q03_Answer_a_chk  || q03_Answer_c_chk )) {
                 score += 1;

                 Log.v("MainActivity", "CalculateResult checkbox!!!!");
             }
            }


        // Question 04 Checking
        RadioButton q04_Answer = (RadioButton) findViewById(R.id.q04_Answer);
        boolean question_04_ok = q04_Answer.isChecked();

        if (question_04_ok) {
            Log.v("MainActivity", "CalculateResult - q4 ok");
            score += 1;
        }

        // Question 05 Checking
        RadioButton q05_Answer = (RadioButton) findViewById(R.id.q05_Answer);
        boolean question_05_ok = q05_Answer.isChecked();

        if (question_05_ok) {
            Log.v("MainActivity", "CalculateResult - q5 ok");
            score += 1;
        }

        // Question 06 Checking
        RadioButton q06_Answer = (RadioButton) findViewById(R.id.q06_Answer);
        boolean question_06_ok = q06_Answer.isChecked();

        if (question_06_ok) {
            Log.v("MainActivity", "CalculateResult - q6 ok");
            score += 1;
        }


        //************************************************************************************************************
        // result
        EditText user_name_et = (EditText) findViewById(R.id.user_name);
        user_name = user_name_et.getText().toString();


        startActivity(new Intent(MainActivity.this,Pop.class));

        if (score != 0) {

            RadioButton q01_btn_2 = (RadioButton)findViewById(R.id.q01_btn_2);
            RadioButton q01_btn_3 = (RadioButton)findViewById(R.id.q01_btn_3);
            RadioButton q01_btn_4 = (RadioButton)findViewById(R.id.q01_btn_4);

            q01_Answer.setButtonDrawable(R.drawable.radiobutton_sel_correct);
            q01_Answer.refreshDrawableState();

            q01_btn_2.setButtonDrawable(R.drawable.radiobutton_sel_wrong);
            q01_btn_2.refreshDrawableState();

            q01_btn_3.setButtonDrawable(R.drawable.radiobutton_sel_wrong);
            q01_btn_3.refreshDrawableState();

            q01_btn_4.setButtonDrawable(R.drawable.radiobutton_sel_wrong);
            q01_btn_4.refreshDrawableState();


            q04_Answer.setButtonDrawable(R.drawable.radiobutton_sel_correct);
            q04_Answer.refreshDrawableState();

            //RadioGroup q01_rg = (RadioGroup) findViewById(R.id.q01_radiogroup);
            //for (int i = 0; i < q01_rg.getChildCount(); i++) {
            //    q01_rg.getChildAt(i).setEnabled(false);
            //}

            //Toast.makeText(this, user_name + ", you are amazing! Score is: " + score, Toast.LENGTH_LONG).show();
        }

        if (score == 0) {
           // q01_Answer.setChecked(true);

            RadioButton q01_btn_2 = (RadioButton)findViewById(R.id.q01_btn_2);
            RadioButton q01_btn_3 = (RadioButton)findViewById(R.id.q01_btn_3);
            RadioButton q01_btn_4 = (RadioButton)findViewById(R.id.q01_btn_4);

            q01_Answer.setButtonDrawable(R.drawable.radiobutton_sel_correct);
            q01_Answer.refreshDrawableState();

            q01_btn_2.setButtonDrawable(R.drawable.radiobutton_sel_wrong);
            q01_btn_2.refreshDrawableState();

            q01_btn_3.setButtonDrawable(R.drawable.radiobutton_sel_wrong);
            q01_btn_3.refreshDrawableState();

            q01_btn_4.setButtonDrawable(R.drawable.radiobutton_sel_wrong);
            q01_btn_4.refreshDrawableState();


            q04_Answer.setButtonDrawable(R.drawable.radiobutton_sel_correct);
            q04_Answer.refreshDrawableState();
            //Toast.makeText(this, "Sorry " + user_name + ", but your Score is: " + score, Toast.LENGTH_LONG).show();



        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedState) {
        super.onSaveInstanceState(savedState);
        // Save the values of the scores here
        savedState.putInt("score", score);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedState) {
        super.onRestoreInstanceState(savedState);
        // Restore the values of the scores here
        score = savedState.getInt("score");
    }




}


