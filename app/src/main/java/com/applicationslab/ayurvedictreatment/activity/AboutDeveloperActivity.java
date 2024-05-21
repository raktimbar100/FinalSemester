package com.applicationslab.ayurvedictreatment.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.applicationslab.ayurvedictreatment.R;

public class AboutDeveloperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);
        initViews();
    }

    private void initViews() {
        // Developer 1
        TextView txtName1 = findViewById(R.id.developer1name);
        txtName1.setText("Debarghya Chakravarty");
        Button githubButton1 = findViewById(R.id.github_button1);
        githubButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGitHub("https://github.com/Deba951");
            }
        });
        TextView txtBio1 = findViewById(R.id.developer1bio);
        txtBio1.setText(R.string.bio1);
        Button linkedinButton1 = findViewById(R.id.linkedin_button1);
        linkedinButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinkedIn("https://www.linkedin.com/in/debarghya-chakravarty-5a2563238/");
            }
        });

        // Developer 2
        TextView txtName2 = findViewById(R.id.developer2name);
        txtName2.setText("Raktim Bar");
        Button githubButton2 = findViewById(R.id.github_button2);
        githubButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGitHub("https://github.com/raktimbar100");
            }
        });
        TextView txtBio2 = findViewById(R.id.developer2bio);
        txtBio2.setText(R.string.bio2);
        Button linkedinButton2 = findViewById(R.id.linkedin_button2);
        linkedinButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinkedIn("https://www.linkedin.com/in/raktim-bar/");
            }
        });

        // Developer 3
        TextView txtName3 = findViewById(R.id.developer3name);
        txtName3.setText("Supriyo Bose");
        Button githubButton3 = findViewById(R.id.github_button3);
        githubButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGitHub("https://github.com/bosesupriyo");
            }
        });
        TextView txtBio3 = findViewById(R.id.developer3bio);
        txtBio3.setText(R.string.bio3);
        Button linkedinButton3 = findViewById(R.id.linkedin_button3);
        linkedinButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinkedIn("https://www.linkedin.com/in/supriyo-bose-116b8b203/");
            }
        });

        // Developer 4
        TextView txtName4 = findViewById(R.id.developer4name);
        txtName4.setText("Swathik Majumder");
        Button githubButton4 = findViewById(R.id.github_button4);
        githubButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGitHub("https://github.com/Swathik2000");
            }
        });
        TextView txtBio4 = findViewById(R.id.developer4bio);
        txtBio4.setText(R.string.bio4);
        Button linkedinButton4 = findViewById(R.id.linkedin_button4);
        linkedinButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinkedIn("https://www.linkedin.com/in/swathik-majumder-038080210/");
            }
        });

        // Developer 5
        TextView txtName5 = findViewById(R.id.developer5name);
        txtName5.setText("Tunir Chakraborty");
        Button githubButton5 = findViewById(R.id.github_button5);
        githubButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGitHub("https://github.com/Tanzo11");
            }
        });
        TextView txtBio5 = findViewById(R.id.developer5bio);
        txtBio5.setText(R.string.bio5);
        Button linkedinButton5 = findViewById(R.id.linkedin_button5);
        linkedinButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinkedIn("https://www.linkedin.com/in/tunir-chakraborty-9342481aa?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app");
            }
        });
    }

    private void openGitHub(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    private void openLinkedIn(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
