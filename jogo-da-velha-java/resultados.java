package atividade;

public class resultados {
	private Resultado[] Rank;
	
	public resultados() {
		this.Rank=new Resultado [10];
	}

	public Resultado[] getRank() {
		return Rank;
	}

	public void setRank(Resultado[] rank) {
		Rank = rank;
	}
	public void setRank(Resultado rank) {
		for (int f=0;f<10;f++) {
			if (this.Rank[f]==null) {
				this.Rank[f]=rank;
			}
		}
	}
	public String getRankN(int f) {
		return Rank[f].getNome();
	}
	public int getRankD(int f) {
		return Rank[f].getDificuldade();
	}
	public int getRankQ(int f) {
		return Rank[f].getQuantasJogada();
	}
	public int getRankV(int f) {
		return Rank[f].getQuemvenceu();
	}

}
