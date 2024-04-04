// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import com.google.android.gms.ads.d;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class al extends BroadcastReceiver
{
    final /* synthetic */ pr a;
    
    al(final pr a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        try {
            if (this.a.y != null) {
                this.a.y.a(new d().a());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
