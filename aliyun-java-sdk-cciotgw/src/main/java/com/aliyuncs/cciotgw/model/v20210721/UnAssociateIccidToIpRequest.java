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

package com.aliyuncs.cciotgw.model.v20210721;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UnAssociateIccidToIpRequest extends RpcAcsRequest<UnAssociateIccidToIpResponse> {
	   

	private String clientToken;

	private String isp;

	private String cciotGwId;

	private List<IccidIpList> iccidIpLists;

	private String apn;
	public UnAssociateIccidToIpRequest() {
		super("CCIoTGW", "2021-07-21", "UnAssociateIccidToIp");
		setMethod(MethodType.GET);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
		if(isp != null){
			putQueryParameter("Isp", isp);
		}
	}

	public String getCciotGwId() {
		return this.cciotGwId;
	}

	public void setCciotGwId(String cciotGwId) {
		this.cciotGwId = cciotGwId;
		if(cciotGwId != null){
			putQueryParameter("CciotGwId", cciotGwId);
		}
	}

	public List<IccidIpList> getIccidIpLists() {
		return this.iccidIpLists;
	}

	public void setIccidIpLists(List<IccidIpList> iccidIpLists) {
		this.iccidIpLists = iccidIpLists;	
		if (iccidIpLists != null) {
			for (int depth1 = 0; depth1 < iccidIpLists.size(); depth1++) {
				putQueryParameter("IccidIpList." + (depth1 + 1) + ".Ip" , iccidIpLists.get(depth1).getIp());
				putQueryParameter("IccidIpList." + (depth1 + 1) + ".Iccid" , iccidIpLists.get(depth1).getIccid());
			}
		}	
	}

	public String getApn() {
		return this.apn;
	}

	public void setApn(String apn) {
		this.apn = apn;
		if(apn != null){
			putQueryParameter("Apn", apn);
		}
	}

	public static class IccidIpList {

		private String ip;

		private String iccid;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getIccid() {
			return this.iccid;
		}

		public void setIccid(String iccid) {
			this.iccid = iccid;
		}
	}

	@Override
	public Class<UnAssociateIccidToIpResponse> getResponseClass() {
		return UnAssociateIccidToIpResponse.class;
	}

}
