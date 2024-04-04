// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.view.ViewGroup;
import com.a.h.f;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.a.f.e;

public class g extends e
{
    TextView d;
    TextView e;
    TextView f;
    ImageView g;
    LinearLayout h;
    i i;
    private View$OnClickListener j;
    
    public g(final Context context, final i i) {
        super(context);
        this.j = (View$OnClickListener)new h(this);
        this.i = i;
    }
    
    @Override
    public View a(final Object o, final View view, final int i) {
        final f f = (f)o;
        View inflate = view;
        if (view == null) {
            inflate = this.c.inflate(2130903041, (ViewGroup)null);
        }
        if (i % 2 == 0) {
            inflate.setBackgroundResource(2130837563);
        }
        else {
            inflate.setBackgroundResource(2130837562);
        }
        this.d = (TextView)inflate.findViewById(2131165198);
        this.e = (TextView)inflate.findViewById(2131165199);
        this.f = (TextView)inflate.findViewById(2131165197);
        (this.h = (LinearLayout)inflate.findViewById(2131165200)).setTag((Object)i);
        this.h.setOnClickListener(this.j);
        this.g = (ImageView)inflate.findViewById(2131165196);
        if (i % 2 == 0) {
            this.g.setImageResource(2130837610);
        }
        else {
            this.g.setImageResource(2130837612);
        }
        this.d.setText((CharSequence)f.c());
        this.e.setText((CharSequence)f.f());
        this.f.setText((CharSequence)f.d());
        if (f.b()) {
            this.d.setTextColor(this.c().getResources().getColor(2131099677));
        }
        else {
            this.d.setTextColor(this.c().getResources().getColor(2131099674));
        }
        if (f.a()) {
            this.e.setVisibility(0);
            return inflate;
        }
        this.e.setVisibility(8);
        return inflate;
    }
}
