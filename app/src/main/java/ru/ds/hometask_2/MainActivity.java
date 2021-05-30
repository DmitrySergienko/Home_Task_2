package ru.ds.hometask_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] numberID = new int[]{
                R.id.key_0,
                R.id.key_1,
                R.id.key_2,
                R.id.key_3,
                R.id.key_4,
                R.id.key_5,
                R.id.key_6,
                R.id.key_7,
                R.id.key_8,
                R.id.key_9
        };
        int[] actionsID = new int[]{
                R.id.key_sum,
                R.id.key_sub,
                R.id.key_multiplication,
                R.id.key_division,
                R.id.key_percent,
                R.id.key_equally,
                R.id.key_dot,
        };

    }
}