package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * LOMBOK : setter, getter 자동 생성자
 * @Component :  해당 클래스가 스프링 관리 대상임을 표시
 * @Data : lombok 기능으로 setter, tostring 자동 생성
 * */

@Component
@Data
public class Chef {
	
}
