/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnErrorListener
 *  android.widget.TextView
 *  java.lang.Object
 *  java.lang.String
 */
package mm;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.TextView;
import dn.a;
import mm.ao;
import mm.pr;

class af
implements MediaPlayer.OnErrorListener {
    final /* synthetic */ pr a;

    af(pr pr2) {
        this.a = pr2;
    }

    public boolean onError(MediaPlayer mediaPlayer, int n2, int n3) {
        a.a(this.a.s.getContext(), this.a.getString(2131230758));
        if (pr.a(this.a) != null) {
            ((ao)pr.a(this.a)).a(-1);
            ((ao)pr.a(this.a)).notifyDataSetChanged();
        }
        return false;
    }
}

