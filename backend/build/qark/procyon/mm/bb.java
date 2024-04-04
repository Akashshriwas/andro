// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.telephony.PhoneStateListener;

class bb extends PhoneStateListener
{
    final /* synthetic */ rc a;
    
    private bb(final rc a) {
        this.a = a;
    }
    
    public void onCallStateChanged(final int n, final String s) {
        switch (n) {
            case 1:
            case 2: {
                if (this.a.y != null && this.a.y.isPlaying()) {
                    this.a.v.setBackgroundResource(2130837595);
                    this.a.y.pause();
                    return;
                }
                break;
            }
        }
    }
}
