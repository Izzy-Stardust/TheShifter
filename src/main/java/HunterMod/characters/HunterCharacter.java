package HunterMod.characters;

import java.util.ArrayList;

import com.badlogic.gdx.math.MathUtils;
import com.esotericsoftware.spine.AnimationState;
import com.megacrit.cardcrawl.actions.utility.ExhaustAllEtherealAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.EnergyManager;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.AbstractPower;
import com.megacrit.cardcrawl.screens.CharSelectInfo;
import com.megacrit.cardcrawl.unlock.UnlockTracker;

public class HunterCharacter extends CustomPlayer {
    public static final int ENERGY_PER_TURN = 3; // how much energy you get every turn
    public static final String HUNTER_SHOULDER_2 = "src\\main\\resources\\CharacterImage\\shoulder2.png"; // campfire pose
    public static final String HUNTER_SHOULDER_1 = "src\\main\\resources\\CharacterImage\\shoulder.png"; // another campfire pose
    public static final String HUNTER_CORPSE = "src\\main\\resources\\CharacterImage\\corpse.png"; // dead corpse
    public static final String HUNTER_SKELETON_ATLAS = "src\\main\\resources\\CharacterImage\\idle\\skeleton.atlas"; // spine animation atlas
    public static final String HUNTER_SKELETON_JSON = "src\\main\\resources\\CharacterImage\\idle\\skeleton.json"; // spine animation json

    public HunterCharacter (String name) {
        super(name, HunterEnum.HUNTER);

        this.dialogX = (this.drawX + 0.0F * Settings.scale); // set location for text bubbles
        this.dialogY = (this.drawY + 220.0F * Settings.scale); // you can just copy these values

        initializeClass(null, HUNTER_SHOULDER_2, // required call to load textures and setup energy/loadout
                HUNTER_SHOULDER_1,
                HUNTER_CORPSE,
                getLoadout(), 20.0F, -10.0F, 220.0F, 290.0F, new EnergyManager(ENERGY_PER_TURN));

        loadAnimation(HUNTER_SKELETON_ATLAS, HUNTER_SKELETON_JSON, 1.0F); // if you're using modified versions of base game animations or made animations in spine make sure to include this bit and the following lines

        AnimationState.TrackEntry e = this.state.setAnimation(0, "animation", true);
        e.setTime(e.getEndTime() * MathUtils.random());
    }

    public static ArrayList<String> getStartingDeck() {
        ArrayList<String> retVal = new ArrayList<>();
        retVal.add("Shot");
        retVal.add("Shot");
        retVal.add("Shot");
        retVal.add("Shot");
        retVal.add("Defend_Aqua");
        retVal.add("Defend_Aqua");
        retVal.add("Defend_Aqua");
        retVal.add("Defend_Aqua");
        retVal.add("Mark");
        retVal.add("Recklessness");
        retVal.add("Hunt");
        return retVal;
    }

    public static ArrayList<String> getStartingRelics() { // starting relics - also simple
        ArrayList<String> retVal = new ArrayList<>();
        retVal.add("MyRelic");
        UnlockTracker.markRelicAsSeen("MyRelic"); //TODO
        return retVal;
    }

    public static final int STARTING_HP = 75;
    public static final int MAX_HP = 75;
    public static final int STARTING_GOLD = 99;
    public static final int HAND_SIZE = 5;

    public static CharSelectInfo getLoadout() { // the rest of the character loadout so includes your character select screen info plus hp and starting gold
        return new CharSelectInfo("The Hunter", "Drawn to the spire by the spirits that once called this land home, the hunter's only goal is to rid the world of this un-natural being.",
                STARTING_HP, MAX_HP, ORB_SLOTS, STARTING_GOLD, HAND_SIZE,
                this, getStartingRelics(), getStartingDeck(), false);
    }

}