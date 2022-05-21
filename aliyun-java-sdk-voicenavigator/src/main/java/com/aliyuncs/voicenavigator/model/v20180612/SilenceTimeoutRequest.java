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
public class SilenceTimeoutRequest extends RpcAcsRequest<SilenceTimeoutResponse> {
	   

	private String conversationId;

	private String initialContext;

	private String instanceId;

	private Long instanceOwnerId;
	public SilenceTimeoutRequest() {
		super("VoiceNavigator", "2018-06-12", "SilenceTimeout", "voicebot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
		if(conversationId != null){
			putQueryParameter("ConversationId", conversationId);
		}
	}

	public String getInitialContext() {
		return this.initialContext;
	}

	public void setInitialContext(String initialContext) {
		this.initialContext = initialContext;
		if(initialContext != null){
			putQueryParameter("InitialContext", initialContext);
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

	public Long getInstanceOwnerId() {
		return this.instanceOwnerId;
	}

	public void setInstanceOwnerId(Long instanceOwnerId) {
		this.instanceOwnerId = instanceOwnerId;
		if(instanceOwnerId != null){
			putQueryParameter("InstanceOwnerId", instanceOwnerId.toString());
		}
	}

	@Override
	public Class<SilenceTimeoutResponse> getResponseClass() {
		return SilenceTimeoutResponse.class;
	}

}
