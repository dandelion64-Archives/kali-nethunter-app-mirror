package com.offsec.nethunter.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.offsec.nethunter.service.RunAtBootService;

public class BootCompletedReceiver extends BroadcastReceiver{
        private static final String TAG = "BootCompletedReceiver";
        @Override
        public void onReceive(Context context, Intent intent) {
            if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
                Intent serviceIntent = new Intent(context, RunAtBootService.class);
                context.startService(serviceIntent);
                Log.d(TAG, "Nethunter receive boot_completed intent!!");
            }
        }
}
