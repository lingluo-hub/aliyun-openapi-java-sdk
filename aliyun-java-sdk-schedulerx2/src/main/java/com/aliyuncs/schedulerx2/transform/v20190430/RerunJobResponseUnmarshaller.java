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

package com.aliyuncs.schedulerx2.transform.v20190430;

import com.aliyuncs.schedulerx2.model.v20190430.RerunJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RerunJobResponseUnmarshaller {

	public static RerunJobResponse unmarshall(RerunJobResponse rerunJobResponse, UnmarshallerContext _ctx) {
		
		rerunJobResponse.setRequestId(_ctx.stringValue("RerunJobResponse.RequestId"));
		rerunJobResponse.setCode(_ctx.integerValue("RerunJobResponse.Code"));
		rerunJobResponse.setSuccess(_ctx.booleanValue("RerunJobResponse.Success"));
		rerunJobResponse.setMessage(_ctx.stringValue("RerunJobResponse.Message"));
	 
	 	return rerunJobResponse;
	}
}