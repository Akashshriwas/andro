/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.IOException
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.hy;
import com.google.android.gms.internal.ii;
import com.google.android.gms.internal.jk;
import com.google.android.gms.internal.jl;
import com.google.android.gms.internal.jo;
import java.io.IOException;

public class ih
extends hy {
    private ih(Context context, jk jk2, jl jl2) {
        super(context, jk2, jl2);
    }

    public static ih a(String string, Context context) {
        a a2 = new a();
        ih.a(string, context, a2);
        return new ih(context, a2, new jo(239));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void b(Context object) {
        long l2;
        block6 : {
            block5 : {
                l2 = 1L;
                super.b((Context)object);
                object = this.e((Context)object);
                try {
                    if (!object.b()) break block5;
                    break block6;
                    catch (IOException iOException) {
                        this.a(28, 1L);
                        return;
                    }
                }
                catch (IOException iOException) {
                    return;
                }
            }
            l2 = 0L;
        }
        this.a(28, l2);
        object = object.a();
        if (object == null) return;
        this.a(30, (String)object);
        return;
        catch (e e2) {
            // empty catch block
        }
    }

    ii e(Context object) {
        b b2;
        block5 : {
            byte[] arrby;
            int n2 = 0;
            try {
                b2 = com.google.android.gms.ads.b.a.a((Context)object);
            }
            catch (f f2) {
                throw new IOException((Throwable)f2);
            }
            object = b2.a();
            if (object == null || !object.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")) break block5;
            arrby = new byte[16];
            int n3 = 0;
            while (n2 < object.length()) {
                int n4;
                block7 : {
                    block6 : {
                        if (n2 == 8 || n2 == 13 || n2 == 18) break block6;
                        n4 = n2;
                        if (n2 != 23) break block7;
                    }
                    n4 = n2 + 1;
                }
                arrby[n3] = (byte)((Character.digit((char)object.charAt(n4), (int)16) << 4) + Character.digit((char)object.charAt(n4 + 1), (int)16));
                ++n3;
                n2 = n4 + 2;
            }
            object = this.c.a(arrby, true);
        }
        return new ii(this, (String)object, b2.b());
    }
}

