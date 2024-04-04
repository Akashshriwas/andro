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
import mm.m;
import mm.x;

class w
implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ m a;

    w(m m2) {
        this.a = m2;
    }

    static /* synthetic */ m a(w w2) {
        return w2.a;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.a.F = new Thread((Runnable)new x(this));
        this.a.F.start();
    }
}

