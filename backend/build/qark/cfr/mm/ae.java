/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.telephony.PhoneStateListener
 *  android.widget.Button
 *  java.lang.String
 */
package mm;

import android.media.MediaPlayer;
import android.telephony.PhoneStateListener;
import android.widget.Button;
import mm.m;

class ae
extends PhoneStateListener {
    final /* synthetic */ m a;

    private ae(m m2) {
        this.a = m2;
    }

    /* synthetic */ ae(m m2, ae ae2) {
        this(m2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onCallStateChanged(int n2, String string) {
        switch (n2) {
            default: {
                return;
            }
            case 1: 
            case 2: {
                if (this.a.C == null || !this.a.C.isPlaying()) return;
                this.a.C.pause();
                this.a.w.setBackgroundResource(2130837586);
                return;
            }
        }
    }
}

