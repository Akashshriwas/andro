// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnErrorListener;

class av implements MediaPlayer$OnErrorListener
{
    final /* synthetic */ rc a;
    
    av(final rc a) {
        this.a = a;
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        this.a.m.notifyDataSetChanged();
        return false;
    }
}
