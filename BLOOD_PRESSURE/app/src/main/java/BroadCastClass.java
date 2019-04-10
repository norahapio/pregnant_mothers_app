import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class BroadCastClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Toast.makeText(context,"System Boot Completed Sucessfully",Toast.LENGTH_SHORT).show();
        }
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
            Toast.makeText(context,"Data connectivity has been changes",Toast.LENGTH_SHORT).show();
        }
    }
}
