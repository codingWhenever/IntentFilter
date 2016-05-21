package dbh.leo.com.intentfilter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by leo on 2016/5/21.
 */
public class MyService extends Service {
    private static final String TAG = "MyService--->";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, this.getClass().getSimpleName());

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

}
