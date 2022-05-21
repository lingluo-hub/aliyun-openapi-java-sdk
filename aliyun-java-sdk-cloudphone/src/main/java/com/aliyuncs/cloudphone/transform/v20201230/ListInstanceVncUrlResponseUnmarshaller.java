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

package com.aliyuncs.cloudphone.transform.v20201230;

import com.aliyuncs.cloudphone.model.v20201230.ListInstanceVncUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceVncUrlResponseUnmarshaller {

	public static ListInstanceVncUrlResponse unmarshall(ListInstanceVncUrlResponse listInstanceVncUrlResponse, UnmarshallerContext _ctx) {
		
		listInstanceVncUrlResponse.setRequestId(_ctx.stringValue("ListInstanceVncUrlResponse.RequestId"));
		listInstanceVncUrlResponse.setVncUrl(_ctx.stringValue("ListInstanceVncUrlResponse.VncUrl"));
		listInstanceVncUrlResponse.setWebRtcToken(_ctx.stringValue("ListInstanceVncUrlResponse.WebRtcToken"));
	 
	 	return listInstanceVncUrlResponse;
	}
}