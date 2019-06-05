package by.epam.bakun.necklace.valid;

import by.epam.bakun.necklace.entity.TypeOfStone;

public class ValidatorStone {
    public ValidatorStone() {
    }

    public static boolean isParametersValid(String[] param) {
          return (isNatStoneValid(param) || isArtStoneValid(param));
    }

    public static boolean isStoneParamValid(String[] stoneParam) {
        boolean isValid =  ((stoneParam.length == 6)
                && isTypeValid(stoneParam[0])
                && isWeightValid(stoneParam[1])
                && isCastValid(stoneParam[2])
                && isTransparencyValid(stoneParam[3]));
            return isValid;
    }

    public static boolean isNatStoneValid(String[] natStoneParam) {
        boolean isStoneValid = isStoneParamValid(natStoneParam);
        TypeOfStone type  = TypeOfStone.valueOf(natStoneParam[0]);
        boolean isNatParValid = ((type == TypeOfStone.DIAMOND || type == TypeOfStone.AMBER
                || type == TypeOfStone.PEARL) && isMagicPropertyValid(natStoneParam[4])
                && isMagicForceValid(natStoneParam[5]));
        return (isStoneValid && isNatParValid);
    }

    public static boolean isArtStoneValid(String[] artStoneParam) {
        boolean isStoneValid = isStoneParamValid(artStoneParam);
        TypeOfStone type  = TypeOfStone.valueOf(artStoneParam[0]);
        boolean isAtrParValid = ((type == TypeOfStone.RUBY || type == TypeOfStone.SAPPHIR
                || type == TypeOfStone.SPINEL) && isCountryProductionValid(artStoneParam[4])
                && isYearProductionValid(artStoneParam[5]));
        return (isStoneValid && isAtrParValid);
    }

    public static boolean isTypeValid(String arrayFirst) {
        TypeOfStone[] x = TypeOfStone.values();
        for(TypeOfStone arr: x){
            if (arrayFirst.equalsIgnoreCase(arr.name())) {
                return true;
            }
        }
      return false;
    }

    public static boolean isNumericDouble(String element) {
        try {
            double d = Double.parseDouble(element);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isNumericInteger(String element) {
        try {
            int number = Integer.parseInt(element);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isWeightValid(String arraySecond) {
        double maxWeight = 10_000;
        if (isNumericDouble(arraySecond)) {
                double d = Double.parseDouble(arraySecond);
            if (d > 0 && d < maxWeight) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCastValid(String arrayThird) {
        double minCast = 0;
        if (isNumericDouble(arrayThird)) {
            double d = Double.parseDouble(arrayThird);
            if (d > minCast) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTransparencyValid(String arrayForth) {
        int minTransparency = 0;
        int maxTransparency = 100;
        int transparency;
        if (isNumericInteger(arrayForth)){
            transparency = Integer.parseInt(arrayForth);
            if ((transparency > minTransparency-1)&&(transparency < maxTransparency + 1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCountryProductionValid(String arrayFifth) {
        return (!arrayFifth.equals(""));
    }

    public static boolean isYearProductionValid(String arraySixth)  {
        int minYear = 0;
        int maxYear = 2019;
        int year;
        if (isNumericInteger(arraySixth)){
            year = Integer.parseInt(arraySixth);
            if ((year > minYear-1)&&(year < maxYear + 1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMagicPropertyValid(String arrayFifth) {
        return (!arrayFifth.equals(""));
    }

    public static boolean isMagicForceValid(String arraySixth)  {
        int minMagicForce = 0;
        int maxMagicForce = 100;
        int transparency;
        if (isNumericInteger(arraySixth)){
            transparency = Integer.parseInt(arraySixth);
            if ((transparency > minMagicForce - 1)&&(transparency < maxMagicForce + 1)) {
                return true;
            }
        }
        return false;
    }
}
