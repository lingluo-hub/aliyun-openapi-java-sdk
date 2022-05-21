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

package com.aliyuncs.iotsoc.transform.v20190815;

import com.aliyuncs.iotsoc.model.v20190815.GetDeviceRankSummaryResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceRankSummaryResponseUnmarshaller {

	public static GetDeviceRankSummaryResponse unmarshall(GetDeviceRankSummaryResponse getDeviceRankSummaryResponse, UnmarshallerContext _ctx) {
		
		getDeviceRankSummaryResponse.setRequestId(_ctx.stringValue("GetDeviceRankSummaryResponse.RequestId"));
		getDeviceRankSummaryResponse.setSuccess(_ctx.booleanValue("GetDeviceRankSummaryResponse.Success"));
		getDeviceRankSummaryResponse.setCode(_ctx.stringValue("GetDeviceRankSummaryResponse.Code"));
		getDeviceRankSummaryResponse.setMessage(_ctx.stringValue("GetDeviceRankSummaryResponse.Message"));
		getDeviceRankSummaryResponse.setData(_ctx.mapValue("GetDeviceRankSummaryResponse.Data"));
	 
	 	return getDeviceRankSummaryResponse;
	}
}