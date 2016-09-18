package com.bitdecay.game.system;

import com.bitdecay.game.component.CameraFollowComponent;
import com.bitdecay.game.component.PositionComponent;
import com.bitdecay.game.gameobject.MyGameObject;
import com.bitdecay.game.room.AbstractRoom;

public class CameraUpdateSystem extends AbstractForEachGobSystem {
    public CameraUpdateSystem(AbstractRoom room) {
        super(room);
    }

    @Override
    protected boolean validateGob(MyGameObject gob) {
        return gob.hasComponents(CameraFollowComponent.class, PositionComponent.class);
    }

    @Override
    protected void forEach(float delta, MyGameObject gob) {
        gob.forEach(PositionComponent.class, pos -> room.camera.addFollowPoint(pos.toVector2()));
    }

}
