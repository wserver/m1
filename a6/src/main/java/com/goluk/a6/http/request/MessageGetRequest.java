package com.goluk.a6.http.request;

import com.goluk.a6.http.IRequestResultListener;
import com.goluk.a6.http.responsebean.MessageResult;

import java.util.HashMap;

public class MessageGetRequest extends GolukFastjsonRequest<MessageResult> {

    public MessageGetRequest(int requestType, IRequestResultListener listener) {
        super(requestType, MessageResult.class, listener);
    }

    @Override
    protected String getPath() {
        return "/system/app/setting";
    }

    @Override
    protected String getMethod() {
        return "";
    }

    public void get(String uid) {
        HashMap<String, String> headers = (HashMap<String, String>) getParam();
        headers.put("commuid", uid);
        get();
    }
}
