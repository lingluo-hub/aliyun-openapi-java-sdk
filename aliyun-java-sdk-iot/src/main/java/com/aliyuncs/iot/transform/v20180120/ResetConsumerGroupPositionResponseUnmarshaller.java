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

import com.aliyuncs.iot.model.v20180120.ResetConsumerGroupPositionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetConsumerGroupPositionResponseUnmarshaller {

	public static ResetConsumerGroupPositionResponse unmarshall(ResetConsumerGroupPositionResponse resetConsumerGroupPositionResponse, UnmarshallerContext _ctx) {
		
		resetConsumerGroupPositionResponse.setRequestId(_ctx.stringValue("ResetConsumerGroupPositionResponse.RequestId"));
		resetConsumerGroupPositionResponse.setSuccess(_ctx.booleanValue("ResetConsumerGroupPositionResponse.Success"));
		resetConsumerGroupPositionResponse.setErrorMessage(_ctx.stringValue("ResetConsumerGroupPositionResponse.ErrorMessage"));
		resetConsumerGroupPositionResponse.setCode(_ctx.stringValue("ResetConsumerGroupPositionResponse.Code"));
	 
	 	return resetConsumerGroupPositionResponse;
	}
}