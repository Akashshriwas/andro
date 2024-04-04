/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.os.AsyncTask
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 */
package mm;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import mm.m;
import mm.sp;

class bd
extends AsyncTask {
    final /* synthetic */ sp a;

    bd(sp sp2) {
        this.a = sp2;
    }

    protected /* varargs */ Boolean a(Boolean ... arrboolean) {
        return sp.a(this.a);
    }

    protected void a(Boolean bl2) {
        bl2 = new Intent((Context)this.a.getApplication(), m.class);
        bl2.setFlags(67108864);
        this.a.startActivity((Intent)bl2);
        this.a.finish();
    }

    protected /* varargs */ /* synthetic */ Object doInBackground(Object ... arrobject) {
        return this.a((Boolean[])arrobject);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((Boolean)object);
    }

    protected void onPreExecute() {
        super.onPreExecute();
    }
}

