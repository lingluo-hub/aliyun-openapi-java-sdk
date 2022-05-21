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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListServiceConnectionsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceConnectionsResponseUnmarshaller {

	public static ListServiceConnectionsResponse unmarshall(ListServiceConnectionsResponse listServiceConnectionsResponse, UnmarshallerContext _ctx) {
		
		listServiceConnectionsResponse.setRequestId(_ctx.stringValue("ListServiceConnectionsResponse.RequestId"));
		listServiceConnectionsResponse.setErrorMessage(_ctx.stringValue("ListServiceConnectionsResponse.ErrorMessage"));
		listServiceConnectionsResponse.setSuccess(_ctx.booleanValue("ListServiceConnectionsResponse.Success"));
		listServiceConnectionsResponse.setErrorCode(_ctx.stringValue("ListServiceConnectionsResponse.ErrorCode"));

		List<Map<Object, Object>> object = _ctx.listMapValue("ListServiceConnectionsResponse.Object");
		listServiceConnectionsResponse.setObject(object);
	 
	 	return listServiceConnectionsResponse;
	}
}