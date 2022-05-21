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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckPermissionRequest extends RpcAcsRequest<CheckPermissionResponse> {
	   

	private String accessId;

	private String connStr;

	private String instance;

	private String dsType;

	private String dbSchema;

	private String exportField;

	private String userId;

	private String workspaceId;
	public CheckPermissionRequest() {
		super("retailadvqa-public", "2020-05-15", "CheckPermission");
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getConnStr() {
		return this.connStr;
	}

	public void setConnStr(String connStr) {
		this.connStr = connStr;
		if(connStr != null){
			putQueryParameter("ConnStr", connStr);
		}
	}

	public String getInstance() {
		return this.instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
		if(instance != null){
			putQueryParameter("Instance", instance);
		}
	}

	public String getDsType() {
		return this.dsType;
	}

	public void setDsType(String dsType) {
		this.dsType = dsType;
		if(dsType != null){
			putQueryParameter("DsType", dsType);
		}
	}

	public String getDbSchema() {
		return this.dbSchema;
	}

	public void setDbSchema(String dbSchema) {
		this.dbSchema = dbSchema;
		if(dbSchema != null){
			putQueryParameter("DbSchema", dbSchema);
		}
	}

	public String getExportField() {
		return this.exportField;
	}

	public void setExportField(String exportField) {
		this.exportField = exportField;
		if(exportField != null){
			putQueryParameter("ExportField", exportField);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<CheckPermissionResponse> getResponseClass() {
		return CheckPermissionResponse.class;
	}

}
