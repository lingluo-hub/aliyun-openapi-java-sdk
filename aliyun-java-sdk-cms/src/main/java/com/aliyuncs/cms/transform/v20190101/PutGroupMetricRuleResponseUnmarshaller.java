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

package com.aliyuncs.cms.transform.v20190101;

import com.aliyuncs.cms.model.v20190101.PutGroupMetricRuleResponse;
import com.aliyuncs.cms.model.v20190101.PutGroupMetricRuleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutGroupMetricRuleResponseUnmarshaller {

	public static PutGroupMetricRuleResponse unmarshall(PutGroupMetricRuleResponse putGroupMetricRuleResponse, UnmarshallerContext _ctx) {
		
		putGroupMetricRuleResponse.setRequestId(_ctx.stringValue("PutGroupMetricRuleResponse.RequestId"));
		putGroupMetricRuleResponse.setCode(_ctx.stringValue("PutGroupMetricRuleResponse.Code"));
		putGroupMetricRuleResponse.setMessage(_ctx.stringValue("PutGroupMetricRuleResponse.Message"));
		putGroupMetricRuleResponse.setSuccess(_ctx.booleanValue("PutGroupMetricRuleResponse.Success"));

		Result result = new Result();
		result.setRuleId(_ctx.stringValue("PutGroupMetricRuleResponse.Result.RuleId"));
		putGroupMetricRuleResponse.setResult(result);
	 
	 	return putGroupMetricRuleResponse;
	}
}