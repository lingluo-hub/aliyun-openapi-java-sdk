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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.BatchCreateInstantSiteMonitorResponse;
import com.aliyuncs.cms.model.v20190101.BatchCreateInstantSiteMonitorResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateInstantSiteMonitorResponseUnmarshaller {

	public static BatchCreateInstantSiteMonitorResponse unmarshall(BatchCreateInstantSiteMonitorResponse batchCreateInstantSiteMonitorResponse, UnmarshallerContext _ctx) {
		
		batchCreateInstantSiteMonitorResponse.setRequestId(_ctx.stringValue("BatchCreateInstantSiteMonitorResponse.RequestId"));
		batchCreateInstantSiteMonitorResponse.setMessage(_ctx.stringValue("BatchCreateInstantSiteMonitorResponse.Message"));
		batchCreateInstantSiteMonitorResponse.setSuccess(_ctx.booleanValue("BatchCreateInstantSiteMonitorResponse.Success"));
		batchCreateInstantSiteMonitorResponse.setCode(_ctx.stringValue("BatchCreateInstantSiteMonitorResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchCreateInstantSiteMonitorResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTaskName(_ctx.stringValue("BatchCreateInstantSiteMonitorResponse.Data["+ i +"].TaskName"));
			dataItem.setTaskId(_ctx.stringValue("BatchCreateInstantSiteMonitorResponse.Data["+ i +"].TaskId"));

			data.add(dataItem);
		}
		batchCreateInstantSiteMonitorResponse.setData(data);
	 
	 	return batchCreateInstantSiteMonitorResponse;
	}
}