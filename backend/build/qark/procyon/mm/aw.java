// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class aw implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ rc a;
    
    aw(final rc a) {
        this.a = a;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        this.a.B = true;
        (this.a.F = new Thread(new ax(this))).start();
    }
}
