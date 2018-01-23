package com.farrush.gw.quizandroiddiscount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText soi;
    EditText price;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soi = (EditText)findViewById(R.id.soi);
        price = (EditText)findViewById(R.id.price);
        btn = (Button)findViewById(R.id.btn);
        txt = (TextView)findViewById(R.id.txt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nsoi = soi.getText().toString();
                String nprice = price.getText().toString();

                if(nsoi.isEmpty()){
                    soi.setError("Wajib Diisi");
                }else if(nprice.isEmpty()){
                    price.setError("Isi Dulu");
                }else{
                    int aprice = Integer.parseInt(nprice);
                    int asoi = Integer.parseInt(nsoi);

                    if(asoi > 10){
                        txt.setText("Before Discount: " + nprice + " After Discount: " + aprice / 2);
                    }else{
                        txt.setText("Before Discount: " + nprice + ", Now: You Didnt Have Any Discount :)");
                    }
                }
            }
        });
    }
}
