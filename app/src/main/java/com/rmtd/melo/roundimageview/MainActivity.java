package com.rmtd.melo.roundimageview;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RoundImageView mRoundImageView;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.arg1 == 1) {
                mRoundImageView.setImageResource(R.drawable.beauty);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRoundImageView = (RoundImageView) findViewById(R.id.iv_round);


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Message message = new Message();
                message.arg1 = 1;
                handler.sendMessage(message);
            }
        }, 5000);

    }
}
