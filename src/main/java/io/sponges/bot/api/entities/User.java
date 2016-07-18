package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.channel.Channel;
import io.sponges.bot.api.entities.data.UserData;
import io.sponges.bot.api.storage.DataObject;

import java.util.List;

public interface User extends Entity {

    String getId();
    
    Network getNetwork();

    List<Channel> getChannels();

    UserData getUserData();

    DataObject getData();

    boolean isPlatformAdmin();

    boolean isOp();

    boolean hasPermission(String permission);

    void kick();

}
