package com.lifeistech.android.litboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener{
    FirebaseDatabase database =  FirebaseDatabase.getInstance();
    DatabaseReference refMsg = database.getReference("massage");

    EditText mUsernameText;
    EditText mPostText;
    Button mPostButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsernameText = (EditText)findViewById(R.id.username);
        mPostText = (EditText)findViewById(R.id.message);
        mPostButton = (Button)findViewById(R.id.post);

        mPostButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        int id = v.getId();

        switch (id){
            case  R.id.post:
                String message=  mPostText.getText().toString();
                String userName = mUsernameText.getText().toString();
                Post post = new Post(userName,message);

                refMsg.push().setValue(post);
                //ボタンを押したときの処理
                finish();
                break;
        }
    }
}
