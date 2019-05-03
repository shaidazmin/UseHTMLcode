package com.example.nz.usehtmlcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String string = "<h1> This is heading </h1>" +
            "<h2> This is heading </h2>"+
            "<h3> This is heading </h3>"+
            "<h4> This is heading </h4>"+
            "<h5> This is heading </h5>"+
            "<p> This is a pragraph </p>"+
            "<u> this is uderscore ... </u>"+
            "<b> This is bold </b>"+
            "<i> This is italic </i>"+
            "<ol> This is order list</ol>"+
            "<ol> This is order list</ol>"+
            "<ol> This is order list</ol>"+
            "<il> This is unorder List </il>"+
            "<il> This is unorder List </il>"+
            "<il> This is unorder List </il> </br>"+
            "(a+b)<sup>2</sup> = a <sup> 2</sup> + 2ab + b <sup>2</sup>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Html.fromHtml(string));



    }
}
