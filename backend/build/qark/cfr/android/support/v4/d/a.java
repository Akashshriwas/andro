/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package android.support.v4.d;

import android.graphics.Canvas;
import android.os.Build;
import android.support.v4.d.b;
import android.support.v4.d.c;
import android.support.v4.d.d;

public class a {
    private static final d b = Build.VERSION.SDK_INT >= 14 ? new c() : new b();
    private Object a;

    public void a(int n2, int n3) {
        b.a(this.a, n2, n3);
    }

    public boolean a() {
        return b.a(this.a);
    }

    public boolean a(float f2) {
        return b.a(this.a, f2);
    }

    public boolean a(Canvas canvas) {
        return b.a(this.a, canvas);
    }

    public void b() {
        b.b(this.a);
    }

    public boolean c() {
        return b.c(this.a);
    }
}

