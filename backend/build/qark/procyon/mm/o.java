// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import com.a.a.a;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class o implements AdapterView$OnItemClickListener
{
    final /* synthetic */ l a;
    
    o(final l a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int x, final long n) {
        try {
            this.a.X = x;
            this.a.V.a((a)this.a.W.getItem(x), view);
        }
        catch (Exception ex) {
            dn.a.a(view.getContext(), view.getResources().getString(2131230758));
        }
    }
}
