package org.joongang.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class School {
	@Setter(onMethod_ = @Autowired)
	private Student student;

}
