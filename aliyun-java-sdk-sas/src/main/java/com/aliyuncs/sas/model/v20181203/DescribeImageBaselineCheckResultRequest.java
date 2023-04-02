/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageBaselineCheckResultRequest extends RpcAcsRequest<DescribeImageBaselineCheckResultResponse> {
	   

	private String criteria;

	private List<String> scanRanges;

	private Integer pageSize;

	private String criteriaType;

	private String lang;

	private String imageUuid;

	private Integer currentPage;

	private String riskLevel;
	public DescribeImageBaselineCheckResultRequest() {
		super("Sas", "2018-12-03", "DescribeImageBaselineCheckResult");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCriteria() {
		return this.criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
		if(criteria != null){
			putQueryParameter("Criteria", criteria);
		}
	}

	public List<String> getScanRanges() {
		return this.scanRanges;
	}

	public void setScanRanges(List<String> scanRanges) {
		this.scanRanges = scanRanges;	
		if (scanRanges != null) {
			for (int i = 0; i < scanRanges.size(); i++) {
				putQueryParameter("ScanRange." + (i + 1) , scanRanges.get(i));
			}
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getCriteriaType() {
		return this.criteriaType;
	}

	public void setCriteriaType(String criteriaType) {
		this.criteriaType = criteriaType;
		if(criteriaType != null){
			putQueryParameter("CriteriaType", criteriaType);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getImageUuid() {
		return this.imageUuid;
	}

	public void setImageUuid(String imageUuid) {
		this.imageUuid = imageUuid;
		if(imageUuid != null){
			putQueryParameter("ImageUuid", imageUuid);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
		if(riskLevel != null){
			putQueryParameter("RiskLevel", riskLevel);
		}
	}

	@Override
	public Class<DescribeImageBaselineCheckResultResponse> getResponseClass() {
		return DescribeImageBaselineCheckResultResponse.class;
	}

}
