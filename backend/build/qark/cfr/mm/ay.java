/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.widget.Button
 *  java.lang.Object
 */
package mm;

import android.media.MediaPlayer;
import android.widget.Button;
import mm.rc;

class ay
implements MediaPlayer.OnCompletionListener {
    final /* synthetic */ rc a;

    ay(rc rc2) {
        this.a = rc2;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.a.v.setBackgroundResource(2130837595);
    }
}

