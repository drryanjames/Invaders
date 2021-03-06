package engine;

import java.awt.Insets;

import javax.swing.*;

import screen.Screen;

/**
 * Implements a frame to show screens on.
 * 
 * @author <a href="mailto:RobertoIA1987@gmail.com">Roberto Izquierdo Amo</a>
 * 
 */
@SuppressWarnings("serial")
public class Frame extends JFrame {

	/** Frame width. */
	private int width;
	/** Frame height. */
	private int height;
	/** Screen currently shown. */
	private Screen currentScreen;

	/**
	 * Initializes the new frame.
	 * 
	 * @param width
	 *            Frame width.
	 * @param height
	 *            Frame height.
	 */
	public Frame(final int width, final int height) {
		setSize(width, height);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		setLocationRelativeTo(null);
		setVisible(true);

		Insets insets = getInsets();
		this.width = width - insets.left - insets.right;
		this.height = height - insets.top + insets.bottom;
		setTitle("Invaders");

		addKeyListener(Main.getInputManager());
	}

	/**
	 * Sets current screen.
	 * 
	 * @param screen
	 *            Screen to show.
	 * @return Return code of the finished screen.
	 */
	public final ScreenType setScreen(final Screen screen) {
		Main.getLogger().info("Starting " + screen.getScreenType() + " " + Main.WIDTH + "x" + Main.HEIGHT +
				 " at " + Main.FPS + " fps.");

		currentScreen = screen;
		currentScreen.initialize();
		ScreenType nextScreen = currentScreen.run();

		Main.getLogger().info("Closing " + screen.getScreenType() + ".");
		Main.getLogger().info("Next screen:  " + nextScreen + ".");

		return nextScreen;
	}

	/**
	 * Getter for frame width.
	 * 
	 * @return Frame width.
	 */
	public final int getWidth() {
		return this.width;
	}

	/**
	 * Getter for frame height.
	 * 
	 * @return Frame height.
	 */

	public final int getHeight() {
		return this.height;
	}
}
