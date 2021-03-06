package com.example.android.datetimepickers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.support.v4.app.DialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();

        newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }

    public void showDatePickerDialog(View view) {
        DialogFragment newFragment = new DatePickerFragment();

        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }
    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);

        String day_string = Integer.toString(day);

        String year_string = Integer.toString(year);
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);

        Toast.makeText(this, getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show();
    }
    public void processTimePickerResult(int hourOfDay, int minute) {
        String hour_string = Integer.toString(hourOfDay);

        String minute_string = Integer.toString(minute);
        String timeMessage = (hour_string + ":" + minute_string);

        Toast.makeText(this, getString(R.string.time) + timeMessage, Toast.LENGTH_SHORT).show();
    }
}
