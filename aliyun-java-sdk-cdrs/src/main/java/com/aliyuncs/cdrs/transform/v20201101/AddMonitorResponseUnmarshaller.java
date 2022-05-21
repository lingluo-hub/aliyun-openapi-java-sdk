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

package com.aliyuncs.cdrs.transform.v20201101;

import com.aliyuncs.cdrs.model.v20201101.AddMonitorResponse;
import com.aliyuncs.cdrs.model.v20201101.AddMonitorResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMonitorResponseUnmarshaller {

	public static AddMonitorResponse unmarshall(AddMonitorResponse addMonitorResponse, UnmarshallerContext _ctx) {
		
		addMonitorResponse.setRequestId(_ctx.stringValue("AddMonitorResponse.RequestId"));
		addMonitorResponse.setCode(_ctx.stringValue("AddMonitorResponse.Code"));
		addMonitorResponse.setMessage(_ctx.stringValue("AddMonitorResponse.Message"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("AddMonitorResponse.Data.TaskId"));
		addMonitorResponse.setData(data);
	 
	 	return addMonitorResponse;
	}
}