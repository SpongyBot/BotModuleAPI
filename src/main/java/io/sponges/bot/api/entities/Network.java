package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.data.NetworkData;
import io.sponges.bot.api.entities.manager.ChannelManager;
import io.sponges.bot.api.entities.manager.ModuleDataManager;
import io.sponges.bot.api.entities.manager.UserManager;
import io.sponges.bot.api.storage.DataObject;

public interface Network extends Entity {

    String getId();

    Client getClient();

    ChannelManager getChannelManager();

    UserManager getUserManager();

    DataObject getData();

    ModuleDataManager getModuleDataManager();

    NetworkData getNetworkData();
}
