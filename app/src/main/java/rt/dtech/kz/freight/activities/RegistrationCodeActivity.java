package rt.dtech.kz.freight.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import rt.dtech.kz.freight.R;
import rt.dtech.kz.freight.domain.UserType;

public class RegistrationCodeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_registration_code);

    setTitle("Подтверждение регистрации");
  }

  public void onConfirmRegistrationButtonClicked(View view) {
    UserType userType = (UserType) getIntent().getExtras().get("userType");

    if (userType == UserType.Customer) {
      startActivity(new Intent(this, CreateOrderActivity.class));
    }
    else if (userType == UserType.Driver) {
      startActivity(new Intent(this, TruckDetailActivity.class));
    }
    else {
      throw new IllegalStateException();
    }
  }
}
