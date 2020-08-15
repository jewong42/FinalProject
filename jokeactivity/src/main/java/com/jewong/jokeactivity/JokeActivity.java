package com.jewong.jokeactivity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jewong.jokeactivity.databinding.ActivityJokeBinding;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "JOKE_KEY";
    private ActivityJokeBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        initInstance();
        resolveIntent(getIntent());
    }

    private void initInstance() {
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_joke);
    }

    private void resolveIntent(Intent intent) {
        if (intent != null) {
            final String joke = intent.getStringExtra(JOKE_KEY);
            mBinding.jokeTextView.setText(joke);
        }
    }

}