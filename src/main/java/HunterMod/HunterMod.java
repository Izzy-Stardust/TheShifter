
package HunterMod;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;

import com.badlogic.gdx.graphics.Color;

import basemod.BaseMod;
import basemod.interfaces.EditCardsSubscriber;
import basemod.interfaces.EditCharactersSubscriber;
import basemod.interfaces.EditKeywordsSubscriber;
import basemod.interfaces.EditRelicsSubscriber;
import basemod.interfaces.EditStringsSubscriber;
import basemod.interfaces.OnCardUseSubscriber;
import basemod.interfaces.OnPowersModifiedSubscriber;
import basemod.interfaces.PostDrawSubscriber;
import basemod.interfaces.PostInitializeSubscriber;
import basemod.interfaces.PreMonsterTurnSubscriber;
import basemod.interfaces.PreStartGameSubscriber;
import basemod.interfaces.SetUnlocksSubscriber;
import characters.Enum;



@SpireInitializer


public class HunterMod implements 
PostInitializeSubscriber, EditCardsSubscriber, EditCharactersSubscriber, EditKeywordsSubscriber, PreStartGameSubscriber,
EditStringsSubscriber, SetUnlocksSubscriber, EditRelicsSubscriber, OnCardUseSubscriber, PostDrawSubscriber,
OnPowersModifiedSubscriber, PreMonsterTurnSubscriber {
	
	
	
	//details
	 private static final String MODNAME = "The Shifter";
	    private static final String AUTHOR = "Izzy_Stardust"; 
	    private static final String DESCRIPTION = "Character mod to add The Shifter, a character based roughly on the concept of a Ranger to fit with the DnD theming. Thank you to all those on the StS server who are helping, or will help me as I write this, and to the creators of the wikis and base characters to work off of. Trans motherf*ing Rights.";

    public static Color HunterAqua = new Color(0.0f, 0.66f, 0.61f, 1.0f);

    
    // Card backgrounds - The actual rectangular card.
    private static final String ATTACK_HUNTER_AQUA = "resources/CardUI/backgrounds/bg_attack_aqua_512.png";
    private static final String SKILL_HUNTER_AQUA = "resources/CardUI/backgrounds/bg_skill_aqua_512.png";
    private static final String POWER_HUNTER_AQUA = "resources/CardUI/backgrounds/bg_power_aqua_512.png";
    
    private static final String ENERGY_ORB_HUNTER_AQUA = "resources/CardUI/Energy/card_aqua_orb_512.png";
    private static final String CARD_ENERGY_ORB = "resources/CardUI/Energy/text_aqua_orb.png";
    
    private static final String ATTACK_HUNTER_AQUA_PORTRAIT = "resources/CardUI/backgrounds/bg_attack_aqua_512.png";
    private static final String SKILL_HUNTER_AQUA_PORTRAIT = "resources/CardUI/backgrounds/bg_skill_aqua_512.png";
    private static final String POWER_HUNTER_AQUA_PORTRAIT = "resources/CardUI/backgrounds/bg_power_aqua_512.png";
    private static final String ENERGY_ORB_HUNTER_AQUA_PORTRAIT = "resources/CardUI/Energy/card_aqua_orb.png";
    
    // Character assets
    private static final String THE_HUNTER_BUTTON = "resources/CharacterImage/HunterCharacterButton";
    //put real art in when you can, dummy, he's not the ironclad
    private static final String THE_HUNTER_PORTRAIT = "resources/CharacterImage/HunterCharacterPortraitBG.png";
    public static final String THE_HUNTER_SHOULDER_1 = "resources/CharacterImage/shoulder.png";
    public static final String THE_HUNTER_SHOULDER_2 = "resources/CharacterImage/shoulder2.png";
    public static final String THE_HUNTER_CORPSE = "resources/CharacterImage/corpse.png";
    
    
    
    public HunterMod() {
       BaseMod.subscribe(this);
    }
    
    public static void initialize() {
        BaseMod.addColor(
               Enum.Hunter,
                HunterAqua,
                "src/main/resources/CardUI/bg_attack_aqua_512",
                "src/main/resources/CardUI/bg_skill_aqua_512",
                "src/main/resources/CardUI/bg_power_aqua_512",
                "src/main/resources/CardUI/card_aqua_orb_512",
                "src/main/resources/CardUI/bg_attack_aqua",
                "src/main/resources/CardUI/bg_skill_aqua",
                "src/main/resources/CardUI/bg_power_aqua",
                "src/main/resources/CardUI/card_aqua_orb",
                "src/main/resources/CardUI/text_aqua_orb")





        )
        new HunterMod();
    }

}
