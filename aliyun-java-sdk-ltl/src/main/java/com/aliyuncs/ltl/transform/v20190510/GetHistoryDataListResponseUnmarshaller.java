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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.GetHistoryDataListResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHistoryDataListResponseUnmarshaller {

	public static GetHistoryDataListResponse unmarshall(GetHistoryDataListResponse getHistoryDataListResponse, UnmarshallerContext _ctx) {
		
		getHistoryDataListResponse.setRequestId(_ctx.stringValue("GetHistoryDataListResponse.RequestId"));
		getHistoryDataListResponse.setCode(_ctx.integerValue("GetHistoryDataListResponse.Code"));
		getHistoryDataListResponse.setMessage(_ctx.stringValue("GetHistoryDataListResponse.Message"));
		getHistoryDataListResponse.setSuccess(_ctx.booleanValue("GetHistoryDataListResponse.Success"));

		List<Map<Object, Object>> data = _ctx.listMapValue("GetHistoryDataListResponse.Data");
		getHistoryDataListResponse.setData(data);
	 
	 	return getHistoryDataListResponse;
	}
}