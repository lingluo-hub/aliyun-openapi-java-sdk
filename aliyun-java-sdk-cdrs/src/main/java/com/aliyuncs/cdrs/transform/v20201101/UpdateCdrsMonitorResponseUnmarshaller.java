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

import com.aliyuncs.cdrs.model.v20201101.UpdateCdrsMonitorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCdrsMonitorResponseUnmarshaller {

	public static UpdateCdrsMonitorResponse unmarshall(UpdateCdrsMonitorResponse updateCdrsMonitorResponse, UnmarshallerContext _ctx) {
		
		updateCdrsMonitorResponse.setRequestId(_ctx.stringValue("UpdateCdrsMonitorResponse.RequestId"));
		updateCdrsMonitorResponse.setCode(_ctx.stringValue("UpdateCdrsMonitorResponse.Code"));
		updateCdrsMonitorResponse.setData(_ctx.stringValue("UpdateCdrsMonitorResponse.Data"));
		updateCdrsMonitorResponse.setMessage(_ctx.stringValue("UpdateCdrsMonitorResponse.Message"));
	 
	 	return updateCdrsMonitorResponse;
	}
}