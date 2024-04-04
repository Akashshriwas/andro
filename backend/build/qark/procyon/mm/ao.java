// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.view.ViewGroup;
import android.view.View;
import dn.a;
import com.a.h.g;
import android.content.Context;
import com.a.g.d;
import android.widget.ProgressBar;
import android.widget.ImageView;
import android.widget.TextView;
import com.a.f.e;

class ao extends e
{
    TextView d;
    TextView e;
    ImageView f;
    ImageView g;
    ProgressBar h;
    int i;
    d j;
    final /* synthetic */ pr k;
    
    public ao(final pr k, final Context context) {
        this.k = k;
        super(context);
        this.i = -1;
        this.j = new d(context);
    }
    
    private boolean a(final g g) {
        boolean b = false;
        if (dn.a.a()) {
            b = b;
            if (!dn.a.b(g.e())) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public View a(final Object o, final View view, final int n) {
        final g g = (g)o;
        View inflate = view;
        if (view == null) {
            inflate = this.c.inflate(2130903059, (ViewGroup)null);
        }
        if (n % 2 == 0) {
            inflate.setBackgroundResource(2130837563);
        }
        else {
            inflate.setBackgroundResource(2130837562);
        }
        this.d = (TextView)inflate.findViewById(2131165198);
        this.e = (TextView)inflate.findViewById(2131165199);
        this.f = (ImageView)inflate.findViewById(2131165196);
        this.g = (ImageView)inflate.findViewById(2131165234);
        this.h = (ProgressBar)inflate.findViewById(2131165221);
        if (n == this.d()) {
            this.g.setVisibility(8);
            this.h.setVisibility(0);
        }
        else {
            this.h.setVisibility(8);
            this.g.setVisibility(0);
        }
        if (n % 2 == 0) {
            this.f.setImageResource(2130837610);
        }
        else {
            this.f.setImageResource(2130837612);
        }
        this.d.setText((CharSequence)g.c());
        this.e.setText((CharSequence)g.d());
        if (g.a()) {
            this.d.setTextColor(this.c().getResources().getColor(2131099677));
        }
        else {
            this.d.setTextColor(this.c().getResources().getColor(2131099674));
        }
        if (this.a(g)) {
            this.j.a(dn.a.c(g.e()), g.e());
        }
        return inflate;
    }
    
    public void a(final int i) {
        this.i = i;
    }
    
    public int d() {
        return this.i;
    }
}
