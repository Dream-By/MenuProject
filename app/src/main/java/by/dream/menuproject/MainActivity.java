package by.dream.menuproject;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        TextView infoTextView = findViewById(R.id.textView);

        switch (id){
            case R.id.action_cat1:
                infoTextView.setText("Вы выбрали кота!");

            case R.id.action_cat2:
                infoTextView.setText("Вы выбрали кошку!");

            case R.id.action_cat3:
                infoTextView.setText("Вы выбрали котенка!");
                return true;
            default:
            return super.onOptionsItemSelected(item);
        }
    }
}
