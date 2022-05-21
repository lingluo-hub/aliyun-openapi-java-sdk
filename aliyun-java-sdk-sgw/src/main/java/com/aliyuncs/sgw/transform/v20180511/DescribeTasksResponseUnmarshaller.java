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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeTasksResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeTasksResponse.SimpleTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTasksResponseUnmarshaller {

	public static DescribeTasksResponse unmarshall(DescribeTasksResponse describeTasksResponse, UnmarshallerContext _ctx) {
		
		describeTasksResponse.setRequestId(_ctx.stringValue("DescribeTasksResponse.RequestId"));
		describeTasksResponse.setTotalCount(_ctx.integerValue("DescribeTasksResponse.TotalCount"));
		describeTasksResponse.setMessage(_ctx.stringValue("DescribeTasksResponse.Message"));
		describeTasksResponse.setPageSize(_ctx.integerValue("DescribeTasksResponse.PageSize"));
		describeTasksResponse.setPageNumber(_ctx.integerValue("DescribeTasksResponse.PageNumber"));
		describeTasksResponse.setCode(_ctx.stringValue("DescribeTasksResponse.Code"));
		describeTasksResponse.setSuccess(_ctx.booleanValue("DescribeTasksResponse.Success"));

		List<SimpleTask> tasks = new ArrayList<SimpleTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTasksResponse.Tasks.Length"); i++) {
			SimpleTask simpleTask = new SimpleTask();
			simpleTask.setStateCode(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].StateCode"));
			simpleTask.setProgress(_ctx.integerValue("DescribeTasksResponse.Tasks["+ i +"].Progress"));
			simpleTask.setMessageParams(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].MessageParams"));
			simpleTask.setUpdatedTime(_ctx.longValue("DescribeTasksResponse.Tasks["+ i +"].UpdatedTime"));
			simpleTask.setMessageKey(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].MessageKey"));
			simpleTask.setName(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].Name"));
			simpleTask.setStageCode(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].StageCode"));
			simpleTask.setCreatedTime(_ctx.longValue("DescribeTasksResponse.Tasks["+ i +"].CreatedTime"));
			simpleTask.setTaskId(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].TaskId"));
			simpleTask.setRelatedResourceId(_ctx.stringValue("DescribeTasksResponse.Tasks["+ i +"].RelatedResourceId"));

			tasks.add(simpleTask);
		}
		describeTasksResponse.setTasks(tasks);
	 
	 	return describeTasksResponse;
	}
}