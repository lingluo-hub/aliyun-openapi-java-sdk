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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.HandleSecurityEventsResponse;
import com.aliyuncs.sas.model.v20181203.HandleSecurityEventsResponse.HandleSecurityEventsResponse1;
import com.aliyuncs.transform.UnmarshallerContext;


public class HandleSecurityEventsResponseUnmarshaller {

	public static HandleSecurityEventsResponse unmarshall(HandleSecurityEventsResponse handleSecurityEventsResponse, UnmarshallerContext _ctx) {
		
		handleSecurityEventsResponse.setRequestId(_ctx.stringValue("HandleSecurityEventsResponse.RequestId"));

		HandleSecurityEventsResponse1 handleSecurityEventsResponse1 = new HandleSecurityEventsResponse1();
		handleSecurityEventsResponse1.setTaskId(_ctx.longValue("HandleSecurityEventsResponse.HandleSecurityEventsResponse.TaskId"));
		handleSecurityEventsResponse.setHandleSecurityEventsResponse1(handleSecurityEventsResponse1);
	 
	 	return handleSecurityEventsResponse;
	}
}