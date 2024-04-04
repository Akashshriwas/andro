/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package android.support.v4.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilderHoneycomb;
import android.support.v4.app.TaskStackBuilderJellybean;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public class TaskStackBuilder
implements Iterable<Intent> {
    private static final TaskStackBuilderImpl IMPL = Build.VERSION.SDK_INT >= 11 ? new TaskStackBuilderImplHoneycomb() : new TaskStackBuilderImplBase();
    private static final String TAG = "TaskStackBuilder";
    private final ArrayList<Intent> mIntents = new ArrayList();
    private final Context mSourceContext;

    private TaskStackBuilder(Context context) {
        this.mSourceContext = context;
    }

    public static TaskStackBuilder create(Context context) {
        return new TaskStackBuilder(context);
    }

    public static TaskStackBuilder from(Context context) {
        return TaskStackBuilder.create(context);
    }

    public TaskStackBuilder addNextIntent(Intent intent) {
        this.mIntents.add((Object)intent);
        return this;
    }

    public TaskStackBuilder addParentStack(Activity activity) {
        int n = this.mIntents.size();
        Intent intent = NavUtils.getParentActivityIntent(activity);
        while (intent != null) {
            this.mIntents.add(n, (Object)intent);
            try {
                intent = NavUtils.getParentActivityIntent((Context)activity, intent.getComponent());
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                Log.e((String)"TaskStackBuilder", (String)"Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException((Throwable)nameNotFoundException);
            }
        }
        return this;
    }

    public TaskStackBuilder addParentStack(Class<?> intent) {
        int n = this.mIntents.size();
        intent = NavUtils.getParentActivityIntent(this.mSourceContext, intent);
        while (intent != null) {
            try {
                this.mIntents.add(n, (Object)intent);
                intent = NavUtils.getParentActivityIntent(this.mSourceContext, intent.getComponent());
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                Log.e((String)"TaskStackBuilder", (String)"Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException((Throwable)nameNotFoundException);
            }
        }
        return this;
    }

    public Intent editIntentAt(int n) {
        return (Intent)this.mIntents.get(n);
    }

    public Intent getIntent(int n) {
        return this.editIntentAt(n);
    }

    public int getIntentCount() {
        return this.mIntents.size();
    }

    public Intent[] getIntents() {
        return (Intent[])this.mIntents.toArray((Object[])new Intent[this.mIntents.size()]);
    }

    public PendingIntent getPendingIntent(int n, int n2) {
        return this.getPendingIntent(n, n2, null);
    }

    public PendingIntent getPendingIntent(int n, int n2, Bundle bundle) {
        if (this.mIntents.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] arrintent = (Intent[])this.mIntents.toArray((Object[])new Intent[this.mIntents.size()]);
        arrintent[0].addFlags(268484608);
        return IMPL.getPendingIntent(this.mSourceContext, arrintent, n, n2, bundle);
    }

    public Iterator<Intent> iterator() {
        return this.mIntents.iterator();
    }

    public void startActivities() {
        this.startActivities(null);
    }

    public void startActivities(Bundle bundle) {
        if (this.mIntents.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] arrintent = (Intent[])this.mIntents.toArray((Object[])new Intent[this.mIntents.size()]);
        arrintent[0].addFlags(268484608);
        if (!ContextCompat.startActivities(this.mSourceContext, arrintent, bundle)) {
            bundle = arrintent[arrintent.length - 1];
            bundle.addFlags(268435456);
            this.mSourceContext.startActivity((Intent)bundle);
        }
    }

    static interface TaskStackBuilderImpl {
        public PendingIntent getPendingIntent(Context var1, Intent[] var2, int var3, int var4, Bundle var5);
    }

    static class TaskStackBuilderImplBase
    implements TaskStackBuilderImpl {
        TaskStackBuilderImplBase() {
        }

        @Override
        public PendingIntent getPendingIntent(Context context, Intent[] intent, int n, int n2, Bundle bundle) {
            intent = intent[intent.length - 1];
            intent.addFlags(268435456);
            return PendingIntent.getActivity((Context)context, (int)n, (Intent)intent, (int)n2);
        }
    }

    static class TaskStackBuilderImplHoneycomb
    implements TaskStackBuilderImpl {
        TaskStackBuilderImplHoneycomb() {
        }

        @Override
        public PendingIntent getPendingIntent(Context context, Intent[] arrintent, int n, int n2, Bundle bundle) {
            arrintent[0].addFlags(268468224);
            return TaskStackBuilderHoneycomb.getActivitiesPendingIntent(context, n, arrintent, n2);
        }
    }

    static class TaskStackBuilderImplJellybean
    implements TaskStackBuilderImpl {
        TaskStackBuilderImplJellybean() {
        }

        @Override
        public PendingIntent getPendingIntent(Context context, Intent[] arrintent, int n, int n2, Bundle bundle) {
            arrintent[0].addFlags(268468224);
            return TaskStackBuilderJellybean.getActivitiesPendingIntent(context, n, arrintent, n2, bundle);
        }
    }

}

