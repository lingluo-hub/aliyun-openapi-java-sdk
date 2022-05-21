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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstanceAutoRenewalAttributeResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeInstanceAutoRenewalAttributeResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAutoRenewalAttributeResponseUnmarshaller {

	public static DescribeInstanceAutoRenewalAttributeResponse unmarshall(DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttributeResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAutoRenewalAttributeResponse.setRequestId(_ctx.stringValue("DescribeInstanceAutoRenewalAttributeResponse.RequestId"));
		describeInstanceAutoRenewalAttributeResponse.setPageNumber(_ctx.integerValue("DescribeInstanceAutoRenewalAttributeResponse.PageNumber"));
		describeInstanceAutoRenewalAttributeResponse.setPageRecordCount(_ctx.integerValue("DescribeInstanceAutoRenewalAttributeResponse.PageRecordCount"));
		describeInstanceAutoRenewalAttributeResponse.setTotalRecordCount(_ctx.integerValue("DescribeInstanceAutoRenewalAttributeResponse.TotalRecordCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAutoRenewalAttributeResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setStatus(_ctx.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].Status"));
			item.setDuration(_ctx.integerValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].Duration"));
			item.setDBInstanceId(_ctx.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].DBInstanceId"));
			item.setAutoRenew(_ctx.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].AutoRenew"));
			item.setRegionId(_ctx.stringValue("DescribeInstanceAutoRenewalAttributeResponse.Items["+ i +"].RegionId"));

			items.add(item);
		}
		describeInstanceAutoRenewalAttributeResponse.setItems(items);
	 
	 	return describeInstanceAutoRenewalAttributeResponse;
	}
}