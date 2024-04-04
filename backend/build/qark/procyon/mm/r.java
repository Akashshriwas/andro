// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import com.a.g.a;
import com.a.f.e;

public class r extends e
{
    a d;
    
    public r(final Context context) {
        super(context);
        this.d = new a(context);
    }
    
    private boolean a(final com.a.h.e e) {
        boolean b2;
        final boolean b = b2 = false;
        if (dn.a.a()) {
            b2 = b;
            if (e.a() > 5) {
                b2 = b;
                if (!dn.a.b(e.a())) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @Override
    public View a(final Object o, final View view, final int n) {
        final com.a.h.e e = (com.a.h.e)o;
        View inflate = view;
        if (view == null) {
            inflate = this.c.inflate(2130903050, (ViewGroup)null);
        }
        s tag = new s(this);
        if (inflate.getTag() == null) {
            tag.a = (TextView)inflate.findViewById(2131165198);
            tag.b = (TextView)inflate.findViewById(2131165199);
            tag.c = (TextView)inflate.findViewById(2131165226);
            inflate.setTag((Object)tag);
        }
        else {
            tag = (s)inflate.getTag();
        }
        if (n % 2 == 0) {
            inflate.setBackgroundResource(2130837563);
        }
        else {
            inflate.setBackgroundResource(2130837562);
        }
        tag.a.setText((CharSequence)e.b());
        tag.b.setText((CharSequence)e.c());
        tag.c.setText((CharSequence)String.valueOf(e.d()));
        if (this.a(e)) {
            this.d.a(dn.a.e(e.a()), e.a());
        }
        return inflate;
    }
}
