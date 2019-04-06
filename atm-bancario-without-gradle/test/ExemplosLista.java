import java.util.ArrayList;
import java.util.List;

public class ExemplosLista {

	public void exemplosList() {
		int[] valoresDoArray = { 10, 12, 13, 15 };
		
		for (int count = 0; count < valoresDoArray.length; count++) {
			// iterando o vetor
		}

		List<Integer> valoresDoArrayEmList = new ArrayList<Integer>();
		valoresDoArrayEmList.add(10);
		valoresDoArrayEmList.add(12);
		valoresDoArrayEmList.add(13);
		valoresDoArrayEmList.add(15);

		for (Integer valor : valoresDoArrayEmList) {
			// iterando a lista
		}
	}

}
