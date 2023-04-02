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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.AddRecordingRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRecordingRuleResponseUnmarshaller {

	public static AddRecordingRuleResponse unmarshall(AddRecordingRuleResponse addRecordingRuleResponse, UnmarshallerContext _ctx) {
		
		addRecordingRuleResponse.setRequestId(_ctx.stringValue("AddRecordingRuleResponse.RequestId"));
		addRecordingRuleResponse.setData(_ctx.stringValue("AddRecordingRuleResponse.Data"));
		addRecordingRuleResponse.setCode(_ctx.integerValue("AddRecordingRuleResponse.Code"));
		addRecordingRuleResponse.setMessage(_ctx.stringValue("AddRecordingRuleResponse.Message"));
	 
	 	return addRecordingRuleResponse;
	}
}