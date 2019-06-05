package by.epam.bakun.necklace.factory;

import by.epam.bakun.necklace.entity.ArtificalStone;
import by.epam.bakun.necklace.entity.NaturalStone;
import by.epam.bakun.necklace.entity.Stone;
import by.epam.bakun.necklace.entity.TypeOfStone;
import by.epam.bakun.necklace.valid.ValidatorStone;
import org.apache.log4j.Logger;

public class StoneFactory {
    private static final Logger logger = Logger.getLogger(StoneFactory.class.getName());
    public Stone createStone(String[] stoneParam) {

        logger.debug("call Validator");
        if (ValidatorStone.isParametersValid(stoneParam)) {

            logger.debug("check isNatural or isArtif stone");
            TypeOfStone type = TypeOfStone.valueOf(stoneParam[0]); //

            if (type == TypeOfStone.DIAMOND || type == TypeOfStone.PEARL || type == TypeOfStone.AMBER) {
                NaturalStone newStone = new NaturalStone();
                newStone.setTypeStone(TypeOfStone.valueOf(stoneParam[0]));
                newStone.setWeight(Double.parseDouble(stoneParam[1]));
                newStone.setCost(Double.parseDouble(stoneParam[2]));
                newStone.setTransparency(Integer.parseInt(stoneParam[3]));
                newStone.setMagicProperty(stoneParam[4]);
                newStone.setMagicForce(Integer.parseInt(stoneParam[5]));
                return newStone;
            } else {
                ArtificalStone newStone = new ArtificalStone();
                newStone.setTypeStone(TypeOfStone.valueOf(stoneParam[0]));
                newStone.setWeight(Double.parseDouble(stoneParam[1]));
                newStone.setCost(Double.parseDouble(stoneParam[2]));
                newStone.setTransparency(Integer.parseInt(stoneParam[3]));
                newStone.setCountryProduction(stoneParam[4]);
                newStone.setYearProduction(Integer.parseInt(stoneParam[5]));
                return newStone;
            }

        }
        throw new IllegalArgumentException();

    }


}
