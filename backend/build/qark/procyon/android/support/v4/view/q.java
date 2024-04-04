// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.View;
import android.os.Build$VERSION;

public class q
{
    static final w a;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 16 || Build$VERSION.CODENAME.equals("JellyBean")) {
            a = new v();
            return;
        }
        if (sdk_INT >= 14) {
            a = new u();
            return;
        }
        if (sdk_INT >= 11) {
            a = new t();
            return;
        }
        if (sdk_INT >= 9) {
            a = new s();
            return;
        }
        a = new r();
    }
    
    public static int a(final View view) {
        return q.a.a(view);
    }
    
    public static boolean a(final View view, final int n) {
        return q.a.a(view, n);
    }
    
    public static void b(final View view) {
        q.a.b(view);
    }
}
