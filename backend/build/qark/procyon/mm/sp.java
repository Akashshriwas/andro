// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.os.Bundle;
import android.os.Handler;
import dn.a;
import android.widget.ProgressBar;
import dn.f;
import android.app.Activity;

public class sp extends Activity
{
    protected int a;
    f b;
    ProgressBar c;
    
    public sp() {
        this.a = 1000;
    }
    
    private void a() {
        dn.a.c();
        if (f.h > this.b.b(f.m)) {
            this.b.b();
            this.b.a(f.a, 0);
            this.b.a(f.m, f.h);
        }
        if (this.b.b(f.l) == f.g) {
            new Handler().postDelayed((Runnable)new bc(this), (long)this.a);
            return;
        }
        new bd(this).execute((Object[])new Boolean[] { true });
    }
    
    private Boolean b() {
        final com.a.c.a a = new com.a.c.a();
        try {
            a.b();
            a.a();
            this.b.a(f.l, f.g);
            return true;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public void onBackPressed() {
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        this.setContentView(2130903069);
        this.c = (ProgressBar)this.findViewById(2131165249);
        this.b = f.a();
        this.a();
    }
}
