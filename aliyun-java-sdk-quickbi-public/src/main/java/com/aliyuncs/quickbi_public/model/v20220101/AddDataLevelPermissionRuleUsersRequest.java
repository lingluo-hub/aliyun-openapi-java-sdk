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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quickbi_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddDataLevelPermissionRuleUsersRequest extends RpcAcsRequest<AddDataLevelPermissionRuleUsersResponse> {
	   

	private String addUserModel;
	public AddDataLevelPermissionRuleUsersRequest() {
		super("quickbi-public", "2022-01-01", "AddDataLevelPermissionRuleUsers", "quickbi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAddUserModel() {
		return this.addUserModel;
	}

	public void setAddUserModel(String addUserModel) {
		this.addUserModel = addUserModel;
		if(addUserModel != null){
			putQueryParameter("AddUserModel", addUserModel);
		}
	}

	@Override
	public Class<AddDataLevelPermissionRuleUsersResponse> getResponseClass() {
		return AddDataLevelPermissionRuleUsersResponse.class;
	}

}
