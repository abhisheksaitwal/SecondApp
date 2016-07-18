package examaple.yugenspark.com.secondapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txt_name  = (TextView)findViewById(R.id.name);
        TextView txt_email = (TextView)findViewById(R.id.email);
        TextView txt_contactno = (TextView)findViewById(R.id.contactno);
        TextView txt_dob = (TextView)findViewById(R.id.dob);
        Intent intent = getIntent();

        String get_name = intent.getStringExtra("send_name");
        String get_email = intent.getStringExtra("send_email");
        String get_contactno = intent.getStringExtra("send_contact");
        String get_dob = intent.getStringExtra("send_dob");

        txt_name.setText(get_name);
        txt_email.setText(get_email);
        txt_contactno.setText(get_contactno);
        txt_dob.setText(get_dob);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
