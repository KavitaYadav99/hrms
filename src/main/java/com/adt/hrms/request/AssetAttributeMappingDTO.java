package com.adt.hrms.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssetAttributeMappingDTO {
	
	private String assetAttributeName;
	private String assetAttributeValue;

}
