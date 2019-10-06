package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final int MAX_LONG = 10;
	private SecretCombination secretCombination;
	private List<ProposedCombination> proposedCombinations;
	private List<Result> results;

    public Game() {
		this.clear();
	}

	public void clear() {
        this.secretCombination = new SecretCombination();
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.results = new ArrayList<Result>();
    }

    public void play() {
        ProposedCombination proposedCombination = new ProposedCombination();
        proposedCombination.read();
        this.proposedCombinations.add(proposedCombination);
        this.results.add(this.secretCombination.getResult(proposedCombination));
	}

    public boolean isFinished() {
		if (isWinner()) {
			return true;
		}
		if (this.getAttemps() == Game.MAX_LONG) {
			return true;
		}
		return false;
    }

    public boolean isWinner() {
        return this.results.get(this.getAttemps() - 1).isWinner();
    }


    public int getAttemps() {
		return this.proposedCombinations.size();
    }

    public int getSecretSize(){
        return this.secretCombination.getWidth();
    }

	public List<Color> getConbinationColors(int index) {
		return this.proposedCombinations.get(index).colors;
	}

	public Result getResult(int index) {
		return this.results.get(index);
	}

}
