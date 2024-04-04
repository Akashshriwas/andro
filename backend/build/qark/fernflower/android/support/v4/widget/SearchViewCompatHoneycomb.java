package android.support.v4.widget;

import android.content.Context;
import android.view.View;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

class SearchViewCompatHoneycomb {
   public static Object newOnQueryTextListener(final SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge var0) {
      return new OnQueryTextListener() {
         public boolean onQueryTextChange(String var1) {
            return var0.onQueryTextChange(var1);
         }

         public boolean onQueryTextSubmit(String var1) {
            return var0.onQueryTextSubmit(var1);
         }
      };
   }

   public static View newSearchView(Context var0) {
      return new SearchView(var0);
   }

   public static void setOnQueryTextListener(Object var0, Object var1) {
      ((SearchView)var0).setOnQueryTextListener((OnQueryTextListener)var1);
   }

   interface OnQueryTextListenerCompatBridge {
      boolean onQueryTextChange(String var1);

      boolean onQueryTextSubmit(String var1);
   }
}
