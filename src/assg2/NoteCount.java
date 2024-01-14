package assg2;

public class NoteCount {

	public void counting(int[] currency, int amount) {
		int notes[]=new int[currency.length];
		
		int sum=0;
		for (int i = 0; i < notes.length; i++) {
			notes[i]=amount/currency[i];
			amount=amount%currency[i];
			sum+=notes[i];
		}
		
		for (int i = 0; i < notes.length; i++) {
			if(notes[i]!=0)
			System.out.println(notes[i]+" X "+currency[i]);
		}
		System.out.println("Total number of notes "+sum);
		
	}

}
