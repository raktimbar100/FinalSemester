
package com.applicationslab.ayurvedictreatment.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.applicationslab.ayurvedictreatment.R;
import com.applicationslab.ayurvedictreatment.adapter.FeedbackAdapter;
import com.applicationslab.ayurvedictreatment.datamodel.FeedbackData;

import java.util.ArrayList;

public class ViewFeedbackActivity extends AppCompatActivity {

    LinearLayout linearFeedback;
    LinearLayout linearMessage;
    TextView txtMessage;
    TextView txtCount;
    RecyclerView recyclerViewFeedback;

    FeedbackAdapter adapter;
    ArrayList<FeedbackData> feedbackDatas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_feedback);
        initView();
        initData();
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
        getSupportActionBar().setTitle("Feedbacks");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtMessage = findViewById(R.id.txtMessage);
        txtCount = findViewById(R.id.txtCount);
        linearMessage = findViewById(R.id.linearMessage);
        linearFeedback = findViewById(R.id.linearFeedback);
        recyclerViewFeedback = findViewById(R.id.recyclerViewFeedback);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewFeedback.setLayoutManager(layoutManager);

        // Dummy feedback data (can be replaced with actual data from backend)
        feedbackDatas = getDummyFeedback();

        setAdapter();
    }

    private void setAdapter() {
        adapter = new FeedbackAdapter(this, feedbackDatas);
        recyclerViewFeedback.setAdapter(adapter);
        if (feedbackDatas.size() > 0) {
            String text = feedbackDatas.size() + " feedbacks found";
            txtCount.setText(text);
            linearMessage.setVisibility(View.GONE);
            linearFeedback.setVisibility(View.VISIBLE);
        } else {
            linearFeedback.setVisibility(View.GONE);
            linearMessage.setVisibility(View.VISIBLE);
        }
    }

    private ArrayList<FeedbackData> getDummyFeedback() {
        // Dummy feedback data
        ArrayList<FeedbackData> dummyFeedback = new ArrayList<>();
        dummyFeedback.add(new FeedbackData("Pradeep", "The interface is incredibly intuitive, making it easy to navigate through the app and find the information I need.."));
        dummyFeedback.add(new FeedbackData("Vikash", "I appreciate how AyurPulse provides personalized recommendations tailored to my unique needs, rather than offering generic advice."));
        dummyFeedback.add(new FeedbackData("Priya Sharma", "The integration of machine learning to personalize recommendations based on my BMI and symptoms is truly innovative and adds a new dimension to traditional Ayurvedic practices."));
        dummyFeedback.add(new FeedbackData("Rajesh", "I found the 'do's and don'ts' section based on my Ayurvedic constitution particularly helpful in guiding me towards a healthier lifestyle."));
        dummyFeedback.add(new FeedbackData("Ravi", "The option to connect with qualified Ayurvedic doctors and hospitals directly through the app is a game-changer, providing a seamless experience for holistic healthcare."));
        dummyFeedback.add(new FeedbackData("Anjali", "The app's focus on promoting natural remedies over conventional medications aligns perfectly with my wellness goals, and I appreciate having access to this valuable information."));
        dummyFeedback.add(new FeedbackData("Alok", "I love how AyurPulse empowers me to take charge of my health by providing comprehensive information about Ayurvedic plants and their benefits."));
        dummyFeedback.add(new FeedbackData("Preeti", "The ability to analyze my symptoms and receive tailored recommendations for natural remedies is incredibly convenient and reassuring."));
        dummyFeedback.add(new FeedbackData("Vikram", "The educational content provided within the app offers a deep dive into Ayurvedic principles, allowing me to better understand the holistic approach to well-being."));
        dummyFeedback.add(new FeedbackData("Neha", "Overall, AyurPulse has exceeded my expectations in bridging the gap between ancient Ayurvedic wisdom and modern healthcare needs. It's become an essential tool in my wellness journey."));
        return dummyFeedback;
    }


    private void initData() {
        // Fetch feedback from backend (Future work)
    }
}
