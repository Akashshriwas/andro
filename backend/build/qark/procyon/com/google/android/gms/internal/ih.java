// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.ads.b.b;
import com.google.android.gms.common.f;
import com.google.android.gms.common.e;
import java.io.IOException;
import android.content.Context;

public class ih extends hy
{
    private ih(final Context context, final jk jk, final jl jl) {
        super(context, jk, jl);
    }
    
    public static ih a(final String s, final Context context) {
        final a a = new a();
        hy.a(s, context, a);
        return new ih(context, a, new jo(239));
    }
    
    @Override
    protected void b(final Context context) {
        final long n = 1L;
        super.b(context);
        ii ii = null;
        try {
            final ii e;
            ii = (e = this.e(context));
            final boolean b = e.b();
            if (!b) {
                goto Label_0055;
            }
            final ih ih = this;
            final int n2 = 28;
            final long n3 = n;
            ih.a(n2, n3);
            final ii ii2 = ii;
            final String s = ii2.a();
            final String s3;
            final String s2 = s3 = s;
            if (s3 != null) {
                final ih ih2 = this;
                final int n4 = 30;
                final String s4 = s2;
                ih2.a(n4, s4);
            }
            return;
        }
        catch (IOException ex) {
            this.a(28, 1L);
            return;
        }
        catch (e e2) {}
        try {
            final ii e = ii;
            final boolean b = e.b();
            if (!b) {
                goto Label_0055;
            }
            final ih ih = this;
            final int n2 = 28;
            final long n3 = n;
            ih.a(n2, n3);
            final ii ii2 = ii;
            final String s = ii2.a();
            final String s3;
            final String s2 = s3 = s;
            if (s3 != null) {
                final ih ih2 = this;
                final int n4 = 30;
                final String s4 = s2;
                ih2.a(n4, s4);
            }
        }
        catch (IOException ex2) {}
    }
    
    ii e(final Context context) {
        int i = 0;
        b a;
        byte[] array;
        try {
            a = com.google.android.gms.ads.b.a.a(context);
            final String s = a.a();
            if (s == null || !s.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")) {
                return new ii(this, s, a.b());
            }
            array = new byte[16];
            int n = 0;
            while (i < s.length()) {
                int index;
                if (i == 8 || i == 13 || i == 18 || (index = i) == 23) {
                    index = i + 1;
                }
                array[n] = (byte)((Character.digit(s.charAt(index), 16) << 4) + Character.digit(s.charAt(index + 1), 16));
                ++n;
                i = index + 2;
            }
        }
        catch (f cause) {
            throw new IOException(cause);
        }
        final String s = this.c.a(array, true);
        return new ii(this, s, a.b());
    }
}
