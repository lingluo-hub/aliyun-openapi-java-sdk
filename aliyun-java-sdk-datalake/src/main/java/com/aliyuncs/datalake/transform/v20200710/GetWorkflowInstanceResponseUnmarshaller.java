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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.GetWorkflowInstanceResponse;
import com.aliyuncs.datalake.model.v20200710.GetWorkflowInstanceResponse.WorkflowInstanceDetail;
import com.aliyuncs.datalake.model.v20200710.GetWorkflowInstanceResponse.WorkflowInstanceDetail.FailedNodeInstance;
import com.aliyuncs.datalake.model.v20200710.GetWorkflowInstanceResponse.WorkflowInstanceDetail.LogItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkflowInstanceResponseUnmarshaller {

	public static GetWorkflowInstanceResponse unmarshall(GetWorkflowInstanceResponse getWorkflowInstanceResponse, UnmarshallerContext _ctx) {
		
		getWorkflowInstanceResponse.setRequestId(_ctx.stringValue("GetWorkflowInstanceResponse.RequestId"));
		getWorkflowInstanceResponse.setSuccess(_ctx.stringValue("GetWorkflowInstanceResponse.Success"));

		WorkflowInstanceDetail workflowInstanceDetail = new WorkflowInstanceDetail();
		workflowInstanceDetail.setFlowInstanceId(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.FlowInstanceId"));
		workflowInstanceDetail.setFlowNodeSize(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.FlowNodeSize"));
		workflowInstanceDetail.setHasFailedNode(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.HasFailedNode"));

		FailedNodeInstance failedNodeInstance = new FailedNodeInstance();
		failedNodeInstance.setNodeInstanceId(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.FailedNodeInstance.NodeInstanceId"));
		failedNodeInstance.setJobName(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.FailedNodeInstance.JobName"));
		failedNodeInstance.setJobType(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.FailedNodeInstance.JobType"));
		failedNodeInstance.setStatus(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.FailedNodeInstance.Status"));
		failedNodeInstance.setExternalId(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.FailedNodeInstance.ExternalId"));
		failedNodeInstance.setExternalInfo(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.FailedNodeInstance.ExternalInfo"));
		workflowInstanceDetail.setFailedNodeInstance(failedNodeInstance);

		List<LogItem> runtimeLogs = new ArrayList<LogItem>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.RuntimeLogs.Length"); i++) {
			LogItem logItem = new LogItem();
			logItem.setInstanceId(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.RuntimeLogs["+ i +"].InstanceId"));
			logItem.setBizTime(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.RuntimeLogs["+ i +"].BizTime"));
			logItem.setLogType(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.RuntimeLogs["+ i +"].LogType"));
			logItem.setLogId(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.RuntimeLogs["+ i +"].LogId"));
			logItem.setLogSummary(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.RuntimeLogs["+ i +"].LogSummary"));
			logItem.setLogContent(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.RuntimeLogs["+ i +"].LogContent"));
			logItem.setTrigger(_ctx.stringValue("GetWorkflowInstanceResponse.WorkflowInstanceDetail.RuntimeLogs["+ i +"].Trigger"));

			runtimeLogs.add(logItem);
		}
		workflowInstanceDetail.setRuntimeLogs(runtimeLogs);
		getWorkflowInstanceResponse.setWorkflowInstanceDetail(workflowInstanceDetail);
	 
	 	return getWorkflowInstanceResponse;
	}
}