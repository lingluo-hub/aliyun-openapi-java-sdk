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

package com.aliyuncs.tdsr.transform.v20200101;

import com.aliyuncs.tdsr.model.v20200101.GetHotspotTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotspotTagResponseUnmarshaller {

	public static GetHotspotTagResponse unmarshall(GetHotspotTagResponse getHotspotTagResponse, UnmarshallerContext _ctx) {
		
		getHotspotTagResponse.setRequestId(_ctx.stringValue("GetHotspotTagResponse.RequestId"));
		getHotspotTagResponse.setSuccess(_ctx.booleanValue("GetHotspotTagResponse.Success"));
		getHotspotTagResponse.setErrMessage(_ctx.stringValue("GetHotspotTagResponse.ErrMessage"));
		getHotspotTagResponse.setData(_ctx.stringValue("GetHotspotTagResponse.Data"));
		getHotspotTagResponse.setObjectString(_ctx.stringValue("GetHotspotTagResponse.ObjectString"));
	 
	 	return getHotspotTagResponse;
	}
}