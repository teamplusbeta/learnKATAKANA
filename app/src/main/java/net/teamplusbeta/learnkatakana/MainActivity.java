package net.teamplusbeta.learnkatakana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerForImageButton();
    }

    public void addListenerForImageButton() {
        button = (Button)findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
                finish();
                // 次画面のアクティビティ起動
                startActivity(intent);
            }
        });
    }
}
