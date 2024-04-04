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
import mm.ah;
import mm.pr;

class ag
implements MediaPlayer.OnPreparedListener {
    final /* synthetic */ pr a;

    ag(pr pr2) {
        this.a = pr2;
    }

    static /* synthetic */ pr a(ag ag2) {
        return ag2.a;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        new Thread((Runnable)new ah(this)).start();
    }
}

