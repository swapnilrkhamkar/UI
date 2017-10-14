package example.swapnil.com.cymourui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView mapImage;
    private TextView kilometers,calories,time,bpm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapImage = (ImageView) findViewById(R.id.mapImage);
        kilometers = (TextView) findViewById(R.id.kilometers);
        calories = (TextView) findViewById(R.id.calories);
        time = (TextView) findViewById(R.id.time);
        bpm = (TextView) findViewById(R.id.bpm);

        mapImage.setImageResource(R.drawable.samplemap);
        kilometers.setText("10km");
        calories.setText("30 calories");
        time.setText("30 min");
        bpm.setText("20 bpm");
    }
}
