package engine;

import java.util.ArrayList;

/**
 * Created by Ryan on 7/28/2015.
 */
public class Levels {
    /** Difficulty settings for level 1. */
    public static final GameSettings SETTINGS_LEVEL_1 = new GameSettings(5, 4, 60, 2000);

    /** Difficulty settings for level 2. */
    public static final GameSettings SETTINGS_LEVEL_2 = new GameSettings(5, 5, 50, 2500);

    /** Difficulty settings for level 3. */
    public static final GameSettings SETTINGS_LEVEL_3 = new GameSettings(6, 5, 40, 1500);

    /** Difficulty settings for level 4. */
    public static final GameSettings SETTINGS_LEVEL_4 = new GameSettings(6, 6, 30, 1500);

    /** Difficulty settings for level 5. */
    public static final GameSettings SETTINGS_LEVEL_5 = new GameSettings(7, 6, 20, 1000);

    /** Difficulty settings for level 6. */
    public static final GameSettings SETTINGS_LEVEL_6 = new GameSettings(7, 7, 10, 1000);

    /** Difficulty settings for level 7. */
    public static final GameSettings SETTINGS_LEVEL_7 = new GameSettings(8, 7, 2, 500);

    /**
     * Gets a list of levels
     * @return a list of levels
     */
    public static ArrayList<GameSettings> getLevels() {
        ArrayList<GameSettings> gameSettings = new ArrayList<GameSettings>();
        gameSettings.add(Levels.SETTINGS_LEVEL_1);
        gameSettings.add(Levels.SETTINGS_LEVEL_2);
        gameSettings.add(Levels.SETTINGS_LEVEL_3);
        gameSettings.add(Levels.SETTINGS_LEVEL_4);
        gameSettings.add(Levels.SETTINGS_LEVEL_5);
        gameSettings.add(Levels.SETTINGS_LEVEL_6);
        gameSettings.add(Levels.SETTINGS_LEVEL_7);

        return gameSettings;
    }
}
