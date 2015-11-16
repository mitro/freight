package rt.dtech.kz.freight.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import rt.dtech.kz.freight.R;

public class CustomerOrderListActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_customer_order_list);

    setTitle("Мои заказы");

    fillOrdersList();

  }

  private void fillOrdersList() {
    ListView list = (ListView) findViewById(R.id.ordersListView);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
      this, R.array.customer_orders, android.R.layout.simple_list_item_1);
    adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
    list.setAdapter(adapter);
  }
}
