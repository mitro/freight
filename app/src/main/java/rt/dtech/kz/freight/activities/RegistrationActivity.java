package rt.dtech.kz.freight.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import rt.dtech.kz.freight.R;
import rt.dtech.kz.freight.domain.UserType;

public class RegistrationActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_registration);

    setTitle("Регистрация");

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

  public void onGetCodeButtonClicked(View view) {
    Intent intent = new Intent(this, RegistrationCodeActivity.class);
    intent.putExtra("userType", getSelectedUserType());

    startActivity(intent);
  }

  private UserType getSelectedUserType() {
    if (((RadioButton) findViewById(R.id.customerRadioButton)).isChecked()) return UserType.Customer;
    if (((RadioButton) findViewById(R.id.driverRadioButton)).isChecked()) return UserType.Driver;

    throw new IllegalStateException();
  }
}
