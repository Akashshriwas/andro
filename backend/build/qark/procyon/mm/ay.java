// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnCompletionListener;

class ay implements MediaPlayer$OnCompletionListener
{
    final /* synthetic */ rc a;
    
    ay(final rc a) {
        this.a = a;
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        this.a.v.setBackgroundResource(2130837595);
    }
}
