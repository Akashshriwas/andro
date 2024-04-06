// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.view;

import android.view.View;

public class ViewCompatJB
{
    public static Object getAccessibilityNodeProvider(final View view) {
        return view.getAccessibilityNodeProvider();
    }
    
    public static int getImportantForAccessibility(final View view) {
        return view.getImportantForAccessibility();
    }
    
    public static boolean hasTransientState(final View view) {
        return view.hasTransientState();
    }
    
    public static void postInvalidateOnAnimation(final View view) {
        view.postInvalidateOnAnimation();
    }
    
    public static void postInvalidateOnAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
        view.postInvalidate(n, n2, n3, n4);
    }
    
    public static void postOnAnimation(final View view, final Runnable runnable) {
        view.postOnAnimation(runnable);
    }
    
    public static void postOnAnimationDelayed(final View view, final Runnable runnable, final long n) {
        view.postOnAnimationDelayed(runnable, n);
    }
    
    public static void setHasTransientState(final View view, final boolean hasTransientState) {
        view.setHasTransientState(hasTransientState);
    }
    
    public static void setImportantForAccessibility(final View view, final int importantForAccessibility) {
        view.setImportantForAccessibility(importantForAccessibility);
    }
}