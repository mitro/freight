package rt.dtech.kz.freight.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;

import rt.dtech.kz.freight.R;

public class RegistrationActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_registration);

    fillCitiesSpinner();
    setDefaultUserType();
  }

  private void fillCitiesSpinner() {
    Spinner spinner = (Spinner) findViewById(R.id.citiesSpinner);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
      this, R.array.cities, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
  }

  private void setDefaultUserType() {
    RadioGroup group = (RadioGroup) findViewById(R.id.userTypeRadioGroup);
    group.check(R.id.customerRadioButton);
  }
}
