package com.raju.vehicledetails;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText year;
    private EditText color;
    private EditText price;
    private EditText size;
    private TextView result;

    private Button createCar;
    private Button createDiesel;

    public static int vehicleNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.activity_main_name);
        year = findViewById(R.id.activity_main_year);
        color = findViewById(R.id.activity_main_color);
        price = findViewById(R.id.activity_main_price);
        size = findViewById(R.id.activity_main_size);
        createCar = findViewById(R.id.activity_main_create_car);
        createDiesel = findViewById(R.id.activity_main_create_diesel);
        result = findViewById(R.id.activity_main_result);

        createCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Car car = new Car(name.getText().toString(),year.getText().toString(),color.getText().toString(),price.getText().toString(),size.getText().toString());
                vehicleNumber++;
                result.setText(result.getText() +
                        "This is vehicle No."+ vehicleNumber+
                        "\n"+
                        "Manufacturer: "+ car.getName() + ","+
                        "Current value: "+ car.getPrice() + ","+
                        "Effective engine size:" + car.getSize() + "\n \n");
            }
        });
    }
}