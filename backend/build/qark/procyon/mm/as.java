// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import com.google.android.gms.ads.d;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class as extends BroadcastReceiver
{
    final /* synthetic */ rc a;
    
    as(final rc a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        try {
            if (this.a.H != null) {
                this.a.H.a(new d().a());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
