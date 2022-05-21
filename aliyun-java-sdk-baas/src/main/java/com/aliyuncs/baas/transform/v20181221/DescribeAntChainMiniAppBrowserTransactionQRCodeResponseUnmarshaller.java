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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserTransactionQRCodeResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMiniAppBrowserTransactionQRCodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainMiniAppBrowserTransactionQRCodeResponseUnmarshaller {

	public static DescribeAntChainMiniAppBrowserTransactionQRCodeResponse unmarshall(DescribeAntChainMiniAppBrowserTransactionQRCodeResponse describeAntChainMiniAppBrowserTransactionQRCodeResponse, UnmarshallerContext _ctx) {
		
		describeAntChainMiniAppBrowserTransactionQRCodeResponse.setRequestId(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeResponse.RequestId"));

		Result result = new Result();
		result.setBase64QRCodePNG(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeResponse.Result.Base64QRCodePNG"));
		result.setTransactionHash(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeResponse.Result.TransactionHash"));
		result.setQRCodeContent(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeResponse.Result.QRCodeContent"));
		result.setAntChainId(_ctx.stringValue("DescribeAntChainMiniAppBrowserTransactionQRCodeResponse.Result.AntChainId"));
		describeAntChainMiniAppBrowserTransactionQRCodeResponse.setResult(result);
	 
	 	return describeAntChainMiniAppBrowserTransactionQRCodeResponse;
	}
}