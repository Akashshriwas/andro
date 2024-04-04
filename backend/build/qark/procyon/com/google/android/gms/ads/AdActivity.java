// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.cn;
import android.os.Bundle;
import com.google.android.gms.internal.cp;
import android.app.Activity;

public final class AdActivity extends Activity
{
    private cp a;
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.a = cn.a(this);
        if (this.a == null) {
            et.e("Could not create ad overlay.");
            this.finish();
            return;
        }
        try {
            this.a.a(bundle);
        }
        catch (RemoteException ex) {
            et.b("Could not forward onCreate to ad overlay:", (Throwable)ex);
            this.finish();
        }
    }
    
    protected void onDestroy() {
        while (true) {
            try {
                if (this.a != null) {
                    this.a.i();
                }
                super.onDestroy();
            }
            catch (RemoteException ex) {
                et.b("Could not forward onDestroy to ad overlay:", (Throwable)ex);
                continue;
            }
            break;
        }
    }
    
    protected void onPause() {
        while (true) {
            try {
                if (this.a != null) {
                    this.a.g();
                }
                super.onPause();
            }
            catch (RemoteException ex) {
                et.b("Could not forward onPause to ad overlay:", (Throwable)ex);
                this.finish();
                continue;
            }
            break;
        }
    }
    
    protected void onRestart() {
        super.onRestart();
        try {
            if (this.a != null) {
                this.a.d();
            }
        }
        catch (RemoteException ex) {
            et.b("Could not forward onRestart to ad overlay:", (Throwable)ex);
            this.finish();
        }
    }
    
    protected void onResume() {
        super.onResume();
        try {
            if (this.a != null) {
                this.a.f();
            }
        }
        catch (RemoteException ex) {
            et.b("Could not forward onResume to ad overlay:", (Throwable)ex);
            this.finish();
        }
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        while (true) {
            try {
                if (this.a != null) {
                    this.a.b(bundle);
                }
                super.onSaveInstanceState(bundle);
            }
            catch (RemoteException ex) {
                et.b("Could not forward onSaveInstanceState to ad overlay:", (Throwable)ex);
                this.finish();
                continue;
            }
            break;
        }
    }
    
    protected void onStart() {
        super.onStart();
        try {
            if (this.a != null) {
                this.a.e();
            }
        }
        catch (RemoteException ex) {
            et.b("Could not forward onStart to ad overlay:", (Throwable)ex);
            this.finish();
        }
    }
    
    protected void onStop() {
        while (true) {
            try {
                if (this.a != null) {
                    this.a.h();
                }
                super.onStop();
            }
            catch (RemoteException ex) {
                et.b("Could not forward onStop to ad overlay:", (Throwable)ex);
                this.finish();
                continue;
            }
            break;
        }
    }
}
