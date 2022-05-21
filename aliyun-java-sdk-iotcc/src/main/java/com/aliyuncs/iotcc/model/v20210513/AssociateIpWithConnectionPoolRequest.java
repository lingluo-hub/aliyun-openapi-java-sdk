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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AssociateIpWithConnectionPoolRequest extends RpcAcsRequest<AssociateIpWithConnectionPoolResponse> {
	   

	private String clientToken;

	private String connectionPoolId;

	private Boolean dryRun;

	private String ipsFilePath;

	private List<String> ipss;

	private String ioTCloudConnectorId;
	public AssociateIpWithConnectionPoolRequest() {
		super("IoTCC", "2021-05-13", "AssociateIpWithConnectionPool", "IoTCC");
		setMethod(MethodType.POST);
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

	public String getConnectionPoolId() {
		return this.connectionPoolId;
	}

	public void setConnectionPoolId(String connectionPoolId) {
		this.connectionPoolId = connectionPoolId;
		if(connectionPoolId != null){
			putQueryParameter("ConnectionPoolId", connectionPoolId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getIpsFilePath() {
		return this.ipsFilePath;
	}

	public void setIpsFilePath(String ipsFilePath) {
		this.ipsFilePath = ipsFilePath;
		if(ipsFilePath != null){
			putQueryParameter("IpsFilePath", ipsFilePath);
		}
	}

	public List<String> getIpss() {
		return this.ipss;
	}

	public void setIpss(List<String> ipss) {
		this.ipss = ipss;	
		if (ipss != null) {
			for (int i = 0; i < ipss.size(); i++) {
				putQueryParameter("Ips." + (i + 1) , ipss.get(i));
			}
		}	
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
		}
	}

	@Override
	public Class<AssociateIpWithConnectionPoolResponse> getResponseClass() {
		return AssociateIpWithConnectionPoolResponse.class;
	}

}
