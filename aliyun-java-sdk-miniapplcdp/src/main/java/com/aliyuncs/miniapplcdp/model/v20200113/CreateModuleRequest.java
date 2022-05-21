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
public class CreateModuleRequest extends RpcAcsRequest<CreateModuleResponse> {
	   

	private String clientToken;

	private String icon;

	private String description;

	private String platform;

	private String targetAppSource;

	private String minimumPlatformVersion;

	private String moduleName;
	public CreateModuleRequest() {
		super("miniapplcdp", "2020-01-13", "CreateModule");
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

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
		if(icon != null){
			putQueryParameter("Icon", icon);
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

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public String getTargetAppSource() {
		return this.targetAppSource;
	}

	public void setTargetAppSource(String targetAppSource) {
		this.targetAppSource = targetAppSource;
		if(targetAppSource != null){
			putQueryParameter("TargetAppSource", targetAppSource);
		}
	}

	public String getMinimumPlatformVersion() {
		return this.minimumPlatformVersion;
	}

	public void setMinimumPlatformVersion(String minimumPlatformVersion) {
		this.minimumPlatformVersion = minimumPlatformVersion;
		if(minimumPlatformVersion != null){
			putQueryParameter("MinimumPlatformVersion", minimumPlatformVersion);
		}
	}

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
		if(moduleName != null){
			putQueryParameter("ModuleName", moduleName);
		}
	}

	@Override
	public Class<CreateModuleResponse> getResponseClass() {
		return CreateModuleResponse.class;
	}

}
