package com.example.priya.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void functionConvert(View view)
    {


        EditText editText=(EditText) findViewById(R.id.editText);
        String amountinpounds=(editText).getText().toString();
        Double amountinpoundsDouble=Double.parseDouble(amountinpounds);
        Double amountinDollarsDouble=amountinpoundsDouble*1.3;
        String amountinDollarsString=Double.toString(amountinDollarsDouble);
        Log.i(" AmountInDollars",amountinDollarsString);



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
