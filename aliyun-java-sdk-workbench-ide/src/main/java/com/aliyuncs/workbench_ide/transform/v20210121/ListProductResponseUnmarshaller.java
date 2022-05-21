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

import com.aliyuncs.workbench_ide.model.v20210121.ListProductResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductResponseUnmarshaller {

	public static ListProductResponse unmarshall(ListProductResponse listProductResponse, UnmarshallerContext _ctx) {
		
		listProductResponse.setRequestId(_ctx.stringValue("ListProductResponse.RequestId"));
		listProductResponse.setCode(_ctx.stringValue("ListProductResponse.Code"));
		listProductResponse.setMessage(_ctx.stringValue("ListProductResponse.Message"));
		listProductResponse.setTotalPage(_ctx.integerValue("ListProductResponse.TotalPage"));
		listProductResponse.setPageSize(_ctx.integerValue("ListProductResponse.PageSize"));
		listProductResponse.setTotal(_ctx.integerValue("ListProductResponse.Total"));
		listProductResponse.setPage(_ctx.integerValue("ListProductResponse.Page"));

		List<Map<Object, Object>> data = _ctx.listMapValue("ListProductResponse.Data");
		listProductResponse.setData(data);
	 
	 	return listProductResponse;
	}
}