// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.support.v4.app.Fragment;
import dn.f;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnCompletionListener;

class z implements MediaPlayer$OnCompletionListener
{
    final /* synthetic */ m a;
    
    z(final m a) {
        this.a = a;
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        try {
            final boolean a = f.a().a("RepeatPlayAll", false);
            final Fragment a2 = this.a.e().a(2131165217);
            if (a) {
                if (a2 instanceof j) {
                    ((j)a2).w();
                }
                this.a.w();
                this.a.A();
                this.a.B = false;
                return;
            }
            if (a2 instanceof j) {
                ((j)a2).x();
            }
            this.a.A = false;
            this.a.w.setBackgroundResource(2130837586);
            this.a.B = true;
            this.a.x();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
