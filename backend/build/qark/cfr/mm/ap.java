/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.media.MediaPlayer
 *  android.widget.Button
 *  java.lang.Exception
 *  java.lang.String
 */
package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Button;
import mm.rc;

class ap
extends BroadcastReceiver {
    final /* synthetic */ rc a;

    ap(rc rc2) {
        this.a = rc2;
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.getAction().compareTo("android.intent.action.HEADSET_PLUG") == 0 && intent.getIntExtra("state", -1) == 0 && this.a.y != null && this.a.y.isPlaying()) {
                this.a.y.pause();
                this.a.v.setBackgroundResource(2130837595);
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}
