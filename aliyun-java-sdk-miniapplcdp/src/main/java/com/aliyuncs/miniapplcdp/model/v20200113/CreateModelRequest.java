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

package com.aliyuncs.miniapplcdp.model.v20200113;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateModelRequest extends RpcAcsRequest<CreateModelResponse> {
	   

	private String linkModuleId;

	private String encodeType;

	private String visibility;

	private String clientToken;

	private String modelId;

	private String modelName;

	private String linkModelId;

	private String description;

	private String schemaVersion;

	private String content;

	private String subType;

	private String modelType;

	private String appId;

	private String moduleId;

	private Boolean linked;
	public CreateModelRequest() {
		super("miniapplcdp", "2020-01-13", "CreateModel");
		setMethod(MethodType.POST);
	}

	public String getLinkModuleId() {
		return this.linkModuleId;
	}

	public void setLinkModuleId(String linkModuleId) {
		this.linkModuleId = linkModuleId;
		if(linkModuleId != null){
			putQueryParameter("LinkModuleId", linkModuleId);
		}
	}

	public String getEncodeType() {
		return this.encodeType;
	}

	public void setEncodeType(String encodeType) {
		this.encodeType = encodeType;
		if(encodeType != null){
			putQueryParameter("EncodeType", encodeType);
		}
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
		if(visibility != null){
			putQueryParameter("Visibility", visibility);
		}
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

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("ModelId", modelId);
		}
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		if(modelName != null){
			putQueryParameter("ModelName", modelName);
		}
	}

	public String getLinkModelId() {
		return this.linkModelId;
	}

	public void setLinkModelId(String linkModelId) {
		this.linkModelId = linkModelId;
		if(linkModelId != null){
			putQueryParameter("LinkModelId", linkModelId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSchemaVersion() {
		return this.schemaVersion;
	}

	public void setSchemaVersion(String schemaVersion) {
		this.schemaVersion = schemaVersion;
		if(schemaVersion != null){
			putQueryParameter("SchemaVersion", schemaVersion);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public String getSubType() {
		return this.subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
		if(subType != null){
			putQueryParameter("SubType", subType);
		}
	}

	public String getModelType() {
		return this.modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
		if(modelType != null){
			putQueryParameter("ModelType", modelType);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
		if(moduleId != null){
			putQueryParameter("ModuleId", moduleId);
		}
	}

	public Boolean getLinked() {
		return this.linked;
	}

	public void setLinked(Boolean linked) {
		this.linked = linked;
		if(linked != null){
			putQueryParameter("Linked", linked.toString());
		}
	}

	@Override
	public Class<CreateModelResponse> getResponseClass() {
		return CreateModelResponse.class;
	}

}
