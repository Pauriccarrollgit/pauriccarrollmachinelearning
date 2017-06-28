package com.example.android.pauriccarrollmachinelearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app is Machine Learning App
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The number of correct answers
     */
    int score = 0;
    final String q6_answer = "pauric";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the end test button is clicked.
     */
    public void end_Test(View view) {
        EditText nameField = (EditText) findViewById(R.id.editUsername);
        String name = nameField.getText().toString();

        //Called question checking methods
        question_1();
        question_2();
        question_3();
        question_4();
        question_5();
        question_6();


        // Display the test result on the screen
        String test_result = createTestResult(name, score);
        displayResult(test_result);

        // Display the toast message when clicked

        if (score > 3) {
            Toast.makeText(this, "Keep up the good work: " + score, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You need to study more: " + score, Toast.LENGTH_SHORT).show();
        }


        // Disabled "End Test" button after clicking on it.
        Button endTestButton = (Button) findViewById(R.id.end_test_button);
        endTestButton.setEnabled(false);
    }

    /**
     * Create summary of the test result.
     *
     * @param name  of the passing the test
     * @param score of the counting of right answers
     * @return text of the test result
     * here is where I could add an intent
     */
    private String createTestResult(String name, int score) {
        String test_result = getString(R.string.test_result_name) + name;
        test_result += "\n" + getString(R.string.test_result_score) + score;
        return test_result;
    }


    /**
     * This method counter correct answers in question 1
     * Which of the following are types of machine learning? Check all that apply? (Choose 3 best answers)
     */
    public void question_1() {
        // Figure out if the user chose "Supervised" answer
        CheckBox SupervisedCheckBox = (CheckBox) findViewById(R.id.supervised_checkbox);
        boolean hasSupervised = SupervisedCheckBox.isChecked();

        if (hasSupervised) {
            increment_score();
        }

        // Figure out if the user chose "Unsupervised" answer
        CheckBox UnsupervisedCheckBox = (CheckBox) findViewById(R.id.unsupervised_checkbox);
        boolean hasUnsupervised = UnsupervisedCheckBox.isChecked();

        if (hasUnsupervised) {
            increment_score();
        }

        // Figure out if the user chose "Semisupervised" answer
        CheckBox SemisupervisedCheckBox = (CheckBox) findViewById(R.id.semisupervised_checkbox);
        boolean hasSemisupervised = SemisupervisedCheckBox.isChecked();

        if (hasSemisupervised) {
            increment_score();
        }

        // Figure out if the user chose "Reinforcement" answer
        CheckBox ReinforcementCheckBox = (CheckBox) findViewById(R.id.reinforcement_checkbox);
        boolean hasReinforcement = ReinforcementCheckBox.isChecked();

        if (hasReinforcement) {
            increment_score();
        }

        // Figure out if the user chose "Reward" answer
        CheckBox RewardCheckBox = (CheckBox) findViewById(R.id.reward_checkbox);
        boolean hasReward = RewardCheckBox.isChecked();

        if (hasReward) {
            decrement_score();
        }
    }

    /**
     * This method counter correct answers in question 2
     * "Which of the following statements best describes confidentiality of information?"
     */
    public void question_2() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_2);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.answer_2_1_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_1_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.answer_2_2_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_3_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.answer_2_4_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 3
     * "According to Cisco, organizational data is classified into four categories. Which of the following is NOT classification category?"
     */
    public void question_3() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_3);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.trusty_worthy_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.trusty_worthy_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.publ_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.sensitive_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.confidential_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.private_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 4
     * "What are the THREE types of machine learning"
     */
    public void question_4() {
        // Figure out if the user chose "Decision Tree Learning" answer
        CheckBox DecisionCheckBox = (CheckBox) findViewById(R.id.decision_tree_checkbox);
        boolean hasDecision = DecisionCheckBox.isChecked();

        if (hasDecision) {
            increment_score();
        }

        // Figure out if the user chose "associate rule" answer
        CheckBox AssociateCheckBox = (CheckBox) findViewById(R.id.associate_rule);
        boolean hasAssociate = AssociateCheckBox.isChecked();

        if (hasAssociate) {
            increment_score();
        }

        // Figure out if the user chose "Artifical Neural Network" answer

        CheckBox ArtificalCheckBox = (CheckBox) findViewById(R.id.artifical_neural);
        boolean hasArtifical = ArtificalCheckBox.isChecked();

        if (hasArtifical) {
            increment_score();
        }

        // Figure out if the user chose "Sleep Learning" answer

        CheckBox SleepCheckBox = (CheckBox) findViewById(R.id.sleep_learning);
        boolean hasSleep = SleepCheckBox.isChecked();

        if (hasSleep) {
            decrement_score();
        }


        // Figure out if the user chose "Cluttering" answer
        CheckBox ClutteringCheckBox = (CheckBox) findViewById(R.id.cluttering);


        boolean hasCluttering = ClutteringCheckBox.isChecked();

        if (hasCluttering) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 5
     * (Choose 3 best answers)"
     */
    public void question_5() {
        CheckBox Answer_5_1_CheckBox = (CheckBox) findViewById(R.id.answer_5_1_checkbox);
        boolean hasAnswer_5_1_CheckBox = Answer_5_1_CheckBox.isChecked();

        if (hasAnswer_5_1_CheckBox) {
            increment_score();
        }

        CheckBox Answer_5_3_CheckBox = (CheckBox) findViewById(R.id.answer_5_3_checkbox);
        boolean hasAnswer_5_3_CheckBox = Answer_5_3_CheckBox.isChecked();

        if (hasAnswer_5_3_CheckBox) {
            increment_score();
        }

        CheckBox Answer_5_4_CheckBox = (CheckBox) findViewById(R.id.answer_5_4_checkbox);
        boolean hasAnswer_5_4_CheckBox = Answer_5_4_CheckBox.isChecked();

        if (hasAnswer_5_4_CheckBox) {
            increment_score();
        }
    }

    /**
     * This method calculates the right score for edittext
     */

    public boolean question_6() {
        EditText et = (EditText) findViewById(R.id.question_6_edit_text);


        if (true) {
            increment_score();
        }

        return et.getText().toString().equalsIgnoreCase(q6_answer);
    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayResult(String result) {
        TextView testResultTextView = (TextView) findViewById(R.id.test_result_text_view);
        testResultTextView.setText(result);
    }


    /**
     * This method is called when user selected the correct answer.
     * Added +1 to score for each correct answer
     */
    private int increment_score() {
        score = ++score;
        return score;


    }

    private int decrement_score() {
        score = --score;
        return score;


    }

    private int partial_score() {
        score = --score;
        return score;


    }
}