package com.jayant.staywithme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class RewardsActivity extends AppCompatActivity {

    private String MyPREFERENCES = "key_reward";
    private String reward_key  = "key_reward";
    int coins;
    TextView tv_coins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);

        tv_coins = findViewById(R.id.tv_coins);

        SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        coins = sharedpreferences.getInt(reward_key, 0);
        tv_coins.setText(String.valueOf(coins));
    }
}
