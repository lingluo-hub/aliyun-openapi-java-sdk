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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCasLoadbalanceSecurityipRequest extends RpcAcsRequest<CreateCasLoadbalanceSecurityipResponse> {
	   

	private String id;

	private Long listenerPort;

	private List<String> ipsRepeatLists;
	public CreateCasLoadbalanceSecurityipRequest() {
		super("SOFA", "2019-08-15", "CreateCasLoadbalanceSecurityip", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public Long getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Long listenerPort) {
		this.listenerPort = listenerPort;
		if(listenerPort != null){
			putBodyParameter("ListenerPort", listenerPort.toString());
		}
	}

	public List<String> getIpsRepeatLists() {
		return this.ipsRepeatLists;
	}

	public void setIpsRepeatLists(List<String> ipsRepeatLists) {
		this.ipsRepeatLists = ipsRepeatLists;	
		if (ipsRepeatLists != null) {
			for (int i = 0; i < ipsRepeatLists.size(); i++) {
				putBodyParameter("IpsRepeatList." + (i + 1) , ipsRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<CreateCasLoadbalanceSecurityipResponse> getResponseClass() {
		return CreateCasLoadbalanceSecurityipResponse.class;
	}

}
