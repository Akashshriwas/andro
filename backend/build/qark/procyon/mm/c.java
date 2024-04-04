// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import java.util.ArrayList;

class c implements Runnable
{
    final /* synthetic */ a a;
    
    c(final a a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            new ArrayList();
            this.a.a(this.a.t());
            this.a.c().runOnUiThread(this.a.R);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
