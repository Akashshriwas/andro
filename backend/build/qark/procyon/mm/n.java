// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.app.Activity;
import dn.a;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class n implements View$OnClickListener
{
    final /* synthetic */ l a;
    
    n(final l a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        try {
            final Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", view.getResources().getString(2131230746));
            intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + view.getContext().getPackageName());
            this.a.a(dn.a.a(intent, this.a.c()));
        }
        catch (Exception ex) {
            dn.a.a(view.getContext(), view.getResources().getString(2131230758));
        }
    }
}
