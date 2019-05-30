package net.skhu.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.ToString;
import net.skhu.document.map.Address;

@Data
@Document(collection = "sponsor")

//이름,성별,연락처,리워드,방문횟수,방문보고서,주소를 저장한 방문후원자정보
public class Sponsor {
	
	@Id
	private String id;
	
	@Field(value="spNo")
	private int spNo;

	@Field(value="name")
	private String name;
	
	@Field(value="gender")
	private boolean gender;
	
	@Field(value="point")
	private int point;

	@Field(value="phone")
	private String phone;

	@Field(value="visits")
	private String visits;

	@Field(value="report")
	private Report report;
	
	@Field(value="address")
	private Address address;

}
