package com.ryg.chapter_2.aidl;


import android.os.IInterface;
import android.os.RemoteException;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class BookManagerServiceBinder extends IBookManager.Stub {


    @Nullable
    @Override
    public IInterface queryLocalInterface(@NonNull String descriptor) {
        return super.queryLocalInterface(descriptor);
    }


    @Override
    public List<Book> getBookList() throws RemoteException {
        return null;
    }

    @Override
    public void addBook(Book book) throws RemoteException {

    }

    @Override
    public void registerListener(IOnNewBookArrivedListener listener) throws RemoteException {

    }

    @Override
    public void unregisterListener(IOnNewBookArrivedListener listener) throws RemoteException {

    }
}
