package nuclearindustry;

import arc.Events;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;

public class NuclearIndustry extends Mod {
    public NuclearIndustry() {
        Events.on(EventType.ClientLoadEvent.class,e->{
            Time.run(10f,()->{
                BaseDialog dialog = new BaseDialog("Welcome to nuclear industry world!");
                dialog.cont.add("Happy new year!");
                Time.run(100f,dialog::addCloseButton);
                dialog.show();
            });
        });
    }
}
