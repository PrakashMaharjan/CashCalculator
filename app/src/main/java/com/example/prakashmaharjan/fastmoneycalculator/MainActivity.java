package com.example.prakashmaharjan.fastmoneycalculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onClearButtonClick(View v) {

        EditText thousandTextInput = (EditText) findViewById(R.id.editText1);
        EditText fiveHundredTextInput = (EditText) findViewById(R.id.editText2);
        EditText hundredTextInput = (EditText) findViewById(R.id.editText3);
        EditText fiftyTextInput = (EditText) findViewById(R.id.editText4);
        EditText twentyTextInput = (EditText) findViewById(R.id.editText5);
        EditText tenTextInput = (EditText) findViewById(R.id.editText6);
        EditText fiveTextInput = (EditText) findViewById(R.id.editText7);
        EditText twoTextInput = (EditText) findViewById(R.id.editText8);
        EditText oneTextInput = (EditText) findViewById(R.id.editText9);

        EditText thousandResultText = (EditText) findViewById(R.id.editText18);
        EditText fivehundredResultText = (EditText) findViewById(R.id.editText19);
        EditText hundredResultText = (EditText) findViewById(R.id.editText20);
        EditText fiftyResultText = (EditText) findViewById(R.id.editText21);
        EditText twentyResultText = (EditText) findViewById(R.id.editText22);
        EditText tenResultText = (EditText) findViewById(R.id.editText23);
        EditText fiveResultText = (EditText) findViewById(R.id.editText24);
        EditText twoResultText = (EditText) findViewById(R.id.editText25);
        EditText oneResultText = (EditText) findViewById(R.id.editText26);

        EditText finalResultText = (EditText) findViewById(R.id.editText27);

        finalResultText.setText("");

        thousandTextInput.setText("");
        fiveHundredTextInput.setText("");
        hundredTextInput.setText("");
        fiftyTextInput.setText("");
        twentyTextInput.setText("");
        tenTextInput.setText("");
        fiveTextInput.setText("");
        twoTextInput.setText("");
        oneTextInput.setText("");


        thousandResultText.setText("");
        fivehundredResultText.setText("");
        hundredResultText.setText("");
        fiftyResultText.setText("");
        twentyResultText.setText("");
        tenResultText.setText("");
        fiveResultText.setText("");
        twoResultText.setText("");
        oneResultText.setText("");

    }

    public void onCalculateButtonClick(View v) {

        //for user input
        EditText thousandTextInput = (EditText) findViewById(R.id.editText1);
        EditText fiveHundredTextInput = (EditText) findViewById(R.id.editText2);
        EditText hundredTextInput = (EditText) findViewById(R.id.editText3);
        EditText fiftyTextInput = (EditText) findViewById(R.id.editText4);
        EditText twentyTextInput = (EditText) findViewById(R.id.editText5);
        EditText tenTextInput = (EditText) findViewById(R.id.editText6);
        EditText fiveTextInput = (EditText) findViewById(R.id.editText7);
        EditText twoTextInput = (EditText) findViewById(R.id.editText8);
        EditText oneTextInput = (EditText) findViewById(R.id.editText9);


        //multiplier value
        EditText thousand = (EditText) findViewById(R.id.editText);
        EditText fivehundred = (EditText) findViewById(R.id.editText10);
        EditText hundred = (EditText) findViewById(R.id.editText11);
        EditText fifty = (EditText) findViewById(R.id.editText12);
        EditText twenty = (EditText) findViewById(R.id.editText13);
        EditText ten = (EditText) findViewById(R.id.editText14);
        EditText five = (EditText) findViewById(R.id.editText15);
        EditText two = (EditText) findViewById(R.id.editText16);
        EditText one = (EditText) findViewById(R.id.editText17);


        //result value text field
        EditText thousandResultText = (EditText) findViewById(R.id.editText18);
        EditText fivehundredResultText = (EditText) findViewById(R.id.editText19);
        EditText hundredResultText = (EditText) findViewById(R.id.editText20);
        EditText fiftyResultText = (EditText) findViewById(R.id.editText21);
        EditText twentyResultText = (EditText) findViewById(R.id.editText22);
        EditText tenResultText = (EditText) findViewById(R.id.editText23);
        EditText fiveResultText = (EditText) findViewById(R.id.editText24);
        EditText twoResultText = (EditText) findViewById(R.id.editText25);
        EditText oneResultText = (EditText) findViewById(R.id.editText26);

        long thousandValue;
        long fivehundredValue;
        long hundredValue;
        long fiftyValue;
        long twentyValue;
        long tenValue;
        long fiveValue;
        long twoValue;
        long oneValue;


        if (thousandTextInput.getText().toString().matches("")) {
            //thousandTextInput.setText(Integer.toString(0));
            thousandValue = 0 * Long.parseLong(thousand.getText().toString());
        } else {
            thousandValue = Long.parseLong(thousandTextInput.getText().toString()) * Integer.parseInt(thousand.getText().toString());
        }

        if (fiveHundredTextInput.getText().toString().matches("")) {
            //fiveHundredTextInput.setText(Integer.toString(0));
            fivehundredValue = 0 * Long.parseLong(fivehundred.getText().toString());
        } else {
            fivehundredValue = Long.parseLong(fiveHundredTextInput.getText().toString()) * Integer.parseInt(fivehundred.getText().toString());
        }


        if (hundredTextInput.getText().toString().matches("")) {
            //hundredTextInput.setText(Integer.toString(0));
            hundredValue = 0 * Long.parseLong(hundred.getText().toString());

        } else {
            hundredValue = Long.parseLong(hundredTextInput.getText().toString()) * Integer.parseInt(hundred.getText().toString());

        }

        if (fiftyTextInput.getText().toString().matches("")) {
            //fiftyTextInput.setText(Integer.toString(0));
            fiftyValue = 0 * Long.parseLong(fifty.getText().toString());
        } else {
            fiftyValue = Long.parseLong(fiftyTextInput.getText().toString()) * Integer.parseInt(fifty.getText().toString());
        }

        if (twentyTextInput.getText().toString().matches("")) {
            //twentyTextInput.setText(Integer.toString(0));
            twentyValue = 0 * Long.parseLong(twenty.getText().toString());
        } else {
            twentyValue = Long.parseLong(twentyTextInput.getText().toString()) * Integer.parseInt(twenty.getText().toString());
        }

        if (tenTextInput.getText().toString().matches("")) {
            //tenTextInput.setText(Integer.toString(0));
            tenValue = 0 * Long.parseLong(ten.getText().toString());
        } else {
            tenValue = Long.parseLong(tenTextInput.getText().toString()) * Integer.parseInt(ten.getText().toString());
        }

        if (fiveTextInput.getText().toString().matches("")) {
            // fiveTextInput.setText(Integer.toString(0));
            fiveValue = 0 * Long.parseLong(five.getText().toString());
        } else {
            fiveValue = Long.parseLong(fiveTextInput.getText().toString()) * Integer.parseInt(five.getText().toString());
        }

        if (twoTextInput.getText().toString().matches("")) {
            //twoTextInput.setText(Integer.toString(0));
            twoValue = 0 * Long.parseLong(two.getText().toString());
        } else {
            twoValue = Long.parseLong(twoTextInput.getText().toString()) * Integer.parseInt(two.getText().toString());
        }

        if (oneTextInput.getText().toString().matches("")) {
            //oneTextInput.setText(Integer.toString(0));
            oneValue = 0 * Long.parseLong(one.getText().toString());
        } else {
            oneValue = Long.parseLong(oneTextInput.getText().toString()) * Integer.parseInt(one.getText().toString());
        }


        thousandResultText.setText(Long.toString(thousandValue));
        fivehundredResultText.setText(Long.toString(fivehundredValue));
        hundredResultText.setText(Long.toString(hundredValue));
        fiftyResultText.setText(Long.toString(fiftyValue));
        twentyResultText.setText(Long.toString(twentyValue));
        tenResultText.setText(Long.toString(tenValue));
        fiveResultText.setText(Long.toString(fiveValue));
        twoResultText.setText(Long.toString(twoValue));
        oneResultText.setText(Long.toString(oneValue));

        //oneResultText.setText(Integer.toString(oneValue));


        long totalSum = thousandValue + fivehundredValue + hundredValue + fiftyValue + twentyValue + tenValue + fiveValue + twoValue + oneValue;

        //int totalSum = oneValue;
        EditText finalResultText = (EditText) findViewById(R.id.editText27);

        finalResultText.setText(Long.toString(totalSum));


        //TextView thousandDisplay = (TextView)findViewById(R.id.resultTxtViewID);

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
