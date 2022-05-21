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

package com.aliyuncs.devops_rdc.model.v20200303;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteCommonGroupRequest extends RpcAcsRequest<DeleteCommonGroupResponse> {
	   

	private String projectId;

	private String commonGroupId;

	private String orgId;
	public DeleteCommonGroupRequest() {
		super("devops-rdc", "2020-03-03", "DeleteCommonGroup");
		setMethod(MethodType.POST);
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getCommonGroupId() {
		return this.commonGroupId;
	}

	public void setCommonGroupId(String commonGroupId) {
		this.commonGroupId = commonGroupId;
		if(commonGroupId != null){
			putBodyParameter("CommonGroupId", commonGroupId);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	@Override
	public Class<DeleteCommonGroupResponse> getResponseClass() {
		return DeleteCommonGroupResponse.class;
	}

}
