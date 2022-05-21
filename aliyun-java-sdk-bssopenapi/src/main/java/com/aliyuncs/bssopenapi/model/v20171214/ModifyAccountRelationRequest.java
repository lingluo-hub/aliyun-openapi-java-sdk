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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAccountRelationRequest extends RpcAcsRequest<ModifyAccountRelationResponse> {
	   

	private String childNick;

	private Long parentUserId;

	private Long relationId;

	private List<String> roleCodess;

	private String relationOperation;

	private String relationType;

	private Long childUserId;

	private String requestId;

	private List<String> permissionCodess;
	public ModifyAccountRelationRequest() {
		super("BssOpenApi", "2017-12-14", "ModifyAccountRelation");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getChildNick() {
		return this.childNick;
	}

	public void setChildNick(String childNick) {
		this.childNick = childNick;
		if(childNick != null){
			putQueryParameter("ChildNick", childNick);
		}
	}

	public Long getParentUserId() {
		return this.parentUserId;
	}

	public void setParentUserId(Long parentUserId) {
		this.parentUserId = parentUserId;
		if(parentUserId != null){
			putQueryParameter("ParentUserId", parentUserId.toString());
		}
	}

	public Long getRelationId() {
		return this.relationId;
	}

	public void setRelationId(Long relationId) {
		this.relationId = relationId;
		if(relationId != null){
			putQueryParameter("RelationId", relationId.toString());
		}
	}

	public List<String> getRoleCodess() {
		return this.roleCodess;
	}

	public void setRoleCodess(List<String> roleCodess) {
		this.roleCodess = roleCodess;	
		if (roleCodess != null) {
			for (int i = 0; i < roleCodess.size(); i++) {
				putQueryParameter("RoleCodes." + (i + 1) , roleCodess.get(i));
			}
		}	
	}

	public String getRelationOperation() {
		return this.relationOperation;
	}

	public void setRelationOperation(String relationOperation) {
		this.relationOperation = relationOperation;
		if(relationOperation != null){
			putQueryParameter("RelationOperation", relationOperation);
		}
	}

	public String getRelationType() {
		return this.relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
		if(relationType != null){
			putQueryParameter("RelationType", relationType);
		}
	}

	public Long getChildUserId() {
		return this.childUserId;
	}

	public void setChildUserId(Long childUserId) {
		this.childUserId = childUserId;
		if(childUserId != null){
			putQueryParameter("ChildUserId", childUserId.toString());
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public List<String> getPermissionCodess() {
		return this.permissionCodess;
	}

	public void setPermissionCodess(List<String> permissionCodess) {
		this.permissionCodess = permissionCodess;	
		if (permissionCodess != null) {
			for (int i = 0; i < permissionCodess.size(); i++) {
				putQueryParameter("PermissionCodes." + (i + 1) , permissionCodess.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyAccountRelationResponse> getResponseClass() {
		return ModifyAccountRelationResponse.class;
	}

}
