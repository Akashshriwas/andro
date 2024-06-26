// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v7.internal.view.menu;

class BaseWrapper<T>
{
    final T mWrappedObject;
    
    BaseWrapper(final T mWrappedObject) {
        if (mWrappedObject == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.mWrappedObject = mWrappedObject;
    }
    
    public T getWrappedObject() {
        return this.mWrappedObject;
    }
}
