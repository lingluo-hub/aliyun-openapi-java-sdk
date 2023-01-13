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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveContactWhiteListRequest extends RpcAcsRequest<SaveContactWhiteListResponse> {
	   

	private List<String> contactWhiteListLists;

	private String contactWhiteListsJson;

	private String instanceId;
	public SaveContactWhiteListRequest() {
		super("OutboundBot", "2019-12-26", "SaveContactWhiteList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getContactWhiteListLists() {
		return this.contactWhiteListLists;
	}

	public void setContactWhiteListLists(List<String> contactWhiteListLists) {
		this.contactWhiteListLists = contactWhiteListLists;	
		if (contactWhiteListLists != null) {
			for (int i = 0; i < contactWhiteListLists.size(); i++) {
				putQueryParameter("ContactWhiteListList." + (i + 1) , contactWhiteListLists.get(i));
			}
		}	
	}

	public String getContactWhiteListsJson() {
		return this.contactWhiteListsJson;
	}

	public void setContactWhiteListsJson(String contactWhiteListsJson) {
		this.contactWhiteListsJson = contactWhiteListsJson;
		if(contactWhiteListsJson != null){
			putQueryParameter("ContactWhiteListsJson", contactWhiteListsJson);
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

	@Override
	public Class<SaveContactWhiteListResponse> getResponseClass() {
		return SaveContactWhiteListResponse.class;
	}

}
