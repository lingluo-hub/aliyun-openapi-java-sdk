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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainBlockV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainBlockV2Response.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainBlockV2Response.Result.TransSummaryListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainBlockV2ResponseUnmarshaller {

	public static DescribeAntChainBlockV2Response unmarshall(DescribeAntChainBlockV2Response describeAntChainBlockV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainBlockV2Response.setRequestId(_ctx.stringValue("DescribeAntChainBlockV2Response.RequestId"));
		describeAntChainBlockV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainBlockV2Response.HttpStatusCode"));
		describeAntChainBlockV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainBlockV2Response.Success"));
		describeAntChainBlockV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainBlockV2Response.ResultMessage"));
		describeAntChainBlockV2Response.setCode(_ctx.stringValue("DescribeAntChainBlockV2Response.Code"));
		describeAntChainBlockV2Response.setMessage(_ctx.stringValue("DescribeAntChainBlockV2Response.Message"));
		describeAntChainBlockV2Response.setResultCode(_ctx.stringValue("DescribeAntChainBlockV2Response.ResultCode"));

		Result result = new Result();
		result.setPreviousHash(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.PreviousHash"));
		result.setVersion(_ctx.longValue("DescribeAntChainBlockV2Response.Result.Version"));
		result.setRootTxHash(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.RootTxHash"));
		result.setCreateTime(_ctx.longValue("DescribeAntChainBlockV2Response.Result.CreateTime"));
		result.setTransactionSize(_ctx.integerValue("DescribeAntChainBlockV2Response.Result.TransactionSize"));
		result.setHeight(_ctx.integerValue("DescribeAntChainBlockV2Response.Result.Height"));
		result.setBlockHash(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.BlockHash"));
		result.setAntChainId(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.AntChainId"));

		List<TransSummaryListItem> transSummaryList = new ArrayList<TransSummaryListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainBlockV2Response.Result.TransSummaryList.Length"); i++) {
			TransSummaryListItem transSummaryListItem = new TransSummaryListItem();
			transSummaryListItem.setHash(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].Hash"));
			transSummaryListItem.setFrom(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].From"));
			transSummaryListItem.setTransTypeV10(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].TransTypeV10"));
			transSummaryListItem.setCreateTime(_ctx.longValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].CreateTime"));
			transSummaryListItem.setTransTypeV6(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].TransTypeV6"));
			transSummaryListItem.setHeight(_ctx.longValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].Height"));
			transSummaryListItem.setTo(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].To"));
			transSummaryListItem.setGasUsed(_ctx.longValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].GasUsed"));
			transSummaryListItem.setBlockHash(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].BlockHash"));
			transSummaryListItem.setReferenceCount(_ctx.integerValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].ReferenceCount"));
			transSummaryListItem.setCategory(_ctx.integerValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].Category"));
			transSummaryListItem.setAlias(_ctx.stringValue("DescribeAntChainBlockV2Response.Result.TransSummaryList["+ i +"].Alias"));

			transSummaryList.add(transSummaryListItem);
		}
		result.setTransSummaryList(transSummaryList);
		describeAntChainBlockV2Response.setResult(result);
	 
	 	return describeAntChainBlockV2Response;
	}
}