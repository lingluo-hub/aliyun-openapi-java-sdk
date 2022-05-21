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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.QueryRuleResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryRuleResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRuleResponseUnmarshaller {

	public static QueryRuleResponse unmarshall(QueryRuleResponse queryRuleResponse, UnmarshallerContext _ctx) {
		
		queryRuleResponse.setRequestId(_ctx.stringValue("QueryRuleResponse.RequestId"));
		queryRuleResponse.setCode(_ctx.stringValue("QueryRuleResponse.Code"));
		queryRuleResponse.setMessage(_ctx.stringValue("QueryRuleResponse.Message"));
		queryRuleResponse.setSuccess(_ctx.booleanValue("QueryRuleResponse.Success"));

		Model model = new Model();
		model.setStatus(_ctx.stringValue("QueryRuleResponse.Model.Status"));
		model.setRuleType(_ctx.stringValue("QueryRuleResponse.Model.RuleType"));
		model.setCreateTime(_ctx.longValue("QueryRuleResponse.Model.CreateTime"));
		model.setRuleRId(_ctx.stringValue("QueryRuleResponse.Model.RuleRId"));
		model.setRelatedAdSlots(_ctx.stringValue("QueryRuleResponse.Model.RelatedAdSlots"));
		model.setExtInfo(_ctx.stringValue("QueryRuleResponse.Model.ExtInfo"));
		model.setRuleId(_ctx.stringValue("QueryRuleResponse.Model.RuleId"));
		model.setRuleName(_ctx.stringValue("QueryRuleResponse.Model.RuleName"));
		model.setVersion(_ctx.longValue("QueryRuleResponse.Model.Version"));
		model.setAccessStatus(_ctx.stringValue("QueryRuleResponse.Model.AccessStatus"));
		model.setModifyTime(_ctx.longValue("QueryRuleResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("QueryRuleResponse.Model.TenantId"));
		model.setRuleConfig(_ctx.stringValue("QueryRuleResponse.Model.RuleConfig"));
		queryRuleResponse.setModel(model);
	 
	 	return queryRuleResponse;
	}
}