package com.servi.rabbit.channel;

import com.rabbitmq.client.Channel;
import com.servi.rabbit.connect.IConnect;

import java.io.IOException;

public class IChannel {

    private static IChannel INSTANCE = new IChannel();

    private IChannel() {
    }

    public static IChannel getInstance() {
        return INSTANCE;
    }

    public Channel createChannel() {

        try {
            return IConnect.getInstance().getConnection().createChannel();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
