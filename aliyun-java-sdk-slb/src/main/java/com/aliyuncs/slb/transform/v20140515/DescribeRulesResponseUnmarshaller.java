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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeRulesResponse;
import com.aliyuncs.slb.model.v20140515.DescribeRulesResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRulesResponseUnmarshaller {

	public static DescribeRulesResponse unmarshall(DescribeRulesResponse describeRulesResponse, UnmarshallerContext _ctx) {
		
		describeRulesResponse.setRequestId(_ctx.stringValue("DescribeRulesResponse.RequestId"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRulesResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setHealthCheckHttpCode(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckHttpCode"));
			rule.setVServerGroupId(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].VServerGroupId"));
			rule.setDomain(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].Domain"));
			rule.setCookie(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].Cookie"));
			rule.setHealthCheckInterval(_ctx.integerValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckInterval"));
			rule.setUrl(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].Url"));
			rule.setHealthCheckURI(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckURI"));
			rule.setStickySessionType(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].StickySessionType"));
			rule.setRuleName(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].RuleName"));
			rule.setRuleId(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].RuleId"));
			rule.setServiceManagedMode(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].ServiceManagedMode"));
			rule.setHealthCheckConnectPort(_ctx.integerValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckConnectPort"));
			rule.setScheduler(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].Scheduler"));
			rule.setHealthCheckTimeout(_ctx.integerValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckTimeout"));
			rule.setListenerSync(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].ListenerSync"));
			rule.setHealthyThreshold(_ctx.integerValue("DescribeRulesResponse.Rules["+ i +"].HealthyThreshold"));
			rule.setCookieTimeout(_ctx.integerValue("DescribeRulesResponse.Rules["+ i +"].CookieTimeout"));
			rule.setHealthCheckDomain(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckDomain"));
			rule.setUnhealthyThreshold(_ctx.integerValue("DescribeRulesResponse.Rules["+ i +"].UnhealthyThreshold"));
			rule.setStickySession(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].StickySession"));
			rule.setHealthCheck(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].HealthCheck"));

			rules.add(rule);
		}
		describeRulesResponse.setRules(rules);
	 
	 	return describeRulesResponse;
	}
}