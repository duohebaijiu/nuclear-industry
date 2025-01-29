package nimod;

import arc.Events;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;

public class ni extends Mod {
    public ni() {
        Events.on(EventType.ClientLoadEvent.class,e->{
            Time.run(10f,()->{
                BaseDialog dialog = new BaseDialog("welcome to my mod");
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent() {
        super.loadContent();
    }
}
