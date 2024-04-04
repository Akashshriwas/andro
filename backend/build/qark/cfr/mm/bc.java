/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 */
package mm;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import mm.m;
import mm.sp;

class bc
implements Runnable {
    final /* synthetic */ sp a;

    bc(sp sp2) {
        this.a = sp2;
    }

    public void run() {
        Intent intent = new Intent((Context)this.a.getApplication(), m.class);
        intent.setFlags(67108864);
        this.a.startActivity(intent);
        this.a.finish();
    }
}

