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

import com.aliyuncs.dataworks_public.model.v20200518.ListInstancesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListInstancesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListInstancesResponse.Data.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesResponse.HttpStatusCode"));
		listInstancesResponse.setErrorMessage(_ctx.stringValue("ListInstancesResponse.ErrorMessage"));
		listInstancesResponse.setErrorCode(_ctx.stringValue("ListInstancesResponse.ErrorCode"));
		listInstancesResponse.setSuccess(_ctx.booleanValue("ListInstancesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListInstancesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListInstancesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListInstancesResponse.Data.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Data.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setStatus(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].Status"));
			instance.setCycTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].CycTime"));
			instance.setBeginRunningTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].BeginRunningTime"));
			instance.setFinishTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].FinishTime"));
			instance.setErrorMessage(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].ErrorMessage"));
			instance.setCreateTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].CreateTime"));
			instance.setDagId(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].DagId"));
			instance.setPriority(_ctx.integerValue("ListInstancesResponse.Data.Instances["+ i +"].Priority"));
			instance.setTaskType(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].TaskType"));
			instance.setParamValues(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].ParamValues"));
			instance.setConnection(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].Connection"));
			instance.setBaselineId(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].BaselineId"));
			instance.setDqcType(_ctx.integerValue("ListInstancesResponse.Data.Instances["+ i +"].DqcType"));
			instance.setDagType(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].DagType"));
			instance.setBusinessId(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].BusinessId"));
			instance.setTaskRerunTime(_ctx.integerValue("ListInstancesResponse.Data.Instances["+ i +"].TaskRerunTime"));
			instance.setModifyTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].ModifyTime"));
			instance.setRepeatability(_ctx.booleanValue("ListInstancesResponse.Data.Instances["+ i +"].Repeatability"));
			instance.setRepeatInterval(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].RepeatInterval"));
			instance.setInstanceId(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].InstanceId"));
			instance.setBeginWaitResTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].BeginWaitResTime"));
			instance.setRelatedFlowId(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].RelatedFlowId"));
			instance.setBizdate(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].Bizdate"));
			instance.setNodeName(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].NodeName"));
			instance.setBeginWaitTimeTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].BeginWaitTimeTime"));
			instance.setDqcDescription(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].DqcDescription"));
			instance.setNodeId(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].NodeId"));
			instance.setCreateUser(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].CreateUser"));

			instances.add(instance);
		}
		data.setInstances(instances);
		listInstancesResponse.setData(data);
	 
	 	return listInstancesResponse;
	}
}