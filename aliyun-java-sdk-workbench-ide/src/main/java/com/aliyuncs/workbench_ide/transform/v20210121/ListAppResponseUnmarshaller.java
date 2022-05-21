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

package com.aliyuncs.workbench_ide.transform.v20210121;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workbench_ide.model.v20210121.ListAppResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppResponseUnmarshaller {

	public static ListAppResponse unmarshall(ListAppResponse listAppResponse, UnmarshallerContext _ctx) {
		
		listAppResponse.setRequestId(_ctx.stringValue("ListAppResponse.RequestId"));
		listAppResponse.setCode(_ctx.stringValue("ListAppResponse.Code"));
		listAppResponse.setMessage(_ctx.stringValue("ListAppResponse.Message"));
		listAppResponse.setTotalPage(_ctx.integerValue("ListAppResponse.TotalPage"));
		listAppResponse.setPageSize(_ctx.integerValue("ListAppResponse.PageSize"));
		listAppResponse.setTotal(_ctx.integerValue("ListAppResponse.Total"));
		listAppResponse.setPage(_ctx.integerValue("ListAppResponse.Page"));

		List<Map<Object, Object>> data = _ctx.listMapValue("ListAppResponse.Data");
		listAppResponse.setData(data);
	 
	 	return listAppResponse;
	}
}