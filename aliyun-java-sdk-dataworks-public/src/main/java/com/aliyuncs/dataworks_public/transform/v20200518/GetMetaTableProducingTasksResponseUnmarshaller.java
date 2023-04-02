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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableProducingTasksResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableProducingTasksResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableProducingTasksResponseUnmarshaller {

	public static GetMetaTableProducingTasksResponse unmarshall(GetMetaTableProducingTasksResponse getMetaTableProducingTasksResponse, UnmarshallerContext _ctx) {
		
		getMetaTableProducingTasksResponse.setRequestId(_ctx.stringValue("GetMetaTableProducingTasksResponse.RequestId"));
		getMetaTableProducingTasksResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTableProducingTasksResponse.HttpStatusCode"));
		getMetaTableProducingTasksResponse.setErrorMessage(_ctx.stringValue("GetMetaTableProducingTasksResponse.ErrorMessage"));
		getMetaTableProducingTasksResponse.setSuccess(_ctx.booleanValue("GetMetaTableProducingTasksResponse.Success"));
		getMetaTableProducingTasksResponse.setErrorCode(_ctx.stringValue("GetMetaTableProducingTasksResponse.ErrorCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableProducingTasksResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTaskId(_ctx.stringValue("GetMetaTableProducingTasksResponse.Data["+ i +"].TaskId"));
			dataItem.setTaskName(_ctx.stringValue("GetMetaTableProducingTasksResponse.Data["+ i +"].TaskName"));

			data.add(dataItem);
		}
		getMetaTableProducingTasksResponse.setData(data);
	 
	 	return getMetaTableProducingTasksResponse;
	}
}