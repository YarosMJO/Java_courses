package Dawn_of_the_dragons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dragon_Runner {
	private static final int MAX_Heroes = 10;
	private BufferedReader reader;
	private Village_Of_Dragons village_Of_Dragons;
	private boolean isExit;
	private Hero currentHero;
	private Being being;

	public static void main(String[] args) throws Exception {
		Dragon_Runner runner = new Dragon_Runner();
	}

	/*
	 * constructor
	 */
	public Dragon_Runner() throws IOException {
		init();
		addTestHeroes();
		work();
	}

	private void init() {
		this.village_Of_Dragons = new Village_Of_Dragons(MAX_Heroes);
		reader = new BufferedReader(new InputStreamReader(System.in));
		isExit = false;
	}

	private void addTestHeroes() {
		village_Of_Dragons.addHeroes(0, new Hero("Arnold", new Fire_Dragon(
				"Pushok")));
		village_Of_Dragons.addHeroes(1, new Hero("Taras", new Fire_Dragon(
				"Bars")));
		village_Of_Dragons.addHeroes(2, new Hero("Gilberd", new Fire_Dragon(
				"Rex")));
		village_Of_Dragons.addHeroes(3,
				new Hero("Kate", new Fire_Dragon("K-9")));
	}

	private void work() throws IOException {
		while (!isExit) {
			showMenu();
			processInput();
		}
		reader.close();

	}

	private void processInput() throws IOException {
		int select = 0;
		try {
			select = Integer.valueOf(this.reader.readLine());
		} catch (NumberFormatException ex) {
		}
		switch (select) {
		case 1:
			addNewHeroAction();
			break;
		case 2:
			removeHeroAction();
			break;

		case 3:
			editHeroAction();
			break;

		case 4:
			showAllHeroAction();
			break;

		case 5:
			isExit = true;
			break;
		default:
			System.out.println("\t incorect action");
			break;
		}
	}

	private void showMenu() {
		System.out.println("============================");
		System.out.println("Select action:");
		System.out.println("\t1. Add a new hero.");
		System.out.println("\t2. Remove a hero.");
		System.out.println("\t3. Edit a hero.");
		System.out.println("\t4. Show all hero.");
		System.out.println("\t5. Exit.");
		System.out.println("============================");

	}

	private void showAllHeroAction() {
		ArrayList<Hero> heroes = this.village_Of_Dragons.getHeroes();
		System.out.println("List of heroes:");
		for (Hero hero : heroes) {
			if (hero != null) {
				Being being = hero.getBeing();
				System.out.print("\t Hero:" + hero.getId());
				if (being != null) {
					System.out.println(", being:" + being.getName() + "("
							+ being.getClass().getSimpleName() + ")");
				} else {
					System.out.println(being.getClass().getSimpleName());
				}
			}
		}
	}

	private void editHeroAction() throws IOException {

		this.currentHero = null;
		System.out.println("Enter Hero id");
		String heroId = this.reader.readLine();
		searchHero(heroId);
		if (this.currentHero != null) {
			System.out.println("Enter new name of Client:");
			this.currentHero.setId(reader.readLine());
			Being being = requestNewBeing();
			this.currentHero.setBeing(being);
		}

	}

	private void searchHero(String heroId) {
		ArrayList<Hero> searchedHeroes = this.village_Of_Dragons
				.findHeroByBeingName(heroId);
		for (Hero hero : searchedHeroes) {
			if (hero.getId().equals(heroId)) {
				this.currentHero = hero;
			}
		}

	}

	private void removeHeroAction() throws IOException {
		System.out.println("Enter id hero revobe");
		String heroid = reader.readLine();
		this.village_Of_Dragons.removeHero(heroid);

	}

	private void addNewHeroAction() throws IOException {
		System.out.println("Input the hero ID:");
		String heroId = reader.readLine();
		Being being = requestNewBeing();
		int numHeroes = village_Of_Dragons.numberOfHeroes();
		if (numHeroes == MAX_Heroes) {
			numHeroes--;
		}
		this.village_Of_Dragons.addHeroes(numHeroes, new Hero(heroId, being));
		System.out.println("Hero was added.");

	}

	private Being requestNewBeing() throws IOException {
		System.out.println("Input the being's class:");
		String beingClass = reader.readLine();
		while (!beingClass.equals("Fire_Dragon")
				&& !beingClass.equals("Freezing_dragon")) {
			System.out
					.println("Wrong being's class, please input the correct class:");
			beingClass = reader.readLine();
		}
		System.out.println("Input being's name:");
		String beingName = reader.readLine();
		Being being = null;
		if (beingClass.equals("Fire_Dragon")) {
			being = new Fire_Dragon(beingName);
		} else if (beingClass.equals("Freezing_dragon")) {
			being = new Freezing_dragon(beingName);
		}
		return being;
	}
}
