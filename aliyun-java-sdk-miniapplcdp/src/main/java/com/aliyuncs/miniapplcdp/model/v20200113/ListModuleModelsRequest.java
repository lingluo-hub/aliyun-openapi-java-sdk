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
public class ListModuleModelsRequest extends RpcAcsRequest<ListModuleModelsResponse> {
	   

	private Boolean withContent;

	private String moduleList;

	private String subTypes;
	public ListModuleModelsRequest() {
		super("miniapplcdp", "2020-01-13", "ListModuleModels");
		setMethod(MethodType.POST);
	}

	public Boolean getWithContent() {
		return this.withContent;
	}

	public void setWithContent(Boolean withContent) {
		this.withContent = withContent;
		if(withContent != null){
			putQueryParameter("WithContent", withContent.toString());
		}
	}

	public String getModuleList() {
		return this.moduleList;
	}

	public void setModuleList(String moduleList) {
		this.moduleList = moduleList;
		if(moduleList != null){
			putQueryParameter("ModuleList", moduleList);
		}
	}

	public String getSubTypes() {
		return this.subTypes;
	}

	public void setSubTypes(String subTypes) {
		this.subTypes = subTypes;
		if(subTypes != null){
			putQueryParameter("SubTypes", subTypes);
		}
	}

	@Override
	public Class<ListModuleModelsResponse> getResponseClass() {
		return ListModuleModelsResponse.class;
	}

}
