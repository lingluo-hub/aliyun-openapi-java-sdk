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

package com.aliyuncs.dt_oc_info.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryCompanyConditionRequest extends RpcAcsRequest<QueryCompanyConditionResponse> {
	   

	private String conditionType;
	public QueryCompanyConditionRequest() {
		super("dt-oc-info", "2020-04-01", "QueryCompanyCondition");
		setMethod(MethodType.POST);
	}

	public String getConditionType() {
		return this.conditionType;
	}

	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
		if(conditionType != null){
			putQueryParameter("ConditionType", conditionType);
		}
	}

	@Override
	public Class<QueryCompanyConditionResponse> getResponseClass() {
		return QueryCompanyConditionResponse.class;
	}

}
