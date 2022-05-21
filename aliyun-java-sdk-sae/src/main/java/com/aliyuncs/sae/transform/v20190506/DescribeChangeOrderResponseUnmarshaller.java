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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeChangeOrderResponse;
import com.aliyuncs.sae.model.v20190506.DescribeChangeOrderResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeChangeOrderResponse.Data.Pipeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChangeOrderResponseUnmarshaller {

	public static DescribeChangeOrderResponse unmarshall(DescribeChangeOrderResponse describeChangeOrderResponse, UnmarshallerContext _ctx) {
		
		describeChangeOrderResponse.setRequestId(_ctx.stringValue("DescribeChangeOrderResponse.RequestId"));
		describeChangeOrderResponse.setMessage(_ctx.stringValue("DescribeChangeOrderResponse.Message"));
		describeChangeOrderResponse.setTraceId(_ctx.stringValue("DescribeChangeOrderResponse.TraceId"));
		describeChangeOrderResponse.setErrorCode(_ctx.stringValue("DescribeChangeOrderResponse.ErrorCode"));
		describeChangeOrderResponse.setCode(_ctx.stringValue("DescribeChangeOrderResponse.Code"));
		describeChangeOrderResponse.setSuccess(_ctx.booleanValue("DescribeChangeOrderResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("DescribeChangeOrderResponse.Data.Status"));
		data.setSubStatus(_ctx.integerValue("DescribeChangeOrderResponse.Data.SubStatus"));
		data.setApprovalId(_ctx.stringValue("DescribeChangeOrderResponse.Data.ApprovalId"));
		data.setErrorMessage(_ctx.stringValue("DescribeChangeOrderResponse.Data.ErrorMessage"));
		data.setBatchWaitTime(_ctx.integerValue("DescribeChangeOrderResponse.Data.BatchWaitTime"));
		data.setCreateTime(_ctx.stringValue("DescribeChangeOrderResponse.Data.CreateTime"));
		data.setBatchCount(_ctx.integerValue("DescribeChangeOrderResponse.Data.BatchCount"));
		data.setCoTypeCode(_ctx.stringValue("DescribeChangeOrderResponse.Data.CoTypeCode"));
		data.setSupportAbortFreeze(_ctx.booleanValue("DescribeChangeOrderResponse.Data.SupportAbortFreeze"));
		data.setSupportRollback(_ctx.booleanValue("DescribeChangeOrderResponse.Data.SupportRollback"));
		data.setChangeOrderId(_ctx.stringValue("DescribeChangeOrderResponse.Data.ChangeOrderId"));
		data.setAppName(_ctx.stringValue("DescribeChangeOrderResponse.Data.AppName"));
		data.setBatchType(_ctx.stringValue("DescribeChangeOrderResponse.Data.BatchType"));
		data.setDescription(_ctx.stringValue("DescribeChangeOrderResponse.Data.Description"));
		data.setCoType(_ctx.stringValue("DescribeChangeOrderResponse.Data.CoType"));
		data.setAuto(_ctx.booleanValue("DescribeChangeOrderResponse.Data.Auto"));
		data.setCurrentPipelineId(_ctx.stringValue("DescribeChangeOrderResponse.Data.CurrentPipelineId"));
		data.setAppId(_ctx.stringValue("DescribeChangeOrderResponse.Data.AppId"));

		List<String> coTargets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChangeOrderResponse.Data.CoTargets.Length"); i++) {
			coTargets.add(_ctx.stringValue("DescribeChangeOrderResponse.Data.CoTargets["+ i +"]"));
		}
		data.setCoTargets(coTargets);

		List<Pipeline> pipelines = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChangeOrderResponse.Data.Pipelines.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setStatus(_ctx.integerValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].Status"));
			pipeline.setStartTime(_ctx.longValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].StartTime"));
			pipeline.setUpdateTime(_ctx.longValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].UpdateTime"));
			pipeline.setBatchType(_ctx.integerValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].BatchType"));
			pipeline.setParallelCount(_ctx.integerValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].ParallelCount"));
			pipeline.setPipelineName(_ctx.stringValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].PipelineName"));
			pipeline.setPipelineId(_ctx.stringValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].PipelineId"));

			pipelines.add(pipeline);
		}
		data.setPipelines(pipelines);
		describeChangeOrderResponse.setData(data);
	 
	 	return describeChangeOrderResponse;
	}
}