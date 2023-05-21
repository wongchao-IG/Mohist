package com.mohistmc.forge;

import com.mohistmc.util.i18n.Message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.mohistmc.util.PluginsModsDelete.check;

/**
 * Why is there such a class?
 * Because we have included some MOD optimizations and modifications,
 * as well as some mods that are only used on the client, these cannot be loaded in Mohist
 */
public class AutoDeleteMods {
    public static final List<String> classlist = new ArrayList<>(Arrays.asList(
            "org.spongepowered.mod.SpongeMod" /*SpongeForge*/,
            "lumien.custommainmenu.CustomMainMenu" /*CustomMainMenu*/,
            "com.performant.coremod.Performant" /*Performant*/,
            "optifine.Differ" /*OptiFine*/,
            "guichaguri.betterfps.patches.misc.ServerPatch" /*BetterFps*/,
            "com.unnoen.unloader.UnloadHandler" /*Unloader*/,
            "cf.terminator.laggoggles.Main" /*LagGoggles*/,
            "com.github.terminatornl.laggoggles.Main" /*LagGoggles*/));

    public static void jar() throws Exception {
        System.out.println(Message.getString("update.mods"));
        for (String t : classlist)
            if (!t.contains("fastbench"))
                check("mods", t);
    }
}
