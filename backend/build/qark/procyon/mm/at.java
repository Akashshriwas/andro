// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.view.View;
import android.view.View$OnClickListener;

class at implements View$OnClickListener
{
    final /* synthetic */ rc a;
    
    at(final rc a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Label_0078: {
            Label_0070: {
                try {
                    switch (view.getId()) {
                        case 2131165223: {
                            this.a.p();
                            return;
                        }
                        case 2131165243: {
                            break;
                        }
                        case 2131165244: {
                            break Label_0070;
                        }
                        case 2131165242: {
                            break Label_0078;
                        }
                        default: {
                            return;
                        }
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                    return;
                }
                this.a.q();
                return;
            }
            this.a.o();
            return;
        }
        this.a.n();
    }
}
