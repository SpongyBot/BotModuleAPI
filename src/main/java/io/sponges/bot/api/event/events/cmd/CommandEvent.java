package io.sponges.bot.api.event.events.cmd;

import io.sponges.bot.api.event.framework.Event;

public abstract class CommandEvent extends Event {

    public CommandEvent() {
    }

    public CommandEvent(boolean cancellable) {
        super(cancellable);
    }

}
