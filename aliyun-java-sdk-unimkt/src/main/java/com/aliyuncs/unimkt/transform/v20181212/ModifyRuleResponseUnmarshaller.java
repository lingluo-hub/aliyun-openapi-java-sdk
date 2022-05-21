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

import com.aliyuncs.unimkt.model.v20181212.ModifyRuleResponse;
import com.aliyuncs.unimkt.model.v20181212.ModifyRuleResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyRuleResponseUnmarshaller {

	public static ModifyRuleResponse unmarshall(ModifyRuleResponse modifyRuleResponse, UnmarshallerContext _ctx) {
		
		modifyRuleResponse.setRequestId(_ctx.stringValue("ModifyRuleResponse.RequestId"));
		modifyRuleResponse.setCode(_ctx.stringValue("ModifyRuleResponse.Code"));
		modifyRuleResponse.setMessage(_ctx.stringValue("ModifyRuleResponse.Message"));
		modifyRuleResponse.setSuccess(_ctx.booleanValue("ModifyRuleResponse.Success"));

		Model model = new Model();
		model.setStatus(_ctx.stringValue("ModifyRuleResponse.Model.Status"));
		model.setRuleType(_ctx.stringValue("ModifyRuleResponse.Model.RuleType"));
		model.setCreateTime(_ctx.longValue("ModifyRuleResponse.Model.CreateTime"));
		model.setRuleRId(_ctx.stringValue("ModifyRuleResponse.Model.RuleRId"));
		model.setRelatedAdSlots(_ctx.stringValue("ModifyRuleResponse.Model.RelatedAdSlots"));
		model.setExtInfo(_ctx.stringValue("ModifyRuleResponse.Model.ExtInfo"));
		model.setRuleName(_ctx.stringValue("ModifyRuleResponse.Model.RuleName"));
		model.setRuleId(_ctx.stringValue("ModifyRuleResponse.Model.RuleId"));
		model.setVersion(_ctx.longValue("ModifyRuleResponse.Model.Version"));
		model.setModifyTime(_ctx.longValue("ModifyRuleResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("ModifyRuleResponse.Model.TenantId"));
		model.setRuleConfig(_ctx.stringValue("ModifyRuleResponse.Model.RuleConfig"));
		modifyRuleResponse.setModel(model);
	 
	 	return modifyRuleResponse;
	}
}