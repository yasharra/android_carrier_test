package com.example.carriertest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TelephonyManager tManager = (TelephonyManager) getBaseContext()
                .getSystemService(Context.TELEPHONY_SERVICE);
        Toast.makeText(getBaseContext(), tManager.getNetworkOperatorName(), Toast.LENGTH_LONG).show();

        TextView textView = findViewById(R.id.textView);
        textView.setText(tManager.getNetworkOperatorName());

    }
}
