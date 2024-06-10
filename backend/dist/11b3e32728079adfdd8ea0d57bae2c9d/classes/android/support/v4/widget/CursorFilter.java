package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class CursorFilter
  extends Filter
{
  CursorFilterClient mClient;
  
  CursorFilter(CursorFilterClient paramCursorFilterClient)
  {
    mClient = paramCursorFilterClient;
  }
  
  public CharSequence convertResultToString(Object paramObject)
  {
    return mClient.convertToString((Cursor)paramObject);
  }
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Cursor localCursor = mClient.runQueryOnBackgroundThread(paramCharSequence);
    paramCharSequence = new Filter.FilterResults();
    if (localCursor != null) {
      count = localCursor.getCount();
    }
    for (values = localCursor;; values = null)
    {
      return paramCharSequence;
      count = 0;
    }
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = mClient.getCursor();
    if ((values != null) && (values != paramCharSequence)) {
      mClient.changeCursor((Cursor)values);
    }
  }
  
  static abstract interface CursorFilterClient
  {
    public abstract void changeCursor(Cursor paramCursor);
    
    public abstract CharSequence convertToString(Cursor paramCursor);
    
    public abstract Cursor getCursor();
    
    public abstract Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.CursorFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */