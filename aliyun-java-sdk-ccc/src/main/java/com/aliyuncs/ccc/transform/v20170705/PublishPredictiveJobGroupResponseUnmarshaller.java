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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.PublishPredictiveJobGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishPredictiveJobGroupResponseUnmarshaller {

	public static PublishPredictiveJobGroupResponse unmarshall(PublishPredictiveJobGroupResponse publishPredictiveJobGroupResponse, UnmarshallerContext _ctx) {
		
		publishPredictiveJobGroupResponse.setRequestId(_ctx.stringValue("PublishPredictiveJobGroupResponse.RequestId"));
		publishPredictiveJobGroupResponse.setSuccess(_ctx.booleanValue("PublishPredictiveJobGroupResponse.Success"));
		publishPredictiveJobGroupResponse.setCode(_ctx.stringValue("PublishPredictiveJobGroupResponse.Code"));
		publishPredictiveJobGroupResponse.setMessage(_ctx.stringValue("PublishPredictiveJobGroupResponse.Message"));
		publishPredictiveJobGroupResponse.setHttpStatusCode(_ctx.integerValue("PublishPredictiveJobGroupResponse.HttpStatusCode"));
	 
	 	return publishPredictiveJobGroupResponse;
	}
}