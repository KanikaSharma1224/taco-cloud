package tacos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
	
	private Long Id;
	private Date createdAt;
	
	@NotNull
	@Size(min=5, message="Name must be 5 Characters long")
	private String name;
	
	@Size(min=1, message="You must choose at lease 1 ingredient")
	private List<String> ingredients;

}
