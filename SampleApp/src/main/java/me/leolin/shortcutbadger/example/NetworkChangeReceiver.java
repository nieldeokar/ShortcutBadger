package me.leolin.shortcutbadger.example;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class NetworkChangeReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        try
        {

                Log.e("ABCD", "Conectivity Failure !!! ");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
