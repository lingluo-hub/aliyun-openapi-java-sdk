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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyClearLogstoreStorageRequest extends RpcAcsRequest<ModifyClearLogstoreStorageResponse> {
	   

	private String from;

	private String lang;

	private String userLogStore;

	private String userProject;
	public ModifyClearLogstoreStorageRequest() {
		super("Sas", "2018-12-03", "ModifyClearLogstoreStorage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getUserLogStore() {
		return this.userLogStore;
	}

	public void setUserLogStore(String userLogStore) {
		this.userLogStore = userLogStore;
		if(userLogStore != null){
			putQueryParameter("UserLogStore", userLogStore);
		}
	}

	public String getUserProject() {
		return this.userProject;
	}

	public void setUserProject(String userProject) {
		this.userProject = userProject;
		if(userProject != null){
			putQueryParameter("UserProject", userProject);
		}
	}

	@Override
	public Class<ModifyClearLogstoreStorageResponse> getResponseClass() {
		return ModifyClearLogstoreStorageResponse.class;
	}

}
