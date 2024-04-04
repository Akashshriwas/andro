// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class ap extends BroadcastReceiver
{
    final /* synthetic */ rc a;
    
    ap(final rc a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        try {
            if (intent.getAction().compareTo("android.intent.action.HEADSET_PLUG") == 0 && intent.getIntExtra("state", -1) == 0 && this.a.y != null && this.a.y.isPlaying()) {
                this.a.y.pause();
                this.a.v.setBackgroundResource(2130837595);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
