package negocio;

import java.util.Comparator;

import entidade.ContaCorrente;

public class ComparadorContaCorrenteSaldo implements Comparator<ContaCorrente> {

	public ComparadorContaCorrenteSaldo() {
	}

	@Override
	public int compare(ContaCorrente c1, ContaCorrente c2) {

		return Double.compare(c1.getSaldo(), c2.getSaldo());
	}
}
