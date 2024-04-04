/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.SearchView
 *  android.widget.SearchView$OnQueryTextListener
 *  java.lang.Object
 *  java.lang.String
 */
package android.support.v4.widget;

import android.content.Context;
import android.view.View;
import android.widget.SearchView;

class SearchViewCompatHoneycomb {
    SearchViewCompatHoneycomb() {
    }

    public static Object newOnQueryTextListener(final OnQueryTextListenerCompatBridge onQueryTextListenerCompatBridge) {
        return new SearchView.OnQueryTextListener(){

            public boolean onQueryTextChange(String string2) {
                return onQueryTextListenerCompatBridge.onQueryTextChange(string2);
            }

            public boolean onQueryTextSubmit(String string2) {
                return onQueryTextListenerCompatBridge.onQueryTextSubmit(string2);
            }
        };
    }

    public static View newSearchView(Context context) {
        return new SearchView(context);
    }

    public static void setOnQueryTextListener(Object object, Object object2) {
        ((SearchView)object).setOnQueryTextListener((SearchView.OnQueryTextListener)object2);
    }

    static interface OnQueryTextListenerCompatBridge {
        public boolean onQueryTextChange(String var1);

        public boolean onQueryTextSubmit(String var1);
    }

}

