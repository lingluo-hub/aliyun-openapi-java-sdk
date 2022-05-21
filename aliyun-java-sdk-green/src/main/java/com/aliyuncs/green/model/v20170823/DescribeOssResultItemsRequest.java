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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssResultItemsRequest extends RpcAcsRequest<DescribeOssResultItemsResponse> {
	   

	private Float minScore;

	private Float maxScore;

	private Long stockTaskId;

	private String startDate;

	private String scene;

	private String sourceIp;

	private Integer pageSize;

	private String lang;

	private Boolean stock;

	private Integer totalCount;

	private String suggestion;

	private Integer currentPage;

	private String resourceType;

	private String queryId;

	private String bucket;

	private String endDate;

	private String object;
	public DescribeOssResultItemsRequest() {
		super("Green", "2017-08-23", "DescribeOssResultItems", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getMinScore() {
		return this.minScore;
	}

	public void setMinScore(Float minScore) {
		this.minScore = minScore;
		if(minScore != null){
			putQueryParameter("MinScore", minScore.toString());
		}
	}

	public Float getMaxScore() {
		return this.maxScore;
	}

	public void setMaxScore(Float maxScore) {
		this.maxScore = maxScore;
		if(maxScore != null){
			putQueryParameter("MaxScore", maxScore.toString());
		}
	}

	public Long getStockTaskId() {
		return this.stockTaskId;
	}

	public void setStockTaskId(Long stockTaskId) {
		this.stockTaskId = stockTaskId;
		if(stockTaskId != null){
			putQueryParameter("StockTaskId", stockTaskId.toString());
		}
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Boolean getStock() {
		return this.stock;
	}

	public void setStock(Boolean stock) {
		this.stock = stock;
		if(stock != null){
			putQueryParameter("Stock", stock.toString());
		}
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
		if(totalCount != null){
			putQueryParameter("TotalCount", totalCount.toString());
		}
	}

	public String getSuggestion() {
		return this.suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
		if(suggestion != null){
			putQueryParameter("Suggestion", suggestion);
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getQueryId() {
		return this.queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
		if(queryId != null){
			putQueryParameter("QueryId", queryId);
		}
	}

	public String getBucket() {
		return this.bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
		if(bucket != null){
			putQueryParameter("Bucket", bucket);
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public String getObject() {
		return this.object;
	}

	public void setObject(String object) {
		this.object = object;
		if(object != null){
			putQueryParameter("Object", object);
		}
	}

	@Override
	public Class<DescribeOssResultItemsResponse> getResponseClass() {
		return DescribeOssResultItemsResponse.class;
	}

}
