package cl.pingon.catalogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView favHome1 = findViewById(R.id.favHome1Tv);
        TextView favHome2 = findViewById(R.id.favHome2Tv);
        TextView favHome3 = findViewById(R.id.favHome3Tv);
        TextView favHome4 = findViewById(R.id.favHome4Tv);
        TextView favHome5 = findViewById(R.id.favHome5Tv);
        TextView favHome6 = findViewById(R.id.favHome6Tv);
        Button addBtn = findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addBtnIntent = new Intent(MainActivity.this, CatalogActivity.class);
                startActivity(addBtnIntent);
            }
        });






    }
}
