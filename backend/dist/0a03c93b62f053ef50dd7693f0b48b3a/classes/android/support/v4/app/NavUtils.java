package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.IntentCompat;
import android.util.Log;

public class NavUtils
{
  private static final NavUtilsImpl IMPL;
  public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
  private static final String TAG = "NavUtils";
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16) {}
    for (IMPL = new NavUtilsImplJB();; IMPL = new NavUtilsImplBase()) {
      return;
    }
  }
  
  public static Intent getParentActivityIntent(Activity paramActivity)
  {
    return IMPL.getParentActivityIntent(paramActivity);
  }
  
  public static Intent getParentActivityIntent(Context paramContext, ComponentName paramComponentName)
    throws PackageManager.NameNotFoundException
  {
    String str = getParentActivityName(paramContext, paramComponentName);
    if (str == null)
    {
      paramContext = null;
      return paramContext;
    }
    paramComponentName = new ComponentName(paramComponentName.getPackageName(), str);
    if (getParentActivityName(paramContext, paramComponentName) == null) {}
    for (paramContext = IntentCompat.makeMainActivity(paramComponentName);; paramContext = new Intent().setComponent(paramComponentName)) {
      break;
    }
  }
  
  public static Intent getParentActivityIntent(Context paramContext, Class<?> paramClass)
    throws PackageManager.NameNotFoundException
  {
    paramClass = getParentActivityName(paramContext, new ComponentName(paramContext, paramClass));
    if (paramClass == null)
    {
      paramContext = null;
      return paramContext;
    }
    paramClass = new ComponentName(paramContext, paramClass);
    if (getParentActivityName(paramContext, paramClass) == null) {}
    for (paramContext = IntentCompat.makeMainActivity(paramClass);; paramContext = new Intent().setComponent(paramClass)) {
      break;
    }
  }
  
  public static String getParentActivityName(Activity paramActivity)
  {
    try
    {
      paramActivity = getParentActivityName(paramActivity, paramActivity.getComponentName());
      return paramActivity;
    }
    catch (PackageManager.NameNotFoundException paramActivity)
    {
      throw new IllegalArgumentException(paramActivity);
    }
  }
  
  public static String getParentActivityName(Context paramContext, ComponentName paramComponentName)
    throws PackageManager.NameNotFoundException
  {
    paramComponentName = paramContext.getPackageManager().getActivityInfo(paramComponentName, 128);
    return IMPL.getParentActivityName(paramContext, paramComponentName);
  }
  
  public static void navigateUpFromSameTask(Activity paramActivity)
  {
    Intent localIntent = getParentActivityIntent(paramActivity);
    if (localIntent == null) {
      throw new IllegalArgumentException("Activity " + paramActivity.getClass().getSimpleName() + " does not have a parent activity name specified." + " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> " + " element in your manifest?)");
    }
    navigateUpTo(paramActivity, localIntent);
  }
  
  public static void navigateUpTo(Activity paramActivity, Intent paramIntent)
  {
    IMPL.navigateUpTo(paramActivity, paramIntent);
  }
  
  public static boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
  {
    return IMPL.shouldUpRecreateTask(paramActivity, paramIntent);
  }
  
  static abstract interface NavUtilsImpl
  {
    public abstract Intent getParentActivityIntent(Activity paramActivity);
    
    public abstract String getParentActivityName(Context paramContext, ActivityInfo paramActivityInfo);
    
    public abstract void navigateUpTo(Activity paramActivity, Intent paramIntent);
    
    public abstract boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent);
  }
  
  static class NavUtilsImplBase
    implements NavUtils.NavUtilsImpl
  {
    public Intent getParentActivityIntent(Activity paramActivity)
    {
      Object localObject = null;
      String str = NavUtils.getParentActivityName(paramActivity);
      if (str == null) {
        paramActivity = (Activity)localObject;
      }
      for (;;)
      {
        return paramActivity;
        ComponentName localComponentName = new ComponentName(paramActivity, str);
        try
        {
          if (NavUtils.getParentActivityName(paramActivity, localComponentName) == null) {}
          for (paramActivity = IntentCompat.makeMainActivity(localComponentName);; paramActivity = paramActivity.setComponent(localComponentName))
          {
            break;
            paramActivity = new android/content/Intent;
            paramActivity.<init>();
          }
        }
        catch (PackageManager.NameNotFoundException paramActivity)
        {
          Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + str + "' in manifest");
          paramActivity = (Activity)localObject;
        }
      }
    }
    
    public String getParentActivityName(Context paramContext, ActivityInfo paramActivityInfo)
    {
      if (metaData == null) {
        paramActivityInfo = null;
      }
      for (;;)
      {
        return paramActivityInfo;
        String str = metaData.getString("android.support.PARENT_ACTIVITY");
        if (str == null)
        {
          paramActivityInfo = null;
        }
        else
        {
          paramActivityInfo = str;
          if (str.charAt(0) == '.') {
            paramActivityInfo = paramContext.getPackageName() + str;
          }
        }
      }
    }
    
    public void navigateUpTo(Activity paramActivity, Intent paramIntent)
    {
      paramIntent.addFlags(67108864);
      paramActivity.startActivity(paramIntent);
      paramActivity.finish();
    }
    
    public boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
    {
      paramActivity = paramActivity.getIntent().getAction();
      if ((paramActivity != null) && (!paramActivity.equals("android.intent.action.MAIN"))) {}
      for (boolean bool = true;; bool = false) {
        return bool;
      }
    }
  }
  
  static class NavUtilsImplJB
    extends NavUtils.NavUtilsImplBase
  {
    public Intent getParentActivityIntent(Activity paramActivity)
    {
      Intent localIntent1 = NavUtilsJB.getParentActivityIntent(paramActivity);
      Intent localIntent2 = localIntent1;
      if (localIntent1 == null) {
        localIntent2 = superGetParentActivityIntent(paramActivity);
      }
      return localIntent2;
    }
    
    public String getParentActivityName(Context paramContext, ActivityInfo paramActivityInfo)
    {
      String str1 = NavUtilsJB.getParentActivityName(paramActivityInfo);
      String str2 = str1;
      if (str1 == null) {
        str2 = super.getParentActivityName(paramContext, paramActivityInfo);
      }
      return str2;
    }
    
    public void navigateUpTo(Activity paramActivity, Intent paramIntent)
    {
      NavUtilsJB.navigateUpTo(paramActivity, paramIntent);
    }
    
    public boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
    {
      return NavUtilsJB.shouldUpRecreateTask(paramActivity, paramIntent);
    }
    
    Intent superGetParentActivityIntent(Activity paramActivity)
    {
      return super.getParentActivityIntent(paramActivity);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.NavUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */