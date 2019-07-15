package com.example.bottomsheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomSheetDialog.BottomSheetListener {
private TextView mtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bottom_dialog = (Button)findViewById(R.id.bottom_sheet_btn);
        mtext = (TextView)findViewById(R.id.textView);
        bottom_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog dialog = new BottomSheetDialog();
                dialog.show(getSupportFragmentManager(),"bottomSheetDialog");
            }
        });

    }

    @Override
    public void onButtonClicked(String text) {
        mtext.setText(text);
    }
}
