
package com.applicationslab.ayurvedictreatment.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.applicationslab.ayurvedictreatment.R;
import com.applicationslab.ayurvedictreatment.widget.CustomToast;

public class SubmitFeedbackActivity extends AppCompatActivity {

    EditText edtUserName;
    EditText edtFeedback;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_feedback);
        initView();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initView() {
        Toolbar toolBar = findViewById(R.id.toolBar);
        setSupportActionBar(toolBar);
        getSupportActionBar().setTitle("Submit Feedback");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        edtUserName = findViewById(R.id.edtUserName);
        edtFeedback = findViewById(R.id.edtFeedback);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate and submit feedback
                submitFeedback();
            }
        });
    }

    private void submitFeedback() {
        String userName = edtUserName.getText().toString().trim();
        String feedback = edtFeedback.getText().toString().trim();

        // Validate user input
        if (userName.isEmpty() || feedback.isEmpty()) {
            new CustomToast(this, "Please fill all fields.", "", false);
        } else {
            // Submit feedback (can be sent to backend - Future work)
            // For now, simply display a toast indicating success
            new CustomToast(this, "Feedback submitted successfully", "", false);
            // Clear input fields
            edtUserName.setText("");
            edtFeedback.setText("");
        }
    }
}
