package br.com.fiap.penny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] gridImgList = new int[]{R.drawable.bear_creek, R.drawable.chickbean, R.drawable.hellmans, R.drawable.mustela_baby,
                R.drawable.organics, R.drawable.pbutter, R.drawable.reeses, R.drawable.veggie_spirals, R.drawable.ritz,
                R.drawable.organics, R.drawable.veggie_spirals, R.drawable.mustela_baby
        };

        GridView gridViewItems = (GridView) findViewById(R.id.gridViewItems);
        gridViewItems.setAdapter(new Adapter(this, gridImgList));
    }
}
