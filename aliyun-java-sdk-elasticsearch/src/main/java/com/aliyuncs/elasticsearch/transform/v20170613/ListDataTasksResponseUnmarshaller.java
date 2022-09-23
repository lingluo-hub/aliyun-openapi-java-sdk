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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListDataTasksResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListDataTasksResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.ListDataTasksResponse.ResultItem.SinkCluster;
import com.aliyuncs.elasticsearch.model.v20170613.ListDataTasksResponse.ResultItem.SourceCluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataTasksResponseUnmarshaller {

	public static ListDataTasksResponse unmarshall(ListDataTasksResponse listDataTasksResponse, UnmarshallerContext _ctx) {
		
		listDataTasksResponse.setRequestId(_ctx.stringValue("ListDataTasksResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataTasksResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreateTime(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].createTime"));
			resultItem.setTaskId(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].taskId"));
			resultItem.setStatus(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].status"));

			SinkCluster sinkCluster = new SinkCluster();
			sinkCluster.setIndex(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sinkCluster.index"));
			sinkCluster.setType(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sinkCluster.type"));
			sinkCluster.setEndpoint(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sinkCluster.endpoint"));
			sinkCluster.setVpcId(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sinkCluster.vpcId"));
			sinkCluster.setVpcInstancePort(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sinkCluster.vpcInstancePort"));
			sinkCluster.setVpcInstanceId(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sinkCluster.vpcInstanceId"));
			sinkCluster.setDataSourceType(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sinkCluster.dataSourceType"));
			resultItem.setSinkCluster(sinkCluster);

			SourceCluster sourceCluster = new SourceCluster();
			sourceCluster.setIndex(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sourceCluster.index"));
			sourceCluster.setSettings(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sourceCluster.settings"));
			sourceCluster.setMapping(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sourceCluster.mapping"));
			sourceCluster.setType(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sourceCluster.type"));
			sourceCluster.setRouting(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sourceCluster.routing"));
			sourceCluster.setDataSourceType(_ctx.stringValue("ListDataTasksResponse.Result["+ i +"].sourceCluster.dataSourceType"));
			resultItem.setSourceCluster(sourceCluster);

			result.add(resultItem);
		}
		listDataTasksResponse.setResult(result);
	 
	 	return listDataTasksResponse;
	}
}