package com.example.nz.usehtmlcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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

    WebView webView;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // using html code in android ...



        webView = (WebView) findViewById(R.id.webViewId);
        webView.loadDataWithBaseURL(null,string,"text/html","utf-8",null);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });


        // use logo for app
         getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        // use back button

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
