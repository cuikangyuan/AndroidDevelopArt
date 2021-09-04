package com.ryg.chapter_2.aidl;

interface ISecurityCenter {
    String encrypt(String content);
    String decrypt(String password);
}