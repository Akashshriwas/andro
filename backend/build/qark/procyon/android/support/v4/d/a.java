// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.d;

import android.graphics.Canvas;
import android.os.Build$VERSION;

public class a
{
    private static final d b;
    private Object a;
    
    static {
        if (Build$VERSION.SDK_INT >= 14) {
            b = new c();
            return;
        }
        b = new b();
    }
    
    public void a(final int n, final int n2) {
        android.support.v4.d.a.b.a(this.a, n, n2);
    }
    
    public boolean a() {
        return android.support.v4.d.a.b.a(this.a);
    }
    
    public boolean a(final float n) {
        return android.support.v4.d.a.b.a(this.a, n);
    }
    
    public boolean a(final Canvas canvas) {
        return android.support.v4.d.a.b.a(this.a, canvas);
    }
    
    public void b() {
        android.support.v4.d.a.b.b(this.a);
    }
    
    public boolean c() {
        return android.support.v4.d.a.b.c(this.a);
    }
}
