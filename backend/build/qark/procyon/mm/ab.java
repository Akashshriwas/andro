// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import com.google.android.gms.ads.d;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class ab extends BroadcastReceiver
{
    final /* synthetic */ m a;
    
    ab(final m a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        try {
            if (this.a.J != null) {
                this.a.J.a(new d().a());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
