/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityNodeInfo
 *  java.lang.Object
 */
package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatKitKat {
    AccessibilityNodeInfoCompatKitKat() {
    }

    public static int getLiveRegion(Object object) {
        return ((AccessibilityNodeInfo)object).getLiveRegion();
    }

    public static void setLiveRegion(Object object, int n) {
        ((AccessibilityNodeInfo)object).setLiveRegion(n);
    }
}

