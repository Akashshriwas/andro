/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
package android.support.v4.app;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.g;
import android.support.v4.app.m;

class h
extends Handler {
    final /* synthetic */ g a;

    h(g g2) {
        this.a = g2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void handleMessage(Message message) {
        switch (message.what) {
            default: {
                super.handleMessage(message);
                return;
            }
            case 1: {
                if (!this.a.e) return;
                {
                    this.a.a(false);
                    return;
                }
            }
            case 2: 
        }
        this.a.b_();
        this.a.b.f();
    }
}

