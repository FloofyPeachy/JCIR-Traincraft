package com.jcirmodelsquad.tcjcir;

import com.jcirmodelsquad.tcjcir.extras.JCIRQuote;
import com.jcirmodelsquad.tcjcir.extras.packets.GenerateTrackReport;
import com.jcirmodelsquad.tcjcir.extras.packets.StartMissionPacket;
import com.jcirmodelsquad.tcjcir.extras.packets.UpdateGeometryCar;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import scala.collection.script.Update;
import train.client.core.handlers.ClientTickHandler;
import train.client.gui.HUDMTC;
import train.client.gui.HUDloco;
import train.common.library.Info;

import java.util.ArrayList;
import java.util.Random;

@Mod(modid = JCIRTraincraft.MODID, name = JCIRTraincraft.NAME,  version = JCIRTraincraft.VERSION)
public class JCIRTraincraft
{
    public static final String MODID = "tcjcir";
    public static final String VERSION = "1.0";
    public static final String NAME = "JCIR-Traincraft";
    public static final Logger theLogger = LogManager.getLogger(NAME);
    public ArrayList<JCIRQuote> importantQuotes = new ArrayList<JCIRQuote>();
    public static SimpleNetworkWrapper startMissionPacketChannel = NetworkRegistry.INSTANCE.newSimpleChannel("GeometryCarStartMission");
    public static SimpleNetworkWrapper updateGeometryCarChannel = NetworkRegistry.INSTANCE.newSimpleChannel("UpdateGeometryCar");
    public static SimpleNetworkWrapper generateTrackReportChannel = NetworkRegistry.INSTANCE.newSimpleChannel("GenerateTrackReport");

    @SidedProxy(clientSide = "com.jcirmodelsquad.tcjcir.ClientProxy")
    public static ClientProxy clientProxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        importantQuotes.add(new JCIRQuote("Southern Pacific, more like sucking p***s.", "JCRail"));
        importantQuotes.add(new JCIRQuote("Stop putting liquids in the pit!!", "JCRail"));
        importantQuotes.add(new JCIRQuote("This is BS.", "JCRail"));
        importantQuotes.add(new JCIRQuote("Crock and Rail Torture", "PeachMaster"));
        importantQuotes.add(new JCIRQuote("I forgot how weird the crumbs at the bottom taste", "Bidahochi"));
        importantQuotes.add(new JCIRQuote("YES WE GET YOU WERE RA**D NOW SHUT IT", "JCRail"));
        importantQuotes.add(new JCIRQuote("mhmh aww but why", "SeaPickles2018"));
        importantQuotes.add(new JCIRQuote("Peachy senpai. Put a networking cable in my a**", "JCRail"));
        importantQuotes.add(new JCIRQuote("Oh hey it's Nutttt", "Bidahochi"));
        importantQuotes.add(new JCIRQuote("Nutt is a better fuel than Reinforced Fuel", "PeachMaster"));
        importantQuotes.add(new JCIRQuote("uWu Everybady, welcum to thuh south", "JCRail"));
        importantQuotes.add(new JCIRQuote("Hardcore P**n Factory: Pumping Industrial Nudes Since BR!", "JCRail"));
        importantQuotes.add(new JCIRQuote("Ima write an erotic JCIR fanfic tmmr", "imWastey"));
        importantQuotes.add(new JCIRQuote("I swear the Steven X Connie it will happen and IM GONNA MAKE IT AND NOBODY IS GONNA STOP ME", "JCRail"));
        importantQuotes.add(new JCIRQuote("It's not gay if you are god", "JCRail"));
        importantQuotes.add(new JCIRQuote("Wrong hand running", "JCRail"));
        importantQuotes.add(new JCIRQuote("I'm going to scream", "RezRising"));
        importantQuotes.add(new JCIRQuote("Your a dumbaxe", "PeachMaster"));
        importantQuotes.add(new JCIRQuote("Villagers are just sentient emerald ore, it's fine.", "Bidahochi"));
        importantQuotes.add(new JCIRQuote("Why are there so many GIANT FLAMING BONER WHEELS??", "JCRail"));
        importantQuotes.add(new JCIRQuote("Don't you love it when you have a bunch of angry boners in a pit? ", "JCRail"));
        importantQuotes.add(new JCIRQuote("Oh no the boner caster teleported away!", "JCRail"));
        importantQuotes.add(new JCIRQuote("I apparently have danny devito foot fe**ish", "JCRAil"));
        importantQuotes.add(new JCIRQuote("gENital jOUSting on the NES!?", "Bidahochi"));
        importantQuotes.add(new JCIRQuote("Peach is gonna go add that to his Wank Bank", "Hariesh"));
        importantQuotes.add(new JCIRQuote("You illegally trespassed on your own property", "JCRail"));
        importantQuotes.add(new JCIRQuote("I don't recall being a bomb, I'd think I'd know if I was. ", "Bidahochi"));
        importantQuotes.add(new JCIRQuote("*dies of internal combustion*", "Bidahochi"));
        importantQuotes.add(new JCIRQuote("o-oh, my bad im so terribly sorry..oh fuck", "Bidahochi"));
        importantQuotes.add(new JCIRQuote("a-ah shit im g-gonna bLOW!", "Bidahochi"));
        importantQuotes.add(new JCIRQuote("Ugh I'm sleeping! Ugh I'm getting gangbanged! Ugh I'm dead!", "PeachMaster"));
        importantQuotes.add(new JCIRQuote("psHAWWAWAWAAAASSHHH! its like putting a horseraddish in a blender!", "PeachMaster and Bidahochi"));
        importantQuotes.add(new JCIRQuote("oh my mouth tastes like a body and bath works", "Bidahochi"));
        importantQuotes.add(new JCIRQuote("Alright, this should work, let's test it...I'm assuming it didn't work. ", "PeachMaster"));
        importantQuotes.add(new JCIRQuote("Ope, my address was there.", "PeachMaster"));
        Random rand = new Random();
        theLogger.info("JCIR-Traincraft starting up!");
        JCIRQuote quoteOfTheDay = importantQuotes.get(rand.nextInt(importantQuotes.size()));
        theLogger.info(quoteOfTheDay.quote + " -" + quoteOfTheDay.from);
        clientProxy.registerEvents(event);
        clientProxy.registerKeyBindingHandler();
        //Register packets.
        startMissionPacketChannel.registerMessage(StartMissionPacket.Handler.class,StartMissionPacket.class, 220, Side.SERVER);
        updateGeometryCarChannel.registerMessage(UpdateGeometryCar.Handler.class, UpdateGeometryCar.class, 221, Side.SERVER);
        generateTrackReportChannel.registerMessage(GenerateTrackReport.Handler.class, GenerateTrackReport.class, 222, Side.SERVER);

        theLogger.info("GUIs, Keybinds, and Packet Channels are ready! Good job, self!");

    }


}
