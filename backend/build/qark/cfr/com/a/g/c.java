/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.a.g;

import com.a.g.a;
import com.a.g.b;

class c
implements Runnable {
    b a;
    final /* synthetic */ a b;

    c(a a2, b b2) {
        this.b = a2;
        this.a = b2;
    }

    public void run() {
        try {
            a.a(this.b, this.a.a, this.a.b);
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }
}

