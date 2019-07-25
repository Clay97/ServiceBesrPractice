package com.example.servicebesrpractice;

public interface DownloadListenner {

    void onProgress(int progess);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();

}
