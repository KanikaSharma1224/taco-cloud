package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
public class Ingredient {
	
	private final String Id;
	private final String name;
	private final Type type;

	public static enum Type{
    	WRAP,PROTEIN,CHEESE,VEGGIES,SAUCE
    }
}
