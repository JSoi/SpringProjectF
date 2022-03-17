package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	@Setter(onMethod_= { @Autowired } ) // restaurant 객체가 chef 객체가 필요하다는 것을 엮음
	private Chef chef;
}
