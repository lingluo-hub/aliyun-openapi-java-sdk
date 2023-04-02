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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.DescribeSlrResponse;
import com.aliyuncs.eflo.model.v20220530.DescribeSlrResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlrResponseUnmarshaller {

	public static DescribeSlrResponse unmarshall(DescribeSlrResponse describeSlrResponse, UnmarshallerContext _ctx) {
		
		describeSlrResponse.setRequestId(_ctx.stringValue("DescribeSlrResponse.RequestId"));
		describeSlrResponse.setCode(_ctx.integerValue("DescribeSlrResponse.Code"));
		describeSlrResponse.setMessage(_ctx.stringValue("DescribeSlrResponse.Message"));

		Content content = new Content();
		content.setHasRole(_ctx.booleanValue("DescribeSlrResponse.Content.HasRole"));
		describeSlrResponse.setContent(content);
	 
	 	return describeSlrResponse;
	}
}