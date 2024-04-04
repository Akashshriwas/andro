/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.os.RemoteException
 *  java.lang.Throwable
 */
package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.cp;
import com.google.android.gms.internal.et;

public final class AdActivity
extends Activity {
    private cp a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = cn.a(this);
        if (this.a == null) {
            et.e("Could not create ad overlay.");
            this.finish();
            return;
        }
        try {
            this.a.a(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not forward onCreate to ad overlay:", (Throwable)remoteException);
            this.finish();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onDestroy() {
        try {
            if (this.a != null) {
                this.a.i();
            }
        }
        catch (RemoteException remoteException) {
            et.b("Could not forward onDestroy to ad overlay:", (Throwable)remoteException);
        }
        super.onDestroy();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onPause() {
        try {
            if (this.a != null) {
                this.a.g();
            }
        }
        catch (RemoteException remoteException) {
            et.b("Could not forward onPause to ad overlay:", (Throwable)remoteException);
            this.finish();
        }
        super.onPause();
    }

    protected void onRestart() {
        super.onRestart();
        try {
            if (this.a != null) {
                this.a.d();
            }
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not forward onRestart to ad overlay:", (Throwable)remoteException);
            this.finish();
            return;
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.a != null) {
                this.a.f();
            }
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not forward onResume to ad overlay:", (Throwable)remoteException);
            this.finish();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.a != null) {
                this.a.b(bundle);
            }
        }
        catch (RemoteException remoteException) {
            et.b("Could not forward onSaveInstanceState to ad overlay:", (Throwable)remoteException);
            this.finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        try {
            if (this.a != null) {
                this.a.e();
            }
            return;
        }
        catch (RemoteException remoteException) {
            et.b("Could not forward onStart to ad overlay:", (Throwable)remoteException);
            this.finish();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onStop() {
        try {
            if (this.a != null) {
                this.a.h();
            }
        }
        catch (RemoteException remoteException) {
            et.b("Could not forward onStop to ad overlay:", (Throwable)remoteException);
            this.finish();
        }
        super.onStop();
    }
}

