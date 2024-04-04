/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Thread
 */
package mm;

import android.media.MediaPlayer;
import mm.ax;
import mm.rc;

class aw
implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ rc a;

    aw(rc rc2) {
        this.a = rc2;
    }

    static /* synthetic */ rc a(aw aw2) {
        return aw2.a;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.a.B = true;
        this.a.F = new Thread((Runnable)new ax(this));
        this.a.F.start();
    }
}

