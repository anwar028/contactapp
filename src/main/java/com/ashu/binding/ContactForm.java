package com.ashu.binding;

import java.time.LocalDate;
import lombok.Data;


@Data
public class ContactForm {

	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactPhone;
	private String activeSw;
	private LocalDate createDate;
	private LocalDate updateDate;
	
}
