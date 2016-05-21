package dbh.leo.com.intentfilter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by leo on 2016/5/21.
 */
public class SecondActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        btn = (Button) findViewById(R.id.myBtn);
        btn.setText(this.getClass().getSimpleName());
    }
}
