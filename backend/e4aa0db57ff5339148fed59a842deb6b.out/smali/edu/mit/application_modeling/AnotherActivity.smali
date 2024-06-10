.class public Ledu/mit/application_modeling/AnotherActivity;
.super Landroid/app/Activity;
.source "AnotherActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 13
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 14
    const/high16 v0, 0x7f030000

    invoke-virtual {p0, v0}, Ledu/mit/application_modeling/AnotherActivity;->setContentView(I)V

    .line 15
    const-string v1, "DroidBench"

    invoke-virtual {p0}, Ledu/mit/application_modeling/AnotherActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Ledu/mit/application_modeling/MyApplication;

    iget-object v0, v0, Ledu/mit/application_modeling/MyApplication;->imei:Ljava/lang/String;

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    return-void
.end method
