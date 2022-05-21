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

package com.aliyuncs.workbench_ide.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListMoveSolutionRequest extends RpcAcsRequest<ListMoveSolutionResponse> {
	   

	private String currentOrgId;

	private String progLang;
	public ListMoveSolutionRequest() {
		super("Workbench-ide", "2021-01-21", "ListMoveSolution");
		setMethod(MethodType.POST);
	}

	public String getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(String currentOrgId) {
		this.currentOrgId = currentOrgId;
		if(currentOrgId != null){
			putQueryParameter("CurrentOrgId", currentOrgId);
		}
	}

	public String getProgLang() {
		return this.progLang;
	}

	public void setProgLang(String progLang) {
		this.progLang = progLang;
		if(progLang != null){
			putQueryParameter("ProgLang", progLang);
		}
	}

	@Override
	public Class<ListMoveSolutionResponse> getResponseClass() {
		return ListMoveSolutionResponse.class;
	}

}
