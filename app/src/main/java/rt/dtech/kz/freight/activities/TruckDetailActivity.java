package rt.dtech.kz.freight.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import rt.dtech.kz.freight.R;

public class TruckDetailActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_truck_detail);

    setTitle("Информация о грузовике");

    fillMakesSpinner();
    fillModelsSpinner();
    fillBodyTypesSpinner();
  }

  private void fillMakesSpinner() {
    Spinner spinner = (Spinner) findViewById(R.id.makesSpinner);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
      this, R.array.makes, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
  }

  private void fillModelsSpinner() {
    Spinner spinner = (Spinner) findViewById(R.id.modelsSpinner);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
      this, R.array.models, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
  }

  private void fillBodyTypesSpinner() {
    Spinner spinner = (Spinner) findViewById(R.id.bodyTypesSpinner);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
      this, R.array.body_types, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
  }

  public void onSaveTruckDetailButtonClicked(View view) {
    //startActivity(new In);
  }
}
