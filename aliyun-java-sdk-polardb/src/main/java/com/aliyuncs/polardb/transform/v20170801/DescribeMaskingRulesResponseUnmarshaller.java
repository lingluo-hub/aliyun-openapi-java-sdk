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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeMaskingRulesResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeMaskingRulesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMaskingRulesResponseUnmarshaller {

	public static DescribeMaskingRulesResponse unmarshall(DescribeMaskingRulesResponse describeMaskingRulesResponse, UnmarshallerContext _ctx) {
		
		describeMaskingRulesResponse.setRequestId(_ctx.stringValue("DescribeMaskingRulesResponse.RequestId"));
		describeMaskingRulesResponse.setMessage(_ctx.stringValue("DescribeMaskingRulesResponse.Message"));
		describeMaskingRulesResponse.setSuccess(_ctx.booleanValue("DescribeMaskingRulesResponse.Success"));
		describeMaskingRulesResponse.setDBClusterId(_ctx.stringValue("DescribeMaskingRulesResponse.DBClusterId"));

		Data data = new Data();

		List<String> ruleList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMaskingRulesResponse.Data.RuleList.Length"); i++) {
			ruleList.add(_ctx.stringValue("DescribeMaskingRulesResponse.Data.RuleList["+ i +"]"));
		}
		data.setRuleList(ruleList);
		describeMaskingRulesResponse.setData(data);
	 
	 	return describeMaskingRulesResponse;
	}
}