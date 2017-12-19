package com.example.opilane.tutvutadaapp12122017;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

/**
 * Created by opilane on 12.12.2017.
 */

public class PildiActivity extends AppCompatActivity{
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pildi);
    }

    public void tagasi(View view) {
        Intent intent = new Intent(PildiActivity.this,MainActivity.class);
        startActivity(intent);
    }
}