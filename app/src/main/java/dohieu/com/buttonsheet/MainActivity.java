package dohieu.com.buttonsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ButtonSheetDialog = findViewById(R.id.btnOpenBsheet);
        ButtonSheetDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExampleButtonSheetDialog exampleButtonSheetDialog = new ExampleButtonSheetDialog();
                exampleButtonSheetDialog.show(getSupportFragmentManager(),"example");
            }
        });
    }

    public void ok(View view) {
        Toast.makeText(this, "Lưu Ảnh", Toast.LENGTH_SHORT).show();
    }
}
