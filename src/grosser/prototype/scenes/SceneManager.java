
package grosser.prototype.scenes;

import java.util.ArrayList;

import grosser.prototype.render.GamePanel;


/**
 * Shouldn't have to mess around with this class either, it manages which scene
 * is running (menu, game, or whatever we decide to add later)
 * 
 * @author Robert
 *
 */
public class SceneManager {

	private ArrayList<Scene> scenes;
	private Scene currentScene;

	private SceneMainMenu scene_main_menu;
	SceneGame scene_game;

	public SceneManager(GamePanel gamePanel) {
		scenes = new ArrayList<>();
		scenes.add(scene_main_menu = new SceneMainMenu(this, gamePanel));
		scenes.add(scene_game = new SceneGame(this, gamePanel));

		currentScene = scene_main_menu;
	}

	void setScene(Scene scene) {
		currentScene = scene;
	}

	public Scene getCurrentScene() {
		return currentScene;
	}
}