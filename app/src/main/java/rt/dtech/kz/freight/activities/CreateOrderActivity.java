package rt.dtech.kz.freight.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import rt.dtech.kz.freight.R;

public class CreateOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_create_order);

      setTitle("Создание заказа");

      fillCargoTypesSpinner();
    }

    private void fillCargoTypesSpinner() {
      Spinner spinner = (Spinner) findViewById(R.id.cargoTypesSpinner);
      ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
        this, R.array.cargoTypes, android.R.layout.simple_spinner_item);
      adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
      spinner.setAdapter(adapter);
    }

  public void onPlaceOrderButtonClicked(View view) {
    startActivity(new Intent(this, OrderDetailActivity.class));
  }

  public void onOriginTextViewClicked(View view) {
    startActivity(new Intent(this, MapActivity.class));
  }

  public void onDestinationTextViewClicked(View view) {
    startActivity(new Intent(this, MapActivity.class));
  }
}
