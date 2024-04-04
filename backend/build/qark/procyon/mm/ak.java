// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class ak extends BroadcastReceiver
{
    final /* synthetic */ pr a;
    
    ak(final pr a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        try {
            intent.getAction().compareTo("android.intent.action.HEADSET_PLUG");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
