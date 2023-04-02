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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListRulesRequest extends RpcAcsRequest<ListRulesResponse> {
	   

	private String ruleNamePrefix;

	private String eventBusName;

	private String nextToken;

	private Integer limit;
	public ListRulesRequest() {
		super("eventbridge", "2020-04-01", "ListRules");
		setMethod(MethodType.POST);
	}

	public String getRuleNamePrefix() {
		return this.ruleNamePrefix;
	}

	public void setRuleNamePrefix(String ruleNamePrefix) {
		this.ruleNamePrefix = ruleNamePrefix;
		if(ruleNamePrefix != null){
			putQueryParameter("RuleNamePrefix", ruleNamePrefix);
		}
	}

	public String getEventBusName() {
		return this.eventBusName;
	}

	public void setEventBusName(String eventBusName) {
		this.eventBusName = eventBusName;
		if(eventBusName != null){
			putQueryParameter("EventBusName", eventBusName);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	@Override
	public Class<ListRulesResponse> getResponseClass() {
		return ListRulesResponse.class;
	}

}
