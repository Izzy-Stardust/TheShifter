package HunterMod.cards;


import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.GainBlockAction;
import com.megacrit.cardcrawl.cards.AbstractCard;

import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.localization.CardStrings;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

import HunterMod.characters.Enum;

public class Defend_Aqua extends CustomCard {
    public static final String ID = "HunterMod:Defend_Aqua";
    private static CardStrings cardStrings = CardCrawlGame.languagePack.getCardStrings(ID);
    public static final String NAME = "Defend";
    public static final String DESCRIPTION = cardStrings.DESCRIPTION;
    public static final String IMG_PATH = "Cards/defend_Aqua.png";
    private static final int COST = 1;
    private static final int BLOCK = 5;
    private static final int UPGRADE_PLUS_BLOCK = 3;

    public Defend_Aqua() {
        super(ID, NAME, IMG_PATH, COST, DESCRIPTION,
                AbstractCard.CardType.SKILL, Enum.HunterAqua,
                CardRarity.BASIC, AbstractCard.CardTarget.SELF);
        this.baseBlock = BLOCK;

        this.setBackgroundTexture("resources/CardUI/backgrounds/bg_skill_aqua_512.png", "resources/CardUI/backgrounds/bg_skill_aqua_512.png");

    }

    @Override
    public void use(AbstractPlayer p, AbstractMonster m) {
        AbstractDungeon.actionManager.addToBottom(new GainBlockAction(p,p,this.block));


    }

    @Override
    public AbstractCard makeCopy() {
        return new Defend_Aqua();
    }

    @Override
    public void upgrade() {
        if (!this.upgraded) {
            this.upgradeName();
            this.upgradeDamage(UPGRADE_PLUS_BLOCK);
        }



    }

    public boolean isDefend(){
        return true;
    }
}
