import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    
    String[] labels = {
            "Camera", "Camera Roll", "Featured",
            "My Videos", "Likes", "Watch Later",
            "Stats", "Subscriptions", "Help"
    };
    
    int[] images = {
            R.drawable.camera, R.drawable.camera_roll, R.drawable.featured,
            R.drawable.my_videos, R.drawable.likes, R.drawable.watch_later,
            R.drawable.stats, R.drawable.subscriptions, R.drawable.help
    };
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        gridView = findViewById(R.id.gridView);
        GridAdapter adapter = new GridAdapter(this, labels, images);
        gridView.setAdapter(adapter);
    }
}

