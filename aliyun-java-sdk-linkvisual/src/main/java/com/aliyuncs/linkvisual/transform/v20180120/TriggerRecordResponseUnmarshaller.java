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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.TriggerRecordResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TriggerRecordResponseUnmarshaller {

	public static TriggerRecordResponse unmarshall(TriggerRecordResponse triggerRecordResponse, UnmarshallerContext _ctx) {
		
		triggerRecordResponse.setRequestId(_ctx.stringValue("TriggerRecordResponse.RequestId"));
		triggerRecordResponse.setCode(_ctx.stringValue("TriggerRecordResponse.Code"));
		triggerRecordResponse.setData(_ctx.stringValue("TriggerRecordResponse.Data"));
		triggerRecordResponse.setErrorMessage(_ctx.stringValue("TriggerRecordResponse.ErrorMessage"));
		triggerRecordResponse.setSuccess(_ctx.booleanValue("TriggerRecordResponse.Success"));
	 
	 	return triggerRecordResponse;
	}
}