package com.bitdecay.game.system;

import com.bitdecay.game.gameobject.MyGameObject;
import com.bitdecay.game.room.AbstractRoom;

/**
 * All this class does is add one more layer for systems that don't need to have access to the full list of gobs when they are doing their processing.  In most cases, you will extend this class instead of AbstractSystem directly.  See the DrawSystem for an example of when you DO extend AbstractSystem directly.
 */
public abstract class AbstractForEachGobSystem extends AbstractSystem {

    public AbstractForEachGobSystem(AbstractRoom room) {
        super(room);
    }

    @Override
    public void process(float delta) {
        gobs.forEach(gob -> forEach(delta, gob));
    }

    protected abstract void forEach(float delta, MyGameObject gob);
}
