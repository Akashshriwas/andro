// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class aa extends BroadcastReceiver
{
    final /* synthetic */ m a;
    
    aa(final m a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        try {
            if (intent.getAction().compareTo("android.intent.action.HEADSET_PLUG") == 0 && intent.getIntExtra("state", -1) == 0 && this.a.C != null && this.a.C.isPlaying()) {
                this.a.C.pause();
                this.a.w.setBackgroundResource(2130837586);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
