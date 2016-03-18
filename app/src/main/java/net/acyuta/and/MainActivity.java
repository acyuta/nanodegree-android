package net.acyuta.and;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        String text = "This button will launch my ";
        switch (view.getId()) {
            default:
                text += ((Button)view).getText();
        }

        Toast.makeText(this, text,Toast.LENGTH_SHORT).show();
    }
}
