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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.UpdateTopicConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTopicConfigResponseUnmarshaller {

	public static UpdateTopicConfigResponse unmarshall(UpdateTopicConfigResponse updateTopicConfigResponse, UnmarshallerContext _ctx) {
		
		updateTopicConfigResponse.setRequestId(_ctx.stringValue("UpdateTopicConfigResponse.RequestId"));
		updateTopicConfigResponse.setSuccess(_ctx.booleanValue("UpdateTopicConfigResponse.Success"));
		updateTopicConfigResponse.setCode(_ctx.stringValue("UpdateTopicConfigResponse.Code"));
		updateTopicConfigResponse.setErrorMessage(_ctx.stringValue("UpdateTopicConfigResponse.ErrorMessage"));
	 
	 	return updateTopicConfigResponse;
	}
}