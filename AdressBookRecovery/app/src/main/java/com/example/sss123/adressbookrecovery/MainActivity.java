package com.example.sss123.adressbookrecovery;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.RadioButton;
import android.provider.ContactsContract;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    TextView final_result;
    Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final_result =(TextView)findViewById(R.id.textView2);
        final_result.setEnabled(false);


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
    }

    public void SelectOperator(View view){

        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId())
        {
            case R.id.radioButton :
                if(checked){

                    final_result.setText("avea");
                    final_result.setEnabled(true);
                }
                else{
                    final_result.setEnabled(false);
                }

                break;

            case R.id.radioButton2 :
                if(checked){

                    final_result.setText("turkcell");
                    final_result.setEnabled(true);
                }
                else{
                    final_result.setEnabled(false);
                }

                break;

            case R.id.radioButton3 :
                if(checked){

                    final_result.setText("vodafone");
                    final_result.setEnabled(true);
                }
                else{
                    final_result.setEnabled(false);
                }

                break;

            case R.id.radioButton4 :
                if(checked){

                    final_result.setText("all");
                    final_result.setEnabled(true);
                    //startActivityForResult(intent, PICK_CONTACT);

                }
                else{
                    final_result.setEnabled(false);
                }

                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
