package com.lfl.stone.test;

/**
 * Created by stone on 2017/8/28.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
