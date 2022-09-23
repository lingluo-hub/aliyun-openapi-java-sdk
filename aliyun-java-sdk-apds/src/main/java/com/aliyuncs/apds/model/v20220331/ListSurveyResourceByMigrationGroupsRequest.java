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

package com.aliyuncs.apds.model.v20220331;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListSurveyResourceByMigrationGroupsRequest extends RoaAcsRequest<ListSurveyResourceByMigrationGroupsResponse> {
	   

	private String body;
	public ListSurveyResourceByMigrationGroupsRequest() {
		super("apds", "2022-03-31", "ListSurveyResourceByMigrationGroups");
		setUriPattern("/okss-services/migration-group/get-survey-resource");
		setMethod(MethodType.POST);
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putQueryParameter("body", body);
		}
	}

	@Override
	public Class<ListSurveyResourceByMigrationGroupsResponse> getResponseClass() {
		return ListSurveyResourceByMigrationGroupsResponse.class;
	}

}
