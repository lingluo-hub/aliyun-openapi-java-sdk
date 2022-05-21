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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListConversationsRequest extends RpcAcsRequest<ListConversationsResponse> {
	   

	private Long beginTimeLeftRange;

	private String query;

	private Integer pageNumber;

	private Long result;

	private String callingNumber;

	private String instanceId;

	private Long beginTimeRightRange;

	private String isSandBox;

	private Integer pageSize;
	public ListConversationsRequest() {
		super("VoiceNavigator", "2018-06-12", "ListConversations", "voicebot");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBeginTimeLeftRange() {
		return this.beginTimeLeftRange;
	}

	public void setBeginTimeLeftRange(Long beginTimeLeftRange) {
		this.beginTimeLeftRange = beginTimeLeftRange;
		if(beginTimeLeftRange != null){
			putQueryParameter("BeginTimeLeftRange", beginTimeLeftRange.toString());
		}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putQueryParameter("Query", query);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getResult() {
		return this.result;
	}

	public void setResult(Long result) {
		this.result = result;
		if(result != null){
			putQueryParameter("Result", result.toString());
		}
	}

	public String getCallingNumber() {
		return this.callingNumber;
	}

	public void setCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
		if(callingNumber != null){
			putQueryParameter("CallingNumber", callingNumber);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getBeginTimeRightRange() {
		return this.beginTimeRightRange;
	}

	public void setBeginTimeRightRange(Long beginTimeRightRange) {
		this.beginTimeRightRange = beginTimeRightRange;
		if(beginTimeRightRange != null){
			putQueryParameter("BeginTimeRightRange", beginTimeRightRange.toString());
		}
	}

	public String getIsSandBox() {
		return this.isSandBox;
	}

	public void setIsSandBox(String isSandBox) {
		this.isSandBox = isSandBox;
		if(isSandBox != null){
			putQueryParameter("IsSandBox", isSandBox);
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

	@Override
	public Class<ListConversationsResponse> getResponseClass() {
		return ListConversationsResponse.class;
	}

}
