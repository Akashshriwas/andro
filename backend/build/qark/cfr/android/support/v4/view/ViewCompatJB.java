/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeProvider
 *  java.lang.Object
 *  java.lang.Runnable
 */
package android.support.v4.view;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

public class ViewCompatJB {
    public static Object getAccessibilityNodeProvider(View view) {
        return view.getAccessibilityNodeProvider();
    }

    public static int getImportantForAccessibility(View view) {
        return view.getImportantForAccessibility();
    }

    public static boolean hasTransientState(View view) {
        return view.hasTransientState();
    }

    public static void postInvalidateOnAnimation(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void postInvalidateOnAnimation(View view, int n, int n2, int n3, int n4) {
        view.postInvalidate(n, n2, n3, n4);
    }

    public static void postOnAnimation(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void postOnAnimationDelayed(View view, Runnable runnable, long l) {
        view.postOnAnimationDelayed(runnable, l);
    }

    public static void setHasTransientState(View view, boolean bl) {
        view.setHasTransientState(bl);
    }

    public static void setImportantForAccessibility(View view, int n) {
        view.setImportantForAccessibility(n);
    }
}

