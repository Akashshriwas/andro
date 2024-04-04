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
import mm.rc;

class bb
extends PhoneStateListener {
    final /* synthetic */ rc a;

    private bb(rc rc2) {
        this.a = rc2;
    }

    /* synthetic */ bb(rc rc2, bb bb2) {
        this(rc2);
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
                if (this.a.y == null || !this.a.y.isPlaying()) return;
                this.a.v.setBackgroundResource(2130837595);
                this.a.y.pause();
                return;
            }
        }
    }
}

