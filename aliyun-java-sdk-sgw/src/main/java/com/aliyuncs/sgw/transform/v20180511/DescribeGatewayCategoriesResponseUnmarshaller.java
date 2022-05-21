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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayCategoriesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayCategoriesResponseUnmarshaller {

	public static DescribeGatewayCategoriesResponse unmarshall(DescribeGatewayCategoriesResponse describeGatewayCategoriesResponse, UnmarshallerContext _ctx) {
		
		describeGatewayCategoriesResponse.setRequestId(_ctx.stringValue("DescribeGatewayCategoriesResponse.RequestId"));
		describeGatewayCategoriesResponse.setMessage(_ctx.stringValue("DescribeGatewayCategoriesResponse.Message"));
		describeGatewayCategoriesResponse.setCategories(_ctx.stringValue("DescribeGatewayCategoriesResponse.Categories"));
		describeGatewayCategoriesResponse.setCode(_ctx.stringValue("DescribeGatewayCategoriesResponse.Code"));
		describeGatewayCategoriesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayCategoriesResponse.Success"));
	 
	 	return describeGatewayCategoriesResponse;
	}
}