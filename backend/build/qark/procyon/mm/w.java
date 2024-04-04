// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class w implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ m a;
    
    w(final m a) {
        this.a = a;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        (this.a.F = new Thread(new x(this))).start();
    }
}
