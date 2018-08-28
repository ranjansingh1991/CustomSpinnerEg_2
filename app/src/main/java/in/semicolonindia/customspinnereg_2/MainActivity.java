package in.semicolonindia.customspinnereg_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;
@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    String[] SPINNERLIST = {
            "Android Material Design",
            "Material Design Spinner",
            "Spinner Using Material Library",
            "Material Spinner Example"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialBetterSpinner materialDesignSpinner = (MaterialBetterSpinner)
                findViewById(R.id.android_material_design_spinner);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
        materialDesignSpinner.setAdapter(arrayAdapter);
    }
}
