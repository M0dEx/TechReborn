package techreborn.items;


import reborncore.api.IItemTexture;
import techreborn.lib.ModInfo;

public abstract class ItemMetaBase extends ItemTR implements IItemTexture {
    @Override
    public String getModID() {
        return ModInfo.MOD_ID;
    }
}
