// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.content.Context;
import android.content.Intent;

class bc implements Runnable
{
    final /* synthetic */ sp a;
    
    bc(final sp a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final Intent intent = new Intent((Context)this.a.getApplication(), (Class)m.class);
        intent.setFlags(67108864);
        this.a.startActivity(intent);
        this.a.finish();
    }
}
