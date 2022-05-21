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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.ResetSynchronizationJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetSynchronizationJobResponseUnmarshaller {

	public static ResetSynchronizationJobResponse unmarshall(ResetSynchronizationJobResponse resetSynchronizationJobResponse, UnmarshallerContext _ctx) {
		
		resetSynchronizationJobResponse.setRequestId(_ctx.stringValue("ResetSynchronizationJobResponse.RequestId"));
		resetSynchronizationJobResponse.setErrCode(_ctx.stringValue("ResetSynchronizationJobResponse.ErrCode"));
		resetSynchronizationJobResponse.setSuccess(_ctx.stringValue("ResetSynchronizationJobResponse.Success"));
		resetSynchronizationJobResponse.setErrMessage(_ctx.stringValue("ResetSynchronizationJobResponse.ErrMessage"));
	 
	 	return resetSynchronizationJobResponse;
	}
}