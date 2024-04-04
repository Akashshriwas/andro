// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import java.util.ArrayList;
import dn.f;
import android.util.TypedValue;
import com.a.a.a;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.f.e;

public class k extends e
{
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    RelativeLayout h;
    
    public k(final Context context) {
        super(context);
    }
    
    private int a(final int n) {
        int n2 = 2130837578;
        switch (n) {
            default: {
                n2 = 2130837516;
                return n2;
            }
            case 4:
            case 5:
            case 6: {
                return n2;
            }
            case 1: {
                return 2130837517;
            }
            case 2: {
                return 2130837518;
            }
            case 3: {
                return 2130837519;
            }
            case 7: {
                return 2130837592;
            }
            case 8: {
                return 2130837605;
            }
            case 9: {
                return 2130837548;
            }
        }
    }
    
    @Override
    public View a(final Object o, final View view, int height) {
        View inflate = view;
        if (view == null) {
            inflate = this.c.inflate(2130903045, (ViewGroup)null);
        }
        this.d = (TextView)inflate.findViewById(2131165198);
        this.g = (TextView)inflate.findViewById(2131165204);
        this.e = (TextView)inflate.findViewById(2131165206);
        this.h = (RelativeLayout)inflate.findViewById(2131165203);
        this.f = (TextView)inflate.findViewById(2131165205);
        final a a = (a)o;
        this.d.setText((CharSequence)a.b());
        inflate.setTag((Object)a.c());
        this.g.setBackgroundResource(a.a());
        switch (height) {
            default: {
                this.g.setText((CharSequence)"");
                break;
            }
            case 0:
            case 1:
            case 2:
            case 3: {
                this.g.setText((CharSequence)String.valueOf(height + 1));
                break;
            }
        }
        switch (height) {
            default: {
                this.e.setVisibility(8);
                break;
            }
            case 3: {
                this.e.setVisibility(0);
                this.e.setText((CharSequence)this.c().getString(2131230784));
                break;
            }
            case 6: {
                this.e.setVisibility(0);
                this.e.setText((CharSequence)this.c().getString(2131230785));
                break;
            }
        }
        height = (int)TypedValue.applyDimension(1, 46.0f, this.c().getResources().getDisplayMetrics());
        this.d.getLayoutParams().height = height;
        this.f.setVisibility(8);
        if (a.c() == dn.f.a().b(dn.f.a)) {
            inflate.setBackgroundColor(inflate.getResources().getColor(2131099679));
            return inflate;
        }
        inflate.setBackgroundResource(2130903043);
        return inflate;
    }
    
    @Override
    public ArrayList a() {
        final ArrayList<a> list = new ArrayList<a>();
        final String[] stringArray = this.c().getResources().getStringArray(2131361792);
        for (int i = 0; i < stringArray.length; ++i) {
            list.add(new a(stringArray[i], i, this.a(i), ""));
        }
        return list;
    }
}
