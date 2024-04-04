/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnErrorListener
 *  java.lang.Object
 */
package mm;

import android.media.MediaPlayer;
import mm.rc;

class av
implements MediaPlayer.OnErrorListener {
    final /* synthetic */ rc a;

    av(rc rc2) {
        this.a = rc2;
    }

    public boolean onError(MediaPlayer mediaPlayer, int n2, int n3) {
        rc.b(this.a).notifyDataSetChanged();
        return false;
    }
}

