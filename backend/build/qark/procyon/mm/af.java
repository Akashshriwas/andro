// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import dn.a;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnErrorListener;

class af implements MediaPlayer$OnErrorListener
{
    final /* synthetic */ pr a;
    
    af(final pr a) {
        this.a = a;
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        dn.a.a(this.a.s.getContext(), this.a.getString(2131230758));
        if (this.a.m != null) {
            ((ao)this.a.m).a(-1);
            ((ao)this.a.m).notifyDataSetChanged();
        }
        return false;
    }
}
