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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetachGadInstanceMemberRequest extends RpcAcsRequest<DetachGadInstanceMemberResponse> {
	   

	private String memberInstanceName;

	private String gadInstanceName;
	public DetachGadInstanceMemberRequest() {
		super("Rds", "2014-08-15", "DetachGadInstanceMember", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMemberInstanceName() {
		return this.memberInstanceName;
	}

	public void setMemberInstanceName(String memberInstanceName) {
		this.memberInstanceName = memberInstanceName;
		if(memberInstanceName != null){
			putQueryParameter("MemberInstanceName", memberInstanceName);
		}
	}

	public String getGadInstanceName() {
		return this.gadInstanceName;
	}

	public void setGadInstanceName(String gadInstanceName) {
		this.gadInstanceName = gadInstanceName;
		if(gadInstanceName != null){
			putQueryParameter("GadInstanceName", gadInstanceName);
		}
	}

	@Override
	public Class<DetachGadInstanceMemberResponse> getResponseClass() {
		return DetachGadInstanceMemberResponse.class;
	}

}
