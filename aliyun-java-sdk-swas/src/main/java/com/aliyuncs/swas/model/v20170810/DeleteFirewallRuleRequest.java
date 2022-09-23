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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteFirewallRuleRequest extends RpcAcsRequest<DeleteFirewallRuleResponse> {
	   

	private String site;

	private String serverUid;

	private String firewallRuleUid;
	public DeleteFirewallRuleRequest() {
		super("SWAS", "2017-08-10", "DeleteFirewallRule", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	public String getServerUid() {
		return this.serverUid;
	}

	public void setServerUid(String serverUid) {
		this.serverUid = serverUid;
		if(serverUid != null){
			putQueryParameter("ServerUid", serverUid);
		}
	}

	public String getFirewallRuleUid() {
		return this.firewallRuleUid;
	}

	public void setFirewallRuleUid(String firewallRuleUid) {
		this.firewallRuleUid = firewallRuleUid;
		if(firewallRuleUid != null){
			putQueryParameter("FirewallRuleUid", firewallRuleUid);
		}
	}

	@Override
	public Class<DeleteFirewallRuleResponse> getResponseClass() {
		return DeleteFirewallRuleResponse.class;
	}

}
