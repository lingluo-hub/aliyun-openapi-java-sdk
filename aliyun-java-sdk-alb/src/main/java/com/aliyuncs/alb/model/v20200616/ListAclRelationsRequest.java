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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAclRelationsRequest extends RpcAcsRequest<ListAclRelationsResponse> {
	   

	private List<String> aclIds;
	public ListAclRelationsRequest() {
		super("Alb", "2020-06-16", "ListAclRelations", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getAclIds() {
		return this.aclIds;
	}

	public void setAclIds(List<String> aclIds) {
		this.aclIds = aclIds;	
		if (aclIds != null) {
			for (int depth1 = 0; depth1 < aclIds.size(); depth1++) {
				putQueryParameter("AclIds." + (depth1 + 1) , aclIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<ListAclRelationsResponse> getResponseClass() {
		return ListAclRelationsResponse.class;
	}

}
