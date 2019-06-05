package bakun.necklace.entity;

import by.epam.bakun.necklace.entity.NaturalStone;
import by.epam.bakun.necklace.entity.Stone;
import by.epam.bakun.necklace.entity.TypeOfStone;
import by.epam.bakun.necklace.factory.StoneFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoneFactoryTest {
      @Test()
      public void createStoneTest() {
          String[] param = {"DIAMOND", "22", "100", "100", "Attention", "60"};
          StoneFactory factory = new StoneFactory();

          Stone actual = factory.createStone(param);
          Stone expected = new NaturalStone(TypeOfStone.DIAMOND, 22, 100, 100, "Attention", 60);

          Assert.assertEquals(actual, expected);

      }



}
