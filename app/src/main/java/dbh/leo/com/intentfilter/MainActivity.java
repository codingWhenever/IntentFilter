package dbh.leo.com.intentfilter;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private Button startServiceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);

        startServiceBtn = (Button) findViewById(R.id.startServiceBtn);
        startServiceBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.startServiceBtn:
                //java.lang.IllegalArgumentException: Service Intent must be explicit:
                //5.0以后需要显示调用
//                Intent intent = new Intent("dbh.leo.com.intentfilter.MyService");

                Intent intent = new Intent(this, MyService.class);
                intent.setAction(MyService.class.getSimpleName());
                startService(intent);
                break;
            case R.id.btn:
                Intent i = new Intent("com.leo.a");
                i.addCategory("com.leo.c");
                //uri 默认content file
                i.setDataAndType(Uri.parse("content://abc"), "text/plain");

                PackageManager pm = getPackageManager();
                ResolveInfo info = pm.resolveActivity(i, PackageManager.MATCH_ALL);

                ComponentName name = i.resolveActivity(getPackageManager());

                List<ResolveInfo> list = pm.queryIntentActivities(i, PackageManager.MATCH_DEFAULT_ONLY);
                if (list != null && list.size() > 0) {

                }

                startActivity(i);
                break;
        }
    }
}
