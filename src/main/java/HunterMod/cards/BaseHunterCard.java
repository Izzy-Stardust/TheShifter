package HunterMod.cards;

import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

import basemod.interfaces.OnCardUseSubscriber;
import basemod.abstracts.CustomCard;

import HunterMod.characters.Enum;
import HunterMod.characters.HunterCharacter;

public abstract class BaseHunterCard extends CustomCard{

    public BaseHunterCard(String id,
                          String name,
                          String img,
                          int cost,
                          String rawDescription,
                          CardType type,
                          CardColor color,
                          CardRarity rarity,
                          CardTarget target) {
        super(id, name, img, cost, rawDescription, type, color, rarity, target);

    }
}
