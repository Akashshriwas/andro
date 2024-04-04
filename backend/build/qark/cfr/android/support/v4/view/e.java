/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  java.lang.Object
 */
package android.support.v4.view;

import android.view.KeyEvent;

class e {
    public static boolean a(int n2) {
        return KeyEvent.metaStateHasNoModifiers((int)n2);
    }

    public static boolean a(int n2, int n3) {
        return KeyEvent.metaStateHasModifiers((int)n2, (int)n3);
    }
}

