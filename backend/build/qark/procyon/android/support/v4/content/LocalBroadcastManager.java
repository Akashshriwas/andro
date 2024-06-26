// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.content;

import java.util.Set;
import android.net.Uri;
import android.util.Log;
import android.content.Intent;
import android.os.Message;
import android.os.Looper;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

public class LocalBroadcastManager
{
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock;
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions;
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList<BroadcastRecord> mPendingBroadcasts;
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> mReceivers;
    
    static {
        mLock = new Object();
    }
    
    private LocalBroadcastManager(final Context mAppContext) {
        this.mReceivers = new HashMap<BroadcastReceiver, ArrayList<IntentFilter>>();
        this.mActions = new HashMap<String, ArrayList<ReceiverRecord>>();
        this.mPendingBroadcasts = new ArrayList<BroadcastRecord>();
        this.mAppContext = mAppContext;
        this.mHandler = new Handler(mAppContext.getMainLooper()) {
            public void handleMessage(final Message message) {
                switch (message.what) {
                    default: {
                        super.handleMessage(message);
                    }
                    case 1: {
                        LocalBroadcastManager.this.executePendingBroadcasts();
                    }
                }
            }
        };
    }
    
    private void executePendingBroadcasts() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/content/LocalBroadcastManager.mReceivers:Ljava/util/HashMap;
        //     4: astore_3       
        //     5: aload_3        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        android/support/v4/content/LocalBroadcastManager.mPendingBroadcasts:Ljava/util/ArrayList;
        //    11: invokevirtual   java/util/ArrayList.size:()I
        //    14: istore_1       
        //    15: iload_1        
        //    16: ifgt            22
        //    19: aload_3        
        //    20: monitorexit    
        //    21: return         
        //    22: iload_1        
        //    23: anewarray       Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
        //    26: astore          4
        //    28: aload_0        
        //    29: getfield        android/support/v4/content/LocalBroadcastManager.mPendingBroadcasts:Ljava/util/ArrayList;
        //    32: aload           4
        //    34: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    37: pop            
        //    38: aload_0        
        //    39: getfield        android/support/v4/content/LocalBroadcastManager.mPendingBroadcasts:Ljava/util/ArrayList;
        //    42: invokevirtual   java/util/ArrayList.clear:()V
        //    45: aload_3        
        //    46: monitorexit    
        //    47: iconst_0       
        //    48: istore_1       
        //    49: iload_1        
        //    50: aload           4
        //    52: arraylength    
        //    53: if_icmpge       0
        //    56: aload           4
        //    58: iload_1        
        //    59: aaload         
        //    60: astore_3       
        //    61: iconst_0       
        //    62: istore_2       
        //    63: iload_2        
        //    64: aload_3        
        //    65: getfield        android/support/v4/content/LocalBroadcastManager$BroadcastRecord.receivers:Ljava/util/ArrayList;
        //    68: invokevirtual   java/util/ArrayList.size:()I
        //    71: if_icmpge       113
        //    74: aload_3        
        //    75: getfield        android/support/v4/content/LocalBroadcastManager$BroadcastRecord.receivers:Ljava/util/ArrayList;
        //    78: iload_2        
        //    79: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    82: checkcast       Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
        //    85: getfield        android/support/v4/content/LocalBroadcastManager$ReceiverRecord.receiver:Landroid/content/BroadcastReceiver;
        //    88: aload_0        
        //    89: getfield        android/support/v4/content/LocalBroadcastManager.mAppContext:Landroid/content/Context;
        //    92: aload_3        
        //    93: getfield        android/support/v4/content/LocalBroadcastManager$BroadcastRecord.intent:Landroid/content/Intent;
        //    96: invokevirtual   android/content/BroadcastReceiver.onReceive:(Landroid/content/Context;Landroid/content/Intent;)V
        //    99: iload_2        
        //   100: iconst_1       
        //   101: iadd           
        //   102: istore_2       
        //   103: goto            63
        //   106: astore          4
        //   108: aload_3        
        //   109: monitorexit    
        //   110: aload           4
        //   112: athrow         
        //   113: iload_1        
        //   114: iconst_1       
        //   115: iadd           
        //   116: istore_1       
        //   117: goto            49
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      15     106    113    Any
        //  19     21     106    113    Any
        //  22     47     106    113    Any
        //  108    110    106    113    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Cannot invoke "com.strobel.assembler.metadata.TypeReference.getSimpleType()" because "type" is null
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static LocalBroadcastManager getInstance(final Context context) {
        synchronized (LocalBroadcastManager.mLock) {
            if (LocalBroadcastManager.mInstance == null) {
                LocalBroadcastManager.mInstance = new LocalBroadcastManager(context.getApplicationContext());
            }
            return LocalBroadcastManager.mInstance;
        }
    }
    
    public void registerReceiver(final BroadcastReceiver broadcastReceiver, final IntentFilter e) {
        synchronized (this.mReceivers) {
            final ReceiverRecord e2 = new ReceiverRecord(e, broadcastReceiver);
            ArrayList<IntentFilter> value;
            if ((value = this.mReceivers.get(broadcastReceiver)) == null) {
                value = new ArrayList<IntentFilter>(1);
                this.mReceivers.put(broadcastReceiver, value);
            }
            value.add(e);
            for (int i = 0; i < e.countActions(); ++i) {
                final String action = e.getAction(i);
                ArrayList<ReceiverRecord> value2;
                if ((value2 = this.mActions.get(action)) == null) {
                    value2 = new ArrayList<ReceiverRecord>(1);
                    this.mActions.put(action, value2);
                }
                value2.add(e2);
            }
        }
    }
    
    public boolean sendBroadcast(final Intent obj) {
        // monitorexit(hashMap)
        while (true) {
            while (true) {
            Block_4_Outer:
                while (true) {
                    ArrayList<ReceiverRecord> list2 = null;
                Label_0161_Outer:
                    while (true) {
                        Label_0521: {
                            while (true) {
                                ArrayList<ReceiverRecord> list = null;
                                int index = 0;
                                Label_0510: {
                                    Label_0502: {
                                        final int n;
                                        int match;
                                        synchronized (this.mReceivers) {
                                            final String action = obj.getAction();
                                            final String resolveTypeIfNeeded = obj.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
                                            final Uri data = obj.getData();
                                            final String scheme = obj.getScheme();
                                            final Set categories = obj.getCategories();
                                            if ((obj.getFlags() & 0x8) == 0x0) {
                                                break Label_0521;
                                            }
                                            n = 1;
                                            if (n != 0) {
                                                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + obj);
                                            }
                                            final ArrayList<ReceiverRecord> obj2 = this.mActions.get(obj.getAction());
                                            if (obj2 == null) {
                                                break;
                                            }
                                            if (n != 0) {
                                                Log.v("LocalBroadcastManager", "Action list: " + obj2);
                                            }
                                            break Label_0502;
                                            // iftrue(Label_0305:, n == 0)
                                            // iftrue(Label_0214:, n == 0)
                                            // iftrue(Label_0245:, !e.broadcasting)
                                            // iftrue(Label_0510:, n == 0)
                                            // iftrue(Label_0346:, match < 0)
                                            // iftrue(Label_0554:, index >= obj2.size())
                                            // iftrue(Label_0323:, list = list2 != null)
                                            ReceiverRecord e = null;
                                            Block_15_Outer:Block_11_Outer:
                                            while (true) {
                                                list.add(e);
                                                e.broadcasting = true;
                                                break Label_0510;
                                            Label_0305:
                                                while (true) {
                                                    while (true) {
                                                    Block_13:
                                                        while (true) {
                                                            Block_12: {
                                                                Block_16: {
                                                                    break Block_16;
                                                                    e = obj2.get(index);
                                                                    break Block_12;
                                                                    break Block_13;
                                                                }
                                                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                                                break Label_0305;
                                                            }
                                                            Log.v("LocalBroadcastManager", "Matching against filter " + e.filter);
                                                            continue Label_0161_Outer;
                                                        }
                                                        list = list2;
                                                        break Block_15_Outer;
                                                        Label_0245: {
                                                            match = e.filter.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                                                        }
                                                        continue Block_11_Outer;
                                                    }
                                                    continue Label_0161_Outer;
                                                }
                                                list = new ArrayList<ReceiverRecord>();
                                                continue Block_15_Outer;
                                            }
                                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                                            list = list2;
                                            break Label_0510;
                                        }
                                        Label_0346: {
                                            list = list2;
                                        }
                                        if (n != 0) {
                                            String str = null;
                                            switch (match) {
                                                default: {
                                                    str = "unknown reason";
                                                    break;
                                                }
                                                case -3: {
                                                    str = "action";
                                                    break;
                                                }
                                                case -4: {
                                                    str = "category";
                                                    break;
                                                }
                                                case -2: {
                                                    str = "data";
                                                    break;
                                                }
                                                case -1: {
                                                    str = "type";
                                                    break;
                                                }
                                            }
                                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                            list = list2;
                                        }
                                        break Label_0510;
                                    }
                                    list2 = null;
                                    index = 0;
                                    continue Block_4_Outer;
                                }
                                ++index;
                                list2 = list;
                                continue Block_4_Outer;
                            }
                        }
                        int n = 0;
                        continue Block_4_Outer;
                    }
                    int i = 0;
                    while (i < list2.size()) {
                        list2.get(i).broadcasting = false;
                        ++i;
                    }
                    // iftrue(Label_0492:, this.mHandler.hasMessages(1))
                Label_0492:
                    while (true) {
                        Label_0454: {
                            break Label_0454;
                            this.mHandler.sendEmptyMessage(1);
                            break Label_0492;
                        }
                        this.mPendingBroadcasts.add(new BroadcastRecord(obj, list2));
                        continue;
                    }
                    // monitorexit(hashMap)
                    return true;
                }
                return false;
                Label_0554: {
                    final ArrayList<ReceiverRecord> list2;
                    if (list2 != null) {
                        final int i = 0;
                        continue;
                    }
                }
                break;
            }
            continue;
        }
    }
    
    public void sendBroadcastSync(final Intent intent) {
        if (this.sendBroadcast(intent)) {
            this.executePendingBroadcasts();
        }
    }
    
    public void unregisterReceiver(final BroadcastReceiver key) {
    Label_0054_Outer:
        while (true) {
        Label_0031:
            while (true) {
                ArrayList<IntentFilter> list;
                int index = 0;
                IntentFilter intentFilter;
                int n = 0;
                String action;
                ArrayList<ReceiverRecord> list2;
                int n2;
                int n3 = 0;
                Label_0054:Label_0094_Outer:
                while (true) {
                Label_0094:
                    while (true) {
                        Label_0173: {
                            Label_0168: {
                                synchronized (this.mReceivers) {
                                    list = this.mReceivers.remove(key);
                                    if (list == null) {
                                        return;
                                    }
                                    break Label_0168;
                                    // iftrue(Label_0190:, n >= intentFilter.countActions())
                                    // iftrue(Label_0181:, list2 == null)
                                    // iftrue(Label_0137:, n2 >= list2.size())
                                    // iftrue(Label_0158:, index >= list.size())
                                Block_8_Outer:
                                    while (true) {
                                        while (true) {
                                            Block_7: {
                                            Block_6:
                                                while (true) {
                                                    intentFilter = list.get(index);
                                                    n = 0;
                                                    break Label_0054;
                                                    this.mActions.remove(action);
                                                    break Label_0094;
                                                    Block_5: {
                                                        break Block_5;
                                                        list2.remove(n2);
                                                        n3 = n2 - 1;
                                                        break Label_0173;
                                                        Label_0158: {
                                                            return;
                                                        }
                                                    }
                                                    action = intentFilter.getAction(n);
                                                    list2 = this.mActions.get(action);
                                                    break Block_6;
                                                    break Block_7;
                                                    continue Label_0054_Outer;
                                                }
                                                n2 = 0;
                                                continue Label_0094;
                                            }
                                            n3 = n2;
                                            continue Label_0094_Outer;
                                        }
                                        Label_0137: {
                                            continue Block_8_Outer;
                                        }
                                    }
                                }
                                // iftrue(Label_0173:, (ReceiverRecord)list2.get(n2).receiver != broadcastReceiver)
                                // iftrue(Label_0181:, list2.size() > 0)
                            }
                            index = 0;
                            continue Label_0031;
                        }
                        n2 = n3 + 1;
                        continue Label_0094;
                    }
                    ++n;
                    continue Label_0054;
                }
                Label_0190: {
                    ++index;
                }
                continue Label_0031;
            }
        }
    }
    
    private static class BroadcastRecord
    {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;
        
        BroadcastRecord(final Intent intent, final ArrayList<ReceiverRecord> receivers) {
            this.intent = intent;
            this.receivers = receivers;
        }
    }
    
    private static class ReceiverRecord
    {
        boolean broadcasting;
        final IntentFilter filter;
        final BroadcastReceiver receiver;
        
        ReceiverRecord(final IntentFilter filter, final BroadcastReceiver receiver) {
            this.filter = filter;
            this.receiver = receiver;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.receiver);
            sb.append(" filter=");
            sb.append(this.filter);
            sb.append("}");
            return sb.toString();
        }
    }
}
