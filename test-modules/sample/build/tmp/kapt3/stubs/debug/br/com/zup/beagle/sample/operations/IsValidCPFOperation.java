package br.com.zup.beagle.sample.operations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0006\"\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/beagle/sample/operations/IsValidCPFOperation;", "Lbr/com/zup/beagle/android/operation/Operation;", "()V", "execute", "Lbr/com/zup/beagle/android/operation/OperationType;", "params", "", "([Lbr/com/zup/beagle/android/operation/OperationType;)Lbr/com/zup/beagle/android/operation/OperationType;", "isCPF", "", "document", "", "sample_debug"})
@br.com.zup.beagle.annotation.RegisterOperation(name = "isValidCpf")
public final class IsValidCPFOperation implements br.com.zup.beagle.android.operation.Operation {
    
    public IsValidCPFOperation() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.beagle.android.operation.OperationType execute(@org.jetbrains.annotations.NotNull()
    br.com.zup.beagle.android.operation.OperationType... params) {
        return null;
    }
    
    @kotlin.Suppress(names = {"ReturnCount"})
    private final boolean isCPF(java.lang.String document) {
        return false;
    }
}