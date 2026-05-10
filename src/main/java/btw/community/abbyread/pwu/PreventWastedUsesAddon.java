package btw.community.abbyread.pwu;

import api.AddonHandler;
import api.BTWAddon;

public class PreventWastedUsesAddon extends BTWAddon {
    private static PreventWastedUsesAddon instance;

    public PreventWastedUsesAddon() {
        super();
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
    }
}