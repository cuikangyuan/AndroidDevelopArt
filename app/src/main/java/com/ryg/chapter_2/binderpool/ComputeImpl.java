package com.ryg.chapter_2.binderpool;

import android.os.RemoteException;

import com.ryg.chapter_2.aidl.ICompute;

public class ComputeImpl extends ICompute.Stub {

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

}
