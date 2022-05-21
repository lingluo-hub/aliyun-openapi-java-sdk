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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSqlAuditInfoRequest extends RpcAcsRequest<DescribeSqlAuditInfoResponse> {
	   

	private String dBInstanceId;

	private String auditAccountPassword;

	private String auditAccountName;
	public DescribeSqlAuditInfoRequest() {
		super("polardbx", "2020-02-02", "DescribeSqlAuditInfo", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getAuditAccountPassword() {
		return this.auditAccountPassword;
	}

	public void setAuditAccountPassword(String auditAccountPassword) {
		this.auditAccountPassword = auditAccountPassword;
		if(auditAccountPassword != null){
			putQueryParameter("AuditAccountPassword", auditAccountPassword);
		}
	}

	public String getAuditAccountName() {
		return this.auditAccountName;
	}

	public void setAuditAccountName(String auditAccountName) {
		this.auditAccountName = auditAccountName;
		if(auditAccountName != null){
			putQueryParameter("AuditAccountName", auditAccountName);
		}
	}

	@Override
	public Class<DescribeSqlAuditInfoResponse> getResponseClass() {
		return DescribeSqlAuditInfoResponse.class;
	}

}
