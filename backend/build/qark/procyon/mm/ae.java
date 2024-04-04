// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.telephony.PhoneStateListener;

class ae extends PhoneStateListener
{
    final /* synthetic */ m a;
    
    private ae(final m a) {
        this.a = a;
    }
    
    public void onCallStateChanged(final int n, final String s) {
        switch (n) {
            case 1:
            case 2: {
                if (this.a.C != null && this.a.C.isPlaying()) {
                    this.a.C.pause();
                    this.a.w.setBackgroundResource(2130837586);
                    return;
                }
                break;
            }
        }
    }
}
