// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.view.ViewGroup;
import com.a.h.f;
import android.view.View;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.a.f.e;

public class t extends e
{
    TextView d;
    TextView e;
    ImageView f;
    
    public t(final Context context) {
        super(context);
    }
    
    @Override
    public View a(final Object o, final View view, final int n) {
        final f f = (f)o;
        View inflate = view;
        if (view == null) {
            inflate = this.c.inflate(2130903062, (ViewGroup)null);
        }
        if (n % 2 == 0) {
            inflate.setBackgroundResource(2130837563);
        }
        else {
            inflate.setBackgroundResource(2130837562);
        }
        this.d = (TextView)inflate.findViewById(2131165198);
        this.e = (TextView)inflate.findViewById(2131165197);
        this.f = (ImageView)inflate.findViewById(2131165196);
        if (n % 2 == 0) {
            this.f.setImageResource(2130837610);
        }
        else {
            this.f.setImageResource(2130837612);
        }
        this.d.setText((CharSequence)f.c());
        this.e.setText((CharSequence)f.d());
        if (f.b()) {
            this.d.setTextColor(this.c().getResources().getColor(2131099677));
            this.e.setTextColor(this.c().getResources().getColor(2131099677));
            return inflate;
        }
        this.d.setTextColor(this.c().getResources().getColor(2131099674));
        this.e.setTextColor(this.c().getResources().getColor(2131099658));
        return inflate;
    }
}
