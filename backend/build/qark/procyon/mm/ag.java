// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class ag implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ pr a;
    
    ag(final pr a) {
        this.a = a;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        new Thread(new ah(this)).start();
    }
}
