/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.View
 *  android.widget.ProgressBar
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package mm;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import dn.a;
import dn.f;
import mm.bc;
import mm.bd;

public class sp
extends Activity {
    protected int a = 1000;
    f b;
    ProgressBar c;

    static /* synthetic */ Boolean a(sp sp2) {
        return sp2.b();
    }

    private void a() {
        a.c();
        if (f.h > this.b.b(f.m)) {
            this.b.b();
            this.b.a(f.a, 0);
            this.b.a(f.m, f.h);
        }
        if (this.b.b(f.l) == f.g) {
            new Handler().postDelayed((Runnable)new bc(this), (long)this.a);
            return;
        }
        new bd(this).execute((Object[])new Boolean[]{true});
    }

    private Boolean b() {
        com.a.c.a a2 = new com.a.c.a();
        try {
            a2.b();
            a2.a();
            this.b.a(f.l, f.g);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        return true;
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        this.setContentView(2130903069);
        this.c = (ProgressBar)this.findViewById(2131165249);
        this.b = f.a();
        this.a();
    }
}

