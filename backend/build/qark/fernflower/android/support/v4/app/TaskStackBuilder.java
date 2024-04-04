package android.support.v4.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public class TaskStackBuilder implements Iterable {
   private static final TaskStackBuilder.TaskStackBuilderImpl IMPL;
   private static final String TAG = "TaskStackBuilder";
   private final ArrayList mIntents = new ArrayList();
   private final Context mSourceContext;

   static {
      if (VERSION.SDK_INT >= 11) {
         IMPL = new TaskStackBuilder.TaskStackBuilderImplHoneycomb();
      } else {
         IMPL = new TaskStackBuilder.TaskStackBuilderImplBase();
      }
   }

   private TaskStackBuilder(Context var1) {
      this.mSourceContext = var1;
   }

   public static TaskStackBuilder create(Context var0) {
      return new TaskStackBuilder(var0);
   }

   public static TaskStackBuilder from(Context var0) {
      return create(var0);
   }

   public TaskStackBuilder addNextIntent(Intent var1) {
      this.mIntents.add(var1);
      return this;
   }

   public TaskStackBuilder addParentStack(Activity var1) {
      int var2 = this.mIntents.size();
      Intent var3 = NavUtils.getParentActivityIntent(var1);

      while(var3 != null) {
         this.mIntents.add(var2, var3);

         try {
            var3 = NavUtils.getParentActivityIntent(var1, (ComponentName)var3.getComponent());
         } catch (NameNotFoundException var4) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(var4);
         }
      }

      return this;
   }

   public TaskStackBuilder addParentStack(Class var1) {
      int var2 = this.mIntents.size();

      NameNotFoundException var10000;
      label24: {
         boolean var10001;
         Intent var5;
         try {
            var5 = NavUtils.getParentActivityIntent(this.mSourceContext, var1);
         } catch (NameNotFoundException var4) {
            var10000 = var4;
            var10001 = false;
            break label24;
         }

         while(true) {
            if (var5 == null) {
               return this;
            }

            try {
               this.mIntents.add(var2, var5);
               var5 = NavUtils.getParentActivityIntent(this.mSourceContext, var5.getComponent());
            } catch (NameNotFoundException var3) {
               var10000 = var3;
               var10001 = false;
               break;
            }
         }
      }

      NameNotFoundException var6 = var10000;
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      throw new IllegalArgumentException(var6);
   }

   public Intent editIntentAt(int var1) {
      return (Intent)this.mIntents.get(var1);
   }

   public Intent getIntent(int var1) {
      return this.editIntentAt(var1);
   }

   public int getIntentCount() {
      return this.mIntents.size();
   }

   public Intent[] getIntents() {
      return (Intent[])this.mIntents.toArray(new Intent[this.mIntents.size()]);
   }

   public PendingIntent getPendingIntent(int var1, int var2) {
      return this.getPendingIntent(var1, var2, (Bundle)null);
   }

   public PendingIntent getPendingIntent(int var1, int var2, Bundle var3) {
      if (this.mIntents.isEmpty()) {
         throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
      } else {
         Intent[] var4 = (Intent[])this.mIntents.toArray(new Intent[this.mIntents.size()]);
         var4[0].addFlags(268484608);
         return IMPL.getPendingIntent(this.mSourceContext, var4, var1, var2, var3);
      }
   }

   public Iterator iterator() {
      return this.mIntents.iterator();
   }

   public void startActivities() {
      this.startActivities((Bundle)null);
   }

   public void startActivities(Bundle var1) {
      if (this.mIntents.isEmpty()) {
         throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
      } else {
         Intent[] var2 = (Intent[])this.mIntents.toArray(new Intent[this.mIntents.size()]);
         var2[0].addFlags(268484608);
         if (!ContextCompat.startActivities(this.mSourceContext, var2, var1)) {
            Intent var3 = var2[var2.length - 1];
            var3.addFlags(268435456);
            this.mSourceContext.startActivity(var3);
         }

      }
   }

   interface TaskStackBuilderImpl {
      PendingIntent getPendingIntent(Context var1, Intent[] var2, int var3, int var4, Bundle var5);
   }

   static class TaskStackBuilderImplBase implements TaskStackBuilder.TaskStackBuilderImpl {
      public PendingIntent getPendingIntent(Context var1, Intent[] var2, int var3, int var4, Bundle var5) {
         Intent var6 = var2[var2.length - 1];
         var6.addFlags(268435456);
         return PendingIntent.getActivity(var1, var3, var6, var4);
      }
   }

   static class TaskStackBuilderImplHoneycomb implements TaskStackBuilder.TaskStackBuilderImpl {
      public PendingIntent getPendingIntent(Context var1, Intent[] var2, int var3, int var4, Bundle var5) {
         var2[0].addFlags(268468224);
         return TaskStackBuilderHoneycomb.getActivitiesPendingIntent(var1, var3, var2, var4);
      }
   }

   static class TaskStackBuilderImplJellybean implements TaskStackBuilder.TaskStackBuilderImpl {
      public PendingIntent getPendingIntent(Context var1, Intent[] var2, int var3, int var4, Bundle var5) {
         var2[0].addFlags(268468224);
         return TaskStackBuilderJellybean.getActivitiesPendingIntent(var1, var3, var2, var4, var5);
      }
   }
}
