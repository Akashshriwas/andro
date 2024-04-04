/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.widget.Button
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package mm;

import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.support.v4.app.k;
import android.widget.Button;
import dn.f;
import mm.j;
import mm.m;

class z
implements MediaPlayer.OnCompletionListener {
    final /* synthetic */ m a;

    z(m m2) {
        this.a = m2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCompletion(MediaPlayer object) {
        try {
            boolean bl2 = f.a().a("RepeatPlayAll", false);
            object = this.a.e().a(2131165217);
            if (bl2) {
                if (object instanceof j) {
                    ((j)object).w();
                }
                m.f(this.a);
                m.g(this.a);
                this.a.B = false;
                return;
            }
            if (object instanceof j) {
                ((j)object).x();
            }
            this.a.A = false;
            this.a.w.setBackgroundResource(2130837586);
            this.a.B = true;
            m.a(this.a);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}

