package br.com.zup.beagle.sample.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J+\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lbr/com/zup/beagle/sample/widgets/Input;", "Lbr/com/zup/beagle/android/widget/WidgetView;", "hint", "Lbr/com/zup/beagle/android/context/Bind;", "", "onTextChange", "", "Lbr/com/zup/beagle/android/action/Action;", "(Lbr/com/zup/beagle/android/context/Bind;Ljava/util/List;)V", "getHint", "()Lbr/com/zup/beagle/android/context/Bind;", "getOnTextChange", "()Ljava/util/List;", "buildView", "Landroid/widget/EditText;", "rootView", "Lbr/com/zup/beagle/android/widget/RootView;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sample_debug"})
@br.com.zup.beagle.annotation.RegisterWidget(name = "input")
public final class Input extends br.com.zup.beagle.android.widget.WidgetView {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.beagle.android.context.Bind<java.lang.String> hint = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<br.com.zup.beagle.android.action.Action> onTextChange = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.beagle.sample.widgets.Input copy(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.context.Bind<java.lang.String> hint, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends br.com.zup.beagle.android.action.Action> onTextChange) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Input(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.context.Bind<java.lang.String> hint, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends br.com.zup.beagle.android.action.Action> onTextChange) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.beagle.android.context.Bind<java.lang.String> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.beagle.android.context.Bind<java.lang.String> getHint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<br.com.zup.beagle.android.action.Action> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<br.com.zup.beagle.android.action.Action> getOnTextChange() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.EditText buildView(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.widget.RootView rootView) {
        return null;
    }
}