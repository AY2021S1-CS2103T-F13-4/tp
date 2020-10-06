package seedu.simplykitchen.testutil;

import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.simplykitchen.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.simplykitchen.model.FoodInventory;
import seedu.simplykitchen.model.food.Food;

/**
 * A utility class containing a list of {@code Food} objects to be used in tests.
 */
public class TypicalFood {

    public static final Food ALICE = new FoodBuilder().withName("Alice Pauline")
            .withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends").build();
    public static final Food BENSON = new FoodBuilder().withName("Benson Meier")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withTags("owesMoney", "friends").build();
    public static final Food CARL = new FoodBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").build();
    public static final Food DANIEL = new FoodBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withTags("friends").build();
    public static final Food ELLE = new FoodBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").build();
    public static final Food FIONA = new FoodBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").build();
    public static final Food GEORGE = new FoodBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").build();

    // Manually added
    public static final Food HOON = new FoodBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").build();
    public static final Food IDA = new FoodBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").build();

    // Manually added - Food's details found in {@code CommandTestUtil}
    public static final Food AMY = new FoodBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Food BOB = new FoodBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalFood() {} // prevents instantiation

    /**
     * Returns a {@code FoodInventory} with all the typical foods.
     */
    public static FoodInventory getTypicalFoodInventory() {
        FoodInventory ab = new FoodInventory();
        for (Food food : getTypicalFood()) {
            ab.addFood(food);
        }
        return ab;
    }

    public static List<Food> getTypicalFood() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
