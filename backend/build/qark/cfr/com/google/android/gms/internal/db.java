/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.cb;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.fa;

class db
implements Runnable {
    final /* synthetic */ cy a;

    db(cy cy2) {
        this.a = cy2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Object object = cy.a(this.a);
        synchronized (object) {
            if (cy.c((cy)this.a).f != -2) {
                return;
            }
            cy.d(this.a).e().a(this.a);
            if (cy.c((cy)this.a).f == -3) {
                et.d("Loading URL in WebView: " + cy.c((cy)this.a).c);
                cy.d(this.a).loadUrl(cy.c((cy)this.a).c);
            } else {
                et.d("Loading HTML in WebView.");
                cy.d(this.a).loadDataWithBaseURL(em.a(cy.c((cy)this.a).c), cy.c((cy)this.a).d, "text/html", "UTF-8", null);
            }
            return;
        }
    }
}

