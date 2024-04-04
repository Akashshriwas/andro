// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.app;

import android.os.Message;
import android.os.Handler;

class h extends Handler
{
    final /* synthetic */ g a;
    
    h(final g a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                super.handleMessage(message);
                break;
            }
            case 1: {
                if (this.a.e) {
                    this.a.a(false);
                    return;
                }
                break;
            }
            case 2: {
                this.a.b_();
                this.a.b.f();
            }
        }
    }
}
