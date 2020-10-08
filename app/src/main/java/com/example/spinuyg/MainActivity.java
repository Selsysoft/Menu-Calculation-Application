package com.example.spinuyg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spin;
    Button btnekle;
    TextView text, textsonuc;
    int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnekle = (Button)findViewById(R.id.eklebutton);
        text = (TextView)findViewById(R.id.txt);
        textsonuc = (TextView)findViewById(R.id.textView);
        spin = (Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        text.setText("2");
                        break;
                    case 1:
                        text.setText("5");
                        break;
                    case 2:
                        text.setText("3");
                        break;
                    case 3:
                        text.setText("4");
                        break;
                }
            }

                @Override
                public void onNothingSelected(AdapterView< ? > parent) {

                }
        });
    btnekle.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a;
            a=Integer.parseInt(text.getText().toString());
            b=b+a;
            textsonuc.setText("Toplam : "+b);
        }
    });
btnekle.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(getApplicationContext(),"Hesabınız : "+b+" TL'dir",Toast.LENGTH_LONG).show();
        return false;
    }
});

    }
}