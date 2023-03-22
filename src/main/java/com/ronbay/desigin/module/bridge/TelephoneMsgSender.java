package com.ronbay.desigin.module.bridge;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * @Description:
 * @Author
 * @Date 2023/3/14
 * @Version 1.0
 */
public class TelephoneMsgSender implements MsgSender{
    private List<String> telephones;

    @Override
    public void send(String message) {
        BufferedInputStream in = null;
        DataInputStream dataInputStream = null;
    }
}
