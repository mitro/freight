package rt.dtech.kz.freight.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rt.dtech.kz.freight.R;

public class RegistrationCodeActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_registration_code);

    setTitle("Подтверждение регистрации");
  }
}
