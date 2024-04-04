// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.widget;

import android.widget.SearchView;
import android.view.View;
import android.content.Context;
import android.widget.SearchView$OnQueryTextListener;

class SearchViewCompatHoneycomb
{
    public static Object newOnQueryTextListener(final OnQueryTextListenerCompatBridge onQueryTextListenerCompatBridge) {
        return new SearchView$OnQueryTextListener() {
            public boolean onQueryTextChange(final String s) {
                return onQueryTextListenerCompatBridge.onQueryTextChange(s);
            }
            
            public boolean onQueryTextSubmit(final String s) {
                return onQueryTextListenerCompatBridge.onQueryTextSubmit(s);
            }
        };
    }
    
    public static View newSearchView(final Context context) {
        return (View)new SearchView(context);
    }
    
    public static void setOnQueryTextListener(final Object o, final Object o2) {
        ((SearchView)o).setOnQueryTextListener((SearchView$OnQueryTextListener)o2);
    }
    
    interface OnQueryTextListenerCompatBridge
    {
        boolean onQueryTextChange(final String p0);
        
        boolean onQueryTextSubmit(final String p0);
    }
}
